package com.labb_1.utils;

import java.io.PrintWriter;
import java.util.BitSet;
import java.util.Map;

import com.labb_1.interfaces.CoapParserInterface;
import com.labb_1.models.ResponseCode;
import com.labb_1.models.TypeCode;

public class CoapParser implements CoapParserInterface{

    @Override
    public Map<String, String> parseMessage(byte[] message) {
        
        System.out.println("Type: " + TypeCode.CodeName(Integer.parseInt((Integer.toBinaryString((message[0] & 0xFF) + 0x100).substring(1)).substring(2, 4), 2)));
        System.out.println("Token Length: " + Integer.parseInt((Integer.toBinaryString((message[0] & 0xFF) + 0x100).substring(1)).substring(4, 7), 2));
        System.out.println("Request Code: " + ResponseCode.CodeName(Integer.parseInt((Integer.toBinaryString((message[1] & 0xFF) + 0x100).substring(1)), 2)));
        String id = Integer.toBinaryString((message[2] & 0xFF) + 0x100).substring(1) + (Integer.toBinaryString((message[3] & 0xFF) + 0x100).substring(1));
        System.out.println("Message ID: " + Integer.parseInt(id, 2));
        
        for ( int i = 4; i < message.length; i++){
            String representation = Integer.toBinaryString((message[i] & 0xFF) + 0x100).substring(1);
            if(message[i] == -1){
                System.out.println("OPTIONS OVER");
            }
            System.out.print(representation);
            System.out.print(" ->> ");
            System.out.print(Integer.parseInt(representation, 2));
            System.out.print("  -- ");
            
        }
        return null;
    }

    @Override
    public String getContentCode(byte[] message) {
        
        return null;
    }

    @Override
    public String getMethodCode(byte[] message) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getOptionCode(byte[] message) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getResponseCode(byte[] message) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTypeCode(byte[] message) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
