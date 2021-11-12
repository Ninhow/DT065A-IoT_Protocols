package com.labb_1;

import com.labb_1.classes.UDPClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       UDPClient client =  new UDPClient();
       client.sendMessage();
    }
}
