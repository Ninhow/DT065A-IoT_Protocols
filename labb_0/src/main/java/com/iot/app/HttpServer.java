package com.iot.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import com.iot.app.utils.Parser;
import com.iot.app.classes.RequestHeader;

/**
 * Hello world!
 *
 */
public class HttpServer {
    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true) {
                try (Socket client = serverSocket.accept()) {
                    handleClient(client);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private static void handleClient(Socket client) throws IOException {
        System.out.println("Debug: got a new client " + client.toString());
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

        RequestHeader requestHeader = new RequestHeader(Parser.getFirstWord(br.readLine()),
                Parser.getFirstWord(br.readLine()), Parser.getFirstWord(br.readLine()),
                Parser.getFirstWord(br.readLine()));
        System.out.println(requestHeader.toString());
    }

    private void requestHandler() {
        // Här ska jag handla alla typer av request.
        // Beroende på typ av request använder sig av json manager och sedan skickar en
        // typ av responde ifall operationen exekverades utan problem.
    }
}
