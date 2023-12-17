package org.example.server;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.Client;
import org.example.DB;
import org.example.HotelAgencyServiceGrpc;

@GrpcService
public class HotelAgencyServerService extends HotelAgencyServiceGrpc.HotelAgencyServiceImplBase {

    @Override
    public void getClient(Client request, StreamObserver<Client> responseObserver) {
        DB.getClientsFromDB()
                .stream()
                .filter(author -> author.getId() == request.getId())
                .findFirst()
                .ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();
    }

}
