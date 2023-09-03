public class Floor {
    int floorNumber;
    ExternalButtonDispatcher externalDispatcher;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        externalDispatcher = new ExternalButtonDispatcher();
    }
    public void pressButton(Direction direction) {

        externalDispatcher.submitExternalRequest(floorNumber, direction);
    }

}
