package myapp;

public class Honda extends Car{
    
    public Honda() {
        this.setMake("Honda");

    }

    public void accelerate() {
        System.out.println("Accelerating..");

    }
    //Annotation
    @Override
    public void stop(Integer count) {
        System.out.print("Stopping... Stopped");

    }

    }

