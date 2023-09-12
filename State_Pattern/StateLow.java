package State_Pattern;

public class StateLow extends State{
    @Override
    public void handlePress(Flashlight f) {
        f.setCurrentState(new StateOff());
    }

    @Override
    public void handleHold(Flashlight f) {
        f.setCurrentState(new StateHigh());
    }
}
