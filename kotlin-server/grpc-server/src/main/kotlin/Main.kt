package ru.spbu.pt.bd.grpc

import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import java.util.*
import java.util.ArrayList


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

    override fun getFactorization(request: FactorRequest, responseObserver: StreamObserver<FactorResponse>) {
        println(request.number)

        var N: Long = request.number;
        val factors = ArrayList<Long>();
        var i: Long = 2;

        if (N > 3) {
            while (true) {
                while (N % i == 0.toLong()) {
                    factors.add(i);
                    N /= i;
                }
                if (i * i >= N) break;
                ++i
            }
        }

        factors.add(N)

        var factorizedString = StringBuilder();
        factorizedString.append(request.number);
        for (num in factors) {
            factorizedString.append("\t" + num);
        }

        val response = FactorResponse.newBuilder()
                .setFormattedFactorized(factorizedString.toString())
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