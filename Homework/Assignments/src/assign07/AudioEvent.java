package assign07;

/**
 * Represents an abstract class for events that occur in an audio sequence.
 * AudioEvent provides a common interface and properties such as
 * a time at which the event occurs and a channel associated with the event.
 * This class implements Comparable to allow sorting based on the event time.
 *
 * Subclasses of AudioEvent should provide specific implementations of the
 * abstract methods to define the behavior of the event.
 */
@SuppressWarnings("unckecked")
public abstract class AudioEvent implements Comparable<AudioEvent>{

    private int time;

    private int channel;

    /**
     * Constructs an AudioEvent with the specified time and channel.
     *
     * @param eventTime the time when the event occurs, must be non-negative
     * @param eventChannel the channel associated with the event, must be greater than or equal to 1
     * @throws IllegalArgumentException if eventTime is less than 0 or if eventChannel is less than 1
     */
    public AudioEvent(int eventTime, int eventChannel) {
        constructorInputValidation(eventTime, eventChannel);
        time = eventTime;
        channel = eventChannel;
    }

    /**
     * Returns the time at which the audio event occurs.
     *
     * @return the time of the event as an integer
     */
    public int getTime() {
        return time;
    }

    /**
     * Retrieves the channel associated with the audio event.
     *
     * @return the channel of the event as an integer
     */
    public int getChannel() {
        return channel;
    }

    public abstract void execute(SimpleSynthesizer synth);

    public abstract void complete(SimpleSynthesizer synth);

    /**
     * Returns a string representation of the AudioEvent object, including
     * the time at which it occurs and the associated channel.
     *
     * @return a comma-separated string in the format "time, channel"
     */
    public String toString(){
        return time + ", " + channel;
    }

    private void constructorInputValidation(int eventTime, int channel){
        if(eventTime < 0){
            throw new IllegalArgumentException("Audio Event: Time cannot be less than 0");
        } else if(channel < 1){
            throw new IllegalArgumentException("Audio Event: Channel cannot be less than 1");
        }
    }


}
