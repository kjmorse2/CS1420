package assign07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AudioEventTester {

    private static final int ZERO_INT = 0;
    private static final int ONE_INT = 1;
    private static final int ONE_HUNDRED_INT = 100;
    private static final int[] VALID_INPUTS = new int []{ZERO_INT,ONE_INT,ONE_HUNDRED_INT};
    private static final int VALID_INPUTS_LENGTH = VALID_INPUTS.length;

    private static NoteEvent[] validNoteEvents;
    private static ChangeEvent[] validChangeEvents;


    @BeforeAll
    static void setUp(){
        NoteEvent[] validNoteEvents = new NoteEvent[VALID_INPUTS.length];
        ChangeEvent[] validChangeEvents = new ChangeEvent[VALID_INPUTS.length];
        for(int i = 0; i < VALID_INPUTS.length; i++){
            validNoteEvents[i] = new NoteEvent(VALID_INPUTS[i],VALID_INPUTS[i],VALID_INPUTS[i],VALID_INPUTS[i]);
            validChangeEvents[i] = new ChangeEvent(VALID_INPUTS[i],VALID_INPUTS[i],VALID_INPUTS[i]);
        }
    }

    // AUDIO EVENT
    @Test
    public void testAudioEventGetTime(){
        for(int i = 0; i < VALID_INPUTS_LENGTH; i++){
            int expected = VALID_INPUTS[i];
            assertEquals(expected, validNoteEvents[i].getEventTime());
            assertEquals(expected, validChangeEvents[i].getEventTime());
        }
    }

    @Test
    public void testAudioEventGetChannel(){
        for(int i = 0; i < VALID_INPUTS_LENGTH; i++){
            int expected = VALID_INPUTS[i];
            assertEquals(expected, validNoteEvents[i].getChannel());
            assertEquals(expected, validChangeEvents[i].getChannel());
        }
    }

    // NOTE EVENT
    @Test
    public void testNoteEventToString() {
        for (int i = 0; i < VALID_INPUTS_LENGTH; i++) {
            int expectedInt = VALID_INPUTS[i];
            assertEquals("NoteEvent[" + expectedInt + ", " + expectedInt + ", " + expectedInt + ", " + expectedInt + "]", validNoteEvents[i].toString());
        }

    }

}
