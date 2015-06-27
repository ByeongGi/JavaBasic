package com.lec.java.network02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket01 {
	
	public static void main(String[] args){
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost",5001));
            while (true){
                System.out.println("[연결 기다림]");
                Socket socket =serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락함]"+isa.getHostName());

                byte[] bytes = null;
                String messge = null;

                InputStream is = socket.getInputStream();
                bytes = new byte[100];
                int readByteCount = is.read(bytes);
                messge = new String(bytes,0,readByteCount,"UTF-8");
                System.out.println("[데이터 받기 성공]:"+messge);

                OutputStream os = socket.getOutputStream();
                messge = "Hello Client";
                bytes = messge.getBytes("UTF-8");
                os.write(bytes);
                os.flush();
                System.out.println("[데이터 보내기 성공]:"+messge);

                is.close();
                os.close();
                socket.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
	
	
	
	

}
