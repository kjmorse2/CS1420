package assign07;

public class ChangeEvent extends AudioEvent{

    /**
     * Represents the new value associated with a ChangeEvent instance.
     * The value is typically used to indicate a modification, such as the updated
     * volume level, for a specific audio channel in the associated sequence.
     *
     * This value is expected to be non-negative, as enforced by the constructor of the
     * ChangeEvent class.
     */
    private int newValue;

    /**
     * Constructs a ChangeEvent with a specified time, channel, and value.
     * The ChangeEvent represents a modification, such as changing the volume,
     * in the associated audio sequence.
     *
     * @param time the time at which the event occurs, must be non-negative
     * @param channel the channel associated with the event, must be greater than or equal to 1
     * @param value the new value for this change event, must be non-negative
     * @throws IllegalArgumentException if value is less than 0
     */
    public ChangeEvent(int time, int channel, int value){
        super(time, channel);
        constructorInputValidation(value);
        newValue = value;
    }

    /**
     * Retrieves the new value associated with the ChangeEvent.
     * This value represents a modification, such as an updated volume level,
     * for a specific audio channel in the associated sequence.
     *
     * @return the new value as an integer
     */
    public int getValue(){ return newValue; }

    /**
     * Executes the action associated with the ChangeEvent by adjusting the volume
     * of a specific channel on the provided SimpleSynthesizer instance.
     *
     * @param synth the SimpleSynthesizer instance on which the volume adjustment
     *              will be performed
     */
    public void execute(SimpleSynthesizer synth){
        synth.setVolume(this.getChannel(), newValue);
    }

    /**
     * Completes the action associated with this ChangeEvent by executing any final operations
     * required to end the event's behavior on the specified SimpleSynthesizer instance.
     * This method is reserved for cases where follow-up adjustments or clean-up operations
     * are necessary to terminate the action represented by the ChangeEvent.
     *
     * @param synth the SimpleSynthesizer instance on which the operation will be completed
     */
    public void complete(SimpleSynthesizer synth){}

    /**
     * Compares this AudioEvent to another AudioEvent to determine their ordering.
     * The comparison is based on the event times. If the two events occur at the
     * same time, tie is broken if one of the events is a Change Event, which happens first
     *
     * @param other the AudioEvent to compare against this instance
     * @return -1 if this event occurs before the other, 1 if this event occurs after the other,
     *         or 0 if both events occur at the same time and are of the same type.
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
        if(other instanceof ChangeEvent){
            return 0;
        }
        else{
            return -1;
        }

    }

    private void constructorInputValidation(int newValue){
        if(newValue < 0){
            throw new IllegalArgumentException("Change Event: New Volume cannot be less than 0");
        }
    }


    /**
     * Returns a string representation of the ChangeEvent object, including
     * the time, channel, and the new value associated with the event.
     *
     * @return a string in the format "ChangeEvent[time, channel, newValue]"
     */
    @Override
    public String toString(){
        return "ChangeEvent[" + super.toString() + ", " + newValue + "]";
    }
}
