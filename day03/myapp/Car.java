package myapp;

//Class
public class Car implements Controller{

// properties, members
private String colour;
private String make;
private Integer enginecapacity;
private Integer startedSince;
public boolean started = false;

// Default constructor
public Car() {

    System.out.println (" *** Instatiating car object ***");
    this.colour = "red";
}

public Car(Integer capacity) {
    this.enginecapacity= capacity;
}

public Car(String colour, String make) {
    this.colour = colour;
    this.make = make;

}


public String getMake() {
    return make;
}
public void setMake(String make) {
    this.make = make;
}
public Integer getEnginecapacity() {
    return enginecapacity;
}
public void setEnginecapacity(Integer enginecapacity) {
    this.enginecapacity = enginecapacity;
}
public boolean isStarted() {
    return started;
}
public void setStarted(boolean started) {
    this.started = started;
}
//get = read, set = change
public void setColour(String c) {
    this.colour = c;
}
public String getColour(){
    return this.colour;
}

public void setEngineCapacitiy(Integer capacity) {
    this.enginecapacity = capacity;
}

public Integer getEngineCapacity() {
    return this.enginecapacity;
}

public long getDrivingDuration(){
    if (isStarted())
    //Convert to ms -> sec
    return (System.currentTimeMillis()-this.startedSince)/ 1000;
    return (long)-1;

}

//behaviour, methods
public void start() {
    if (this.started) {
        System.out.println("Your car is running");
    } else{
        System.out.println("Vroom....");
        this.started = true;
        // Since 000 Jan 1 1370
        this.startedSince = System.currentTimeMillis();
    }
}
public void stop () {
    if (this.started) {
        System.out.println("Your car is not running");
    } else{
        System.out.println("Splutter splutter stop....");
        this.started = false;
    }
}
}
