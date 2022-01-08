package com.mqtt.classes;

import java.io.*;
import java.net.*;

public class Client extends Thread {
    final Broker broker;
    final DataInputStream dis;
    final DataOutputStream dos;
    final Socket s;
    byte[] buffer;

    public Client(Socket s, DataInputStream dis, DataOutputStream dos, Broker broker) throws IOException {
        this.s = s;
        this.dis = dis;
        this.dos = dos;
        this.broker = broker;
    }

    @Override
    public void run() {
        while (true) {
            buffer = new byte[1024];
            try {
                dis.read(buffer);
                broker.handleMessage(buffer, s, dos);
            } catch (IOException e) {
                try {
                    s.close();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }
    }

    public DataOutputStream getDos() {
        return this.dos;
    }

}
