package myapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileRead {

    //java ReaderMain text_file

    public static void main (String[] args) throws FileNotFoundException, IOException{

        String srcFile = args[0];

        Reader reader = new FileReader(srcFile);

        String line = "";
        int lineNum = 1;

        BufferedReader br = new BufferedReader(new FileReader("C:\Users\User\vttp\day04\myapp\exams.csv"))) {
            for (int i = 0; i < n; i++)
                br.readLine();
            line = br.readLine();
            System.out.println(line);
        }
        catch(IOException e){
          System.out.println(e);
        }
      }
  }

        


        while (line!= null) {
            line = br.readLine();
            lineNum++ ;
            System.out.printf("%d: %s\n", lineNum,line);


        }

        reader.close();

    }
    
}
