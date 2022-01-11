package com.labb_1.classes;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.labb_1.models.TypeCode;
import com.labb_1.utils.CoapParser;

public class UDPClient {
    private DatagramSocket socket;
    private InetAddress adress;
    private CoapParser coapParser = new CoapParser();
    private byte[] sendBuffer;
    private byte[] receiveBuffer;
    public UDPClient(){
        try {
            adress = InetAddress.getByName("coap.me");
            socket = new DatagramSocket();
            socket.connect(adress, 5683);
        } catch (SocketException | UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }     
    }

    public void sendMessage() {

                                //Header     //Type      //M  E S S A G E   |   //Options       
        byte [] sendBuffer = {(byte)0x40 , (byte)0x01, (byte)0x04, (byte)0xd2, (byte)0xb4, (byte)0x74, (byte)0x65, (byte)0x73, (byte)0x74};
        DatagramPacket sendPayload = new DatagramPacket(sendBuffer, sendBuffer.length);

        
        try {
            socket.send(sendPayload);
            byte[] sendBuffer2 = new byte[512];
            DatagramPacket responsePayload = new DatagramPacket(sendBuffer2, sendBuffer2.length);
            socket.receive(responsePayload);
            coapParser.parseMessage(responsePayload.getData(), responsePayload.getLength());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
