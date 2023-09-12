package State_Pattern;

public class StateOff extends State{


    @Override
    public void handlePress(Flashlight f) {

        f.setCurrentState(new StateLow());

    }

    @Override
    public void handleHold(Flashlight f) {

    }
}
