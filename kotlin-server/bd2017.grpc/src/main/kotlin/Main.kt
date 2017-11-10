package ru.spbu.pt.bd.grpc

import io.grpc.ManagedChannelBuilder
import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import java.util.*

class SampleService(): SampleServiceGrpc.SampleServiceImplBase() {

    override fun getSystemInfo(request: InfoRequest, responseObserver: StreamObserver<InfoResponse>) {
        println(request.printMe)

        val response = InfoResponse.newBuilder()
                .setSystemName(System.getProperty("os.name"))
                .setTime(Date().toString())
                .build()

        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }
}

fun main(args: Array<String>) {
    val server = ServerBuilder
            .forPort(5757)
            .addService(SampleService())
            .build()
    server.start()

    println("Simple grpc service started")

    server.awaitTermination()

    println("Simple grpc service stopped")
}