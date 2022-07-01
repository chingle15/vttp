package vttp.july01;

import java.io.IOException;
import java.net.Socket;

public class ClientThread implements Runnable{
    
    private Socket sock;

    public ClientThread(Socket s) {
        sock = s;
    }

    @Override
    public void run() {
        System.out.println("Starting client thread");
        try {
            NetworkIO netIO = new NetworkIO(sock);
            String req = "";

            while (!req.equals("exit")) {
                try {
                    req = netIO.read();
                    System.out.printf("[client] %s\n", req);
                    if (req.trim().equals("exit"))
                        break; 
                    String[] request = req.split("");
                    String requestid = request[0];

                    System.out.printf("%s\n", requestid);
                    System.out.printf("Tan Ching Le\n");
                    System.out.printf("tchinglewow@gmail.com");
                    System.out.printf("%f\n");

                     
                } catch (IOException ex) {
                    break; 
                }
            }

            netIO.close();
            sock.close();
            System.out.println("Exiting thread");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
