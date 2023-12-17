package org.example.client.service;

import com.google.protobuf.Descriptors;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.Client;
import org.example.HotelAgencyServiceGrpc;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HotelAgencyClientService {

    @GrpcClient("grpc-example-service")
    HotelAgencyServiceGrpc.HotelAgencyServiceBlockingStub synchronousClient;

    @GrpcClient("grpc-example-service")
    HotelAgencyServiceGrpc.HotelAgencyServiceStub asynchronousClient;

    public Map<Descriptors.FieldDescriptor, Object> getClient(int clientId) {
        Client clientRequest = Client.newBuilder().setId(clientId).build();
        Client clientResponse = synchronousClient.getClient(clientRequest);
        return clientResponse.getAllFields();
    }


}
