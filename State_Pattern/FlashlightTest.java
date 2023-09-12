package State_Pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlashlightTest {

    @Test
    void testOffLowHighLowHighOff(){
        Flashlight f = new Flashlight();
        assertTrue(f.getCurrentState() instanceof StateOff);
        f.press();
        assertTrue(f.getCurrentState() instanceof StateLow);
        f.hold();
        assertTrue(f.getCurrentState() instanceof StateHigh);
        f.hold();
        assertTrue(f.getCurrentState() instanceof StateLow);
        f.hold();
        assertTrue(f.getCurrentState() instanceof StateHigh);
        f.press();
        assertTrue(f.getCurrentState() instanceof StateOff);
    }

}