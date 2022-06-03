package myapp;

public class MainRemote {

    public statiC void main(String[] args) {

        Honda h = new Honda();
        computer myNotebook = new Computer();

        Controller ctrl = new Honda();


        RemoteControl rm = new Remotecontrol(h);
        RemoteControl rmNotebook =  new REmoateControl(myNotebook);

        rm.start();
        rmNotebook.start();

    }
    
}
