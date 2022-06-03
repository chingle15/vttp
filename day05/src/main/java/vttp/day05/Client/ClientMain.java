package vttp.day05.Client;

import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientMain {

    public static void main(String[] args) throws IOException{

        // Connect the server
        // 127.0.0.1 -> localhost
        System.out.println("Connecting to localhost at port 3000");
        Socket sock = new Socket("127.0.0.1", 3000);
        System.out.println("Connection accepted");

        //Get the input and output stream - bytes
        // Get the input sttream

        InputStream is = sock.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        //Get the output stream

        OutputStream os = sock.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        //Get input from user
        Console cons = System.console();
        String input = cons.readLine("Say something to the server");

        //Write to server
        dos.writeUTF(input);
        dos.flush();

        //wait for response froms erver
        String response = dis.readUTF();
        System.out.printf(">> %s\n", response);

        //close the streams
        is.close();
        os.close();

        //close the socket
        sock.close();


    }
    
}
