package assign07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class tests various functionalities of the AudioEvent, NoteEvent, ChangeEvent,
 * and TrackEvent classes. It conducts unit tests to ensure the correctness of the
 * data accessors, constructors, and string representations of these classes.
 *
 * The test suite is designed to validate behaviors such as the retrieval of properties
 * like time, pitch, channel, duration, new value, and start time. In addition, it tests
 * the `toString()` implementations for proper string representation of event objects.
 *
 * Note: The `@BeforeEach` setup initializes and prepares test data for all unit tests.
 */
public class MyAudioEventTester {

    private static final int ONE_INT = 1;
    private static final int FIVE_INT = 5;
    private static final int ONE_HUNDRED_INT = 100;
    private static final int[] VALID_INPUTS = new int []{ONE_INT,FIVE_INT, ONE_HUNDRED_INT};
    private static final int VALID_INPUTS_LENGTH = VALID_INPUTS.length;

    private static NoteEvent[] validNoteEvents;
    private static ChangeEvent[] validChangeEvents;
    private static TrackEvent[] validTrackEvents;


    @BeforeEach
    void setUp(){
        validNoteEvents = new NoteEvent[VALID_INPUTS.length];
        validChangeEvents = new ChangeEvent[VALID_INPUTS.length];
        validTrackEvents = new TrackEvent[VALID_INPUTS.length];
        for(int i = 0; i < VALID_INPUTS_LENGTH; i++){
            int input = VALID_INPUTS[i];
            validNoteEvents[i] = new NoteEvent(input, input, input, input);
            validChangeEvents[i] = new ChangeEvent(input, input, input);
            validTrackEvents[i] = new TrackEvent(input, input);
        }
    }

    // AUDIO EVENT
    @Test
    public void testAudioEventGetTime(){
        for(int i = 0; i < VALID_INPUTS_LENGTH; i++){
            int expected = VALID_INPUTS[i];
            assertEquals(expected, validNoteEvents[i].getTime());
            assertEquals(expected, validChangeEvents[i].getTime());
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

    //Getters
    @Test
    public void testNoteEventGetPitch() {
        for (int i = 0; i < VALID_INPUTS_LENGTH; i++) {
            int expectedInt = VALID_INPUTS[i];
            assertEquals(expectedInt, validNoteEvents[i].getPitch());
        }
    }

    @Test
    public void testNoteEventGetDuration() {
        for (int i = 0; i < VALID_INPUTS_LENGTH; i++) {
            int expectedInt = VALID_INPUTS[i];
            assertEquals(expectedInt, validNoteEvents[i].getDuration());
        }
    }

    //To String
    @Test
    public void testNoteEventToString() {
        for (int i = 0; i < VALID_INPUTS_LENGTH; i++) {
            int expectedInt = VALID_INPUTS[i];
            assertEquals("NoteEvent[" + expectedInt + ", " + expectedInt + ", " + expectedInt + ", " + expectedInt + "]", validNoteEvents[i].toString());
        }
    }

    // CHANGE EVENT

    //Getter
    @Test
    public void testChangeEventGetPitch() {
        for (int i = 0; i < VALID_INPUTS_LENGTH; i++) {
            int expectedInt = VALID_INPUTS[i];
            assertEquals(expectedInt, validChangeEvents[i].getValue());
        }
    }

    //To String

    @Test
    public void testChangeEventToString() {
        for (int i = 0; i < VALID_INPUTS_LENGTH; i++) {
            int expectedInt = VALID_INPUTS[i];
            assertEquals("ChangeEvent[" + expectedInt + ", " + expectedInt + ", " + expectedInt + "]", validChangeEvents[i].toString());
        }
    }

    // TRACK EVENT

    //Getter
    @Test
    public void testTrackEventGetStartTime() {
        for (int i = 0; i < VALID_INPUTS_LENGTH; i++) {
            int expectedInt = VALID_INPUTS[i];
            assertEquals(expectedInt, validTrackEvents[i].getStartTime());
        }
    }

    @Test
    public void testTrackEventGetChannel() {
        for (int i = 0; i < VALID_INPUTS_LENGTH; i++) {
            int expectedInt = VALID_INPUTS[i];
            assertEquals(expectedInt, validTrackEvents[i].getChannel());
        }
    }

    //To String

    @Test
    public void testTrackEventToString() {
        for (int i = 0; i < VALID_INPUTS_LENGTH; i++) {
            int expectedInt = VALID_INPUTS[i];
            assertEquals("TrackEvent[" + expectedInt + ", " + expectedInt + "]", validTrackEvents[i].toString());
        }
    }


}
