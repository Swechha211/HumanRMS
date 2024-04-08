package com.example.HumanRMS.endpoint;

import com.grpc.AuthServiceGrpc;
import com.grpc.Schema;
import io.grpc.stub.StreamObserver;

public class AuthServiceImpl extends AuthServiceGrpc.AuthServiceImplBase {

    @Override
    public void register(Schema.StaffRequest request, StreamObserver<Schema.StaffResponse> responseObserver) {
        super.register(request, responseObserver);
    }

    @Override
    public void login(Schema.LoginRequest request, StreamObserver<Schema.LoginResponse> responseObserver) {
        super.login(request, responseObserver);
    }
}
