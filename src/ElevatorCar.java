
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

    public void showDisplay() {
        elevatorDisplay.showDisplay();
    }

    public void pressButton(int destination) {
        internalButtons.pressButton(destination, this);
    }

    public void setDisplay() {
        this.elevatorDisplay.setDisplay(currentFloor, direction);
    }

    boolean moveElevator(Direction dir, int destinationFloor){
        int startFloor = currentFloor;
        if(dir == Direction.UP) {
            for(int i = startFloor; i<=destinationFloor; i++) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }

        if(dir == Direction.DOWN) {
            for(int i = startFloor; i>=destinationFloor; i--) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }
        return false;
    }



}
