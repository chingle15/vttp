package myapp;

public class Remotecontrol {
    
    private Controller control;
    
    public Remotecontrol(Controller c) {
        this.control = c;

    }

    public void start() {
        this.control.start();

    }

    public void stop() {
        this.control.stop();
        
    }
}
