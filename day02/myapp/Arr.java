package myapp;

public class Arr {

    public static void main(String[] args) {

        // for loop

        for(int idx = 0; idx < args.length; idx++) {
            int idc = idx + 1;
            System.out.printf("idx = %d, %d\n", idx, idc);
        }
    }
    
}
