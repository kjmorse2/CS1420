package assign07;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AudioEventTester {

    private static NoteEvent note1, note2, note3;
    private static ChangeEvent change1, change2, change3;
    private static TrackEvent track1, track2, track3;

    @BeforeAll
    static void setUp(){

        note1 = new NoteEvent(5, 6, 7, 8);
        note2 = new NoteEvent(0, 1, 10, 15);
        note3 = new NoteEvent(1000, 1000, 1000, 1000);

        change1 = new ChangeEvent(5,6,7);
        change2 = new ChangeEvent(0,7,10);
        change3 = new ChangeEvent(1000,1000,1000);

        track1 = new TrackEvent(5,6);
        track2 = new TrackEvent(0,1);
        track3 = new TrackEvent(1000,1000);
    }

    @Test
    void testAudioEventTimeGetter(){
        assertEquals(5, note1.getTime(), "Failed to get time on NoteEvent");
        assertEquals(0, note2.getTime(), "Failed to get time on NoteEvent");
        assertEquals(1000, note3.getTime(), "Failed to get time on NoteEvent");
        assertEquals(5, change1.getTime(), "Failed to get time on ChangeEvent");
        assertEquals(0, change2.getTime(), "Failed to get time on ChangeEvent");
        assertEquals(1000, change3.getTime(), "Failed to get time on ChangeEvent");
    }

    @Test
    void testAudioEventChannelGetter(){
        assertEquals(6, note1.getChannel(), "Failed to get channel on NoteEvent");
        assertEquals(1, note2.getChannel(), "Failed to get channel on NoteEvent");
        assertEquals(1000, note3.getChannel(), "Failed to get channel on NoteEvent");
        assertEquals(6, change1.getChannel(), "Failed to get channel on ChangeEvent");
        assertEquals(7, change2.getChannel(), "Failed to get channel on ChangeEvent");
        assertEquals(1000, change3.getChannel(), "Failed to get channel on ChangeEvent");
    }

    @Test
    void testNoteEventGetDuration(){
        assertEquals(7, note1.getDuration(), "Failed to get duration on NoteEvent");
        assertEquals(10, note2.getDuration(), "Failed to get duration on NoteEvent");
        assertEquals(1000, note3.getDuration(), "Failed to get duration on NoteEvent");
    }

    @Test
    void testNoteEventGetPitch(){
        assertEquals(8, note1.getPitch(), "Failed to get pitch on NoteEvent");
        assertEquals(15, note2.getPitch(), "Failed to get pitch on NoteEvent");
        assertEquals(1000, note3.getPitch(), "Failed to get pitch on NoteEvent");
    }

    @Test
    void testNoteToString(){
        assertEquals("NoteEvent[5, 6, 7, 8]", note1.toString(), "NoteEvent toString failed");
        assertEquals("NoteEvent[0, 1, 10, 15]", note2.toString(), "NoteEvent toString failed");
        assertEquals("NoteEvent[1000, 1000, 1000, 1000]", note3.toString(), "NoteEvent toString failed");
    }

    @Test
    void testChangeEventGetValue(){
        assertEquals(7, change1.getValue(), "Failed to get value on ChangeEvent");
        assertEquals(10, change2.getValue(), "Failed to get value on ChangeEvent");
        assertEquals(1000, change3.getValue(), "Failed to get value on ChangeEvent");
    }

    @Test
    void testChangeEventToString(){
        assertEquals("ChangeEvent[5, 6, 7]", change1.toString(), "ChangeEvent toString failed");
        assertEquals("ChangeEvent[0, 7, 10]", change2.toString(),"ChangeEvent toString failed");
        assertEquals("ChangeEvent[1000, 1000, 1000]", change3.toString(), "ChangeEvent toString failed");
    }

    @Test
    void testComparingSameNoteEvents(){
        NoteEvent note1Clone = new NoteEvent(5, 6, 7, 8);
        assertEquals(0, note1.compareTo(note1Clone));
    }

    @Test
    void testComparingFirstNoteToSecondNote(){
        assertTrue(note2.compareTo(note1) < 0);
    }

    @Test
    void testComparingSecondNoteToFirstNote(){
        assertTrue(note1.compareTo(note2) > 0);
    }

    @Test
    void testComparingSameChangeEvents(){
        ChangeEvent change1Clone = new ChangeEvent(5,6,7);
        assertEquals(0, change1.compareTo(change1Clone));
    }

    @Test
    void testComparingFirstChangeToSecondChange(){
        assertTrue(change2.compareTo(change1) < 0);
    }

    @Test
    void testComparingSecondChangeToFirstChange(){
        assertTrue(change1.compareTo(change2) > 0);
    }

    @Test
    void testComparingFirstNoteToSecondChange(){
        assertTrue(note2.compareTo(change1) < 0);
    }

    @Test
    void testComparingSecondChangeToFirstNote(){
        assertTrue(change1.compareTo(note2) > 0);
    }

    @Test
    void testComparingFirstChangeToSecondNote(){
        assertTrue(change2.compareTo(note1) < 0);
    }

    @Test
    void testComparingSecondNoteToFirstChange(){
        assertTrue(note1.compareTo(change2) > 0);
    }

    @Test
    void testComparingSameChangeToNote(){
        assertTrue(change2.compareTo(note2) < 0);
    }

    @Test
    void testComparingSameNoteToChange(){
        assertTrue(note2.compareTo(change2) > 0);
    }

    @Test
    void testTrackEventGetStartTime(){
        assertEquals(5, track1.getStartTime(), "Failed to get StartTime on TrackEvent");
        assertEquals(0, track2.getStartTime(), "Failed to get StartTime on TrackEvent");
        assertEquals(1000, track3.getStartTime(), "Failed to get StartTime on TrackEvent");
    }

    @Test
    void testTrackEventGetChannel(){
        assertEquals(6, track1.getChannel(), "Failed to get Channel on TrackEvent");
        assertEquals(1, track2.getChannel(), "Failed to get Channel on TrackEvent");
        assertEquals(1000, track3.getChannel(), "Failed to get Channel on TrackEvent");
    }

    @Test
    void testTrackEventToString(){
        assertEquals("TrackEvent[5, 6]", track1.toString(), "TrackEvent toString failed");
        assertEquals("TrackEvent[0, 1]", track2.toString(),"TrackEvent toString failed");
        assertEquals("TrackEvent[1000, 1000]", track3.toString(), "TrackEvent toString failed");
    }


}
