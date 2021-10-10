package behavioral.command;

//как было
public class RemoteController {
    private Door door;
    private Light light;

    public RemoteController(Door door, Light light) {
        this.door = door;
        this.light = light;
    }


    public void turnOnLight(){
        light.on();
    }

    public void turnOffLight(){
        light.off();
    }
    public void openDoor(){
        door.open();
    }

    public void closeDoor(){
        door.close();
    }
}
