package State_Pattern;

public class Flashlight {

    private State currentState = new StateOff();


        public void setCurrentState(State currentState) {
            this.currentState = currentState;
        }

        public State getCurrentState() {
            return currentState;
        }

        public void press() {
            currentState.handlePress(this);
        }

        public void hold() {
            currentState.handleHold(this);


        }

    public void turnOFF() {

    }
}

