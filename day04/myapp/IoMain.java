package myapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;


//java IoMain <src> <test>
public class IoMain {
    
    public static void main(String[] args) throws IOException {

        // src = source , dst = destination
        String srcFile = args[0];
        String dstFile = args[1];

        //1k byte buffer
        byte[]buff = new byte[1024];
        int size = 0;
        try{
        
            // is = inputstream , os= outputstream
        InputStream is = new FileInputStream(srcFile); 
        System.out.printf(" File Opened: %s\n", srcFile);

        OutputStream os = new FileOutputStream(dstFile);

        
        // buff refers to buffer
        while(size >= 0) {
            size = is.read(buff);
            System.out.printf("read: %d\n", size);
            if (size > 0);
            os.write(buff, 0 ,size);
        }
        
        
    is.close();
    os.flush();
    os.close(); }
        catch (FileNotFoundException ex) {
            System.out.printf(" Error: %s\n", ex.getMessage());
        }
        catch (IOException ex) {
            System.out.printf(" Error: %s\n", ex.getMessage());
        }
} }
