package com.iot.app.classes;

import java.time.LocalDate;

import com.iot.app.interfaces.ResponseHeaderInterface;

public class ResponseHeader implements ResponseHeaderInterface {
    private LocalDate date;
    private String contentType;
    private String status;
    private String protocol;

    public ResponseHeader(String contentType, String status, String protocol) {
        this.date = generateDate();
        this.contentType = contentType;
        this.status = status;
        this.protocol = protocol;
    }

    @Override
    public LocalDate generateDate() {
        return LocalDate.now();
    }

    @Override
    public String getContentType() {
        return this.contentType;
    }

    @Override
    public String getProtocol() {
        return this.protocol;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

}
