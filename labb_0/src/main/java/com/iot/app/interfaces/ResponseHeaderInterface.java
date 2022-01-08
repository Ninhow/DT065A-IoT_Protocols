package com.iot.app.interfaces;

import java.time.LocalDate;

public interface ResponseHeaderInterface {
    public String getStatus();

    public void setStatus(String status);

    public String getProtocol();

    public void setProtocol(String protocol);

    public LocalDate generateDate();

    public String getContentType();

    public void setContentType(String contentType);
}
