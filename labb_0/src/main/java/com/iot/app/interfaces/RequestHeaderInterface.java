package com.iot.app.interfaces;

public interface RequestHeaderInterface {

    public void setRequestType(String requestType);

    public String getRequestType();

    public void setHost(String host);

    public String getHost();

    public void setConnectionType(String connectionType);

    public String getConnectionType();

    public void setConnectionLength(String connectionLength);

    public String getConnectionLength();

}