package vttp.july01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class Map {

    public static void main( String[] args ) throws Exception {

        String csvFile = ".csv";
        try{
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            CSVparser records = CSVparser.parse(br,CSVformat.DEFAULT);
            Map<Integer, Data> dataMap = new HashMap<Integer, Data>();
            for(CSVRecord record:records) {
                Data data = new Data();
                data.setName(record.get(0));
                data.setAddress(record.get(2));
                data.setYears(Integer.parseInt(record.get(3)));
 
                dataMap.put(Integer.parseInt(record.get(0)), data);
            } 
 
            System.out.println(dataMap);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
