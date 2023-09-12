package State_Pattern;

public class StateHigh extends State{


    @Override
    public void handlePress(Flashlight f) {
        f.setCurrentState(new StateOff());
    }

    @Override
    public void handleHold(Flashlight f) {
        f.turnOFF();
        f.setCurrentState(new StateLow());
    }
}
