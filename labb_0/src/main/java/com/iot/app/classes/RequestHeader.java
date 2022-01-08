package com.iot.app.classes;

import com.iot.app.interfaces.RequestHeaderInterface;

public class RequestHeader implements RequestHeaderInterface {

    private String requestType;
    private String host;
    private String connectionType;
    private String connectionLength;
    private String path;
    private String protocol;

    public RequestHeader(String requestType, String host, String connectionType, String connectionLength, String path,
            String protocol) {
        this.requestType = requestType;
        this.host = host;
        this.connectionType = connectionType;
        this.connectionLength = connectionLength;
        this.path = path;
        this.protocol = protocol;
    }

    @Override
    public void setRequestType(String requestType) {
        this.requestType = requestType;

    }

    @Override
    public String getRequestType() {
        return this.requestType;
    }

    @Override
    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String getHost() {
        return this.host;
    }

    @Override
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String getConnectionType() {
        return this.connectionType;
    }

    @Override
    public void setConnectionLength(String connectionLength) {
        this.connectionLength = connectionLength;
    }

    @Override
    public String getConnectionLength() {
        return this.connectionLength;
    }

    @Override
    public String toString() {
        return "Request-Type: " + this.requestType + "\n" + "Host: " + this.host + "\n" + "Connection-type: "
                + this.connectionType + "\n" + "Connection-length: " + this.connectionLength;
    }

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String getProtocol() {
        return this.protocol;
    }

    @Override
    public void setProtocol(String protocol) {
        this.protocol = protocol;

    }

}
