package com.labb_1.interfaces;

import java.util.Map;

public interface CoapParserInterface{
    Map<String, String> parseMessage(byte[] message);
    String getContentCode(byte[] message);
    String getMethodCode(byte[] message);
    String getOptionCode(byte[] message);
    String getResponseCode(byte[] message);
    String getTypeCode(byte[] message);

}
