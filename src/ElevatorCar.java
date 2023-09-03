
public class ElevatorCar {
    int id;
    int currentFloor;
    ElevatorStatus elevatorStatus;
    ElevatorDisplay elevatorDisplay;
    Direction direction;
    InternalButtons internalButtons;
    ElevatorDoor elevatorDoor;

    ElevatorCar(){
        elevatorDisplay=new ElevatorDisplay();
        elevatorStatus = ElevatorStatus.IDLE;
        direction = Direction.UP;
        internalButtons = new InternalButtons();
        elevatorDoor = new ElevatorDoor();
        currentFloor = 0;
    }




}
