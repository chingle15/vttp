package myapp;

import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;

class Try {
    public static void main( String args[] ) {
      int n = 1; // The line number
      String line;
      Reader reader;
    BufferedReader br = new BufferedReader(reader);
          for (int i = 0; i < n; i++) {
              br.readLine();
          line = br.readLine();
          System.out.println(line);
      }
      try {
          
      } catch (Exception e) { 
          
 (IOException ex) }{
        System.out.println(ex);
      }
    }
}
