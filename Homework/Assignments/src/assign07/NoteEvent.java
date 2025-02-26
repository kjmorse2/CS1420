package assign07;

/**
 * Represents a specific type of audio event called a NoteEvent, which triggers
 * the playing of a musical note in an audio sequence. A NoteEvent is defined
 * by a specific start time, audio channel, pitch, and duration.
 *
 * This class extends the AudioEvent class and implements additional details
 * related to musical notes.
 */
public class NoteEvent extends AudioEvent{

    private int Duration;
    private int Pitch;

    /**
     * Constructs a NoteEvent object with the specified parameters. This event represents
     * a musical note, defined by the time it occurs, the channel on which it is played,
     * the duration of the note, and the pitch.
     *
     * @param time the time when the note event occurs, must be non-negative
     * @param channel the audio channel on which the note is played, must be greater than or equal to 1
     * @param duration the duration of the note, must be non-negative
     * @param pitch the pitch of the note, represented as an integer
     * @throws IllegalArgumentException if the duration is negative
     */
    public NoteEvent(int time, int channel, int duration, int pitch){
        super(time, channel);
        constructorInputValidation(duration);
        this.Duration = duration;
        this.Pitch = pitch;
    }

    /**
     * Retrieves the duration of the note event.
     *
     * @return the duration of the note in milliseconds as an integer
     */
    public int getDuration() { return Duration; }

    /**
     * Retrieves the pitch of the note event.
     *
     * @return the pitch of the note as an integer
     */
    public int getPitch(){ return Pitch; }


    /**
     * Executes the NoteEvent by triggering the noteOn behavior on the specified synthesizer.
     * This method uses the associated channel and pitch of the NoteEvent to play a note.
     *
     * @param synth the SimpleSynthesizer instance used to execute the noteOn action
     */
    public void execute(SimpleSynthesizer synth){
        synth.noteOn(this.getChannel(), Pitch);
    }

    /**
     * Completes the NoteEvent by triggering the noteOff behavior on the specified synthesizer.
     * This method uses the associated channel and pitch of the NoteEvent to stop playing the note.
     *
     * @param synth the SimpleSynthesizer instance used to execute the noteOff action
     */
    public void complete(SimpleSynthesizer synth){
        synth.noteOff(this.getChannel(), Pitch);
    }

    /**
     * Compares this AudioEvent object to another AudioEvent object based on their respective event times.
     * If the times are equal and the other object is of type NoteEvent, the objects are considered equal.
     * If the other object is not of type NoteEvent, this event is considered greater.
     *
     * @param other the AudioEvent object to compare against this object
     * @return -1 if this event occurs earlier than the other event,
     *          1 if this event occurs later than the other event,
     *          0 if both events occur at the same time and the other object is of type NoteEvent,
     *          or 1 if both events occur at the same time but the other object is not of type NoteEvent
     */
    public int compareTo(AudioEvent other){
        int thisEventTime = this.getTime();
        int otherEventTime = other.getTime();
        int difference  = thisEventTime - otherEventTime;
        if(difference < 0){
            return -1;
        } else if(difference > 0){
            return 1;
        }
        if(other instanceof NoteEvent){
            return 0;
        }
        else{
            return 1;
        }

    }

    private void constructorInputValidation(int duration){
        if(duration < 0){
            throw new IllegalArgumentException("Note Event: Duration cannot be less than 0");
        }
    }

    /**
     * Returns a string representation of the NoteEvent object, which includes
     * the properties from the superclass AudioEvent, followed by the note's
     * duration and pitch.
     *
     * @return a string representation of the NoteEvent in the format
     *         "NoteEvent[super.toString(), duration, pitch]"
     */
    public String toString(){
        return "NoteEvent[" + super.toString() + ", " + Duration + ", " + Pitch + "]";
    }

}
