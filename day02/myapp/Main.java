package myapp;

public class Main {
    public static void main (String[] args, int i) {
        System.out.println("Hello, World");

        String[] todos = new String[4];
        todos[0] = "Learn Java";
        todos[1] = "go jogging";
        todos[2] = "watch a mvie";

        System.out.printf("Index: %d: value = %s\n", 0, todos[0]);
        System.out.printf("Index: %d: value = %s\n", 0, todos[1]);
        System.out.printf("Index: %d: value = %s\n", 0, todos[2]);
        System.out.printf("Index: %d: value = %s\n", 0, todos[3]);



        // Every array has a property called lgenth
        System.out.printf("Size of array: %d\n", todos.length);





        System.out.printf("Index: %d: value = %s\n", 0, args[0]);
        System.out.printf("Index: %d: value = %s\n", 0, args[1]);

        System.out.printf("Size of args: %d\n", args.length);


    }
}