package assign07;

/**
 * Represents an event in an audio track, defined by a specific start time and audio channel.
 * TrackEvent objects are used to manage and organize audio events chronologically, with the
 * ability to be sorted based on their start time and channel.
 *
 * Implements the Comparable interface, allowing TrackEvent objects to be compared and sorted
 * based on their start time. If two TrackEvents have the same start time, the comparison is
 * based on their associated channels.
 */
public class TrackEvent implements Comparable<TrackEvent> {

    private int startTime;
    private int channel;


    /**
     * Constructs a TrackEvent object with the specified start time and channel.
     *
     * @param startTime the start time of the track event, must be a non-negative integer
     * @param channel the audio channel associated with this track event, must be greater than or equal to 1
     * @throws IllegalArgumentException if the start time is negative or the channel is less than 1
     */
    public TrackEvent(int startTime, int channel){
        constructorInputValidation(startTime, channel);
        this.startTime = startTime;
        this.channel = channel;
    }

    /**
     * Retrieves the start time of the track event.
     *
     * @return the start time of the event as an integer
     */
    public int getStartTime(){
        return startTime;
    }

    /**
     * Retrieves the audio channel associated with this track event.
     *
     * @return the associated audio channel as an integer
     */
    public int getChannel(){
        return channel;
    }


    /**
     * Compares this TrackEvent object with another TrackEvent object for order.
     * The comparison is primarily based on the start time. If the start times of the two
     * TrackEvent objects are equal, the comparison is then based on their audio channels.
     *
     * @param other the TrackEvent object to be compared with this TrackEvent
     * @return -1 if this TrackEvent occurs earlier than the other TrackEvent,
     *          1 if this TrackEvent occurs later than the other TrackEvent,
     *          or 0 if both TrackEvents have the same start time and audio channel
     */
    public int compareTo(TrackEvent other){
        int thisEventTime = this.startTime;
        int otherEventTime = other.getStartTime();
        int difference  = thisEventTime - otherEventTime;
        if(difference < 0){
            return -1;
        } else if(difference > 0) {
            return 1;
        }else{
            int channelDif = channel - other.getChannel();
            if(channelDif > 0) {
                return 1;
            } else if(channelDif < 0){
                return -1;
            } else {
                return 0;
            }
        }
    }


    /**
     * Returns a string representation of the TrackEvent object, which includes
     * the start time and associated channel information.
     *
     * @return a string representation of the TrackEvent in the format "TrackEvent[startTime, channel]"
     */
    public String toString() {
        return "TrackEvent[" + startTime + ", " + channel + "]";
    }

    private void constructorInputValidation(int startTime, int channel){
        if(startTime < 0){
            throw new IllegalArgumentException("Track Event: Time cannot be less than 0");
        } else if(channel < 1){
            throw new IllegalArgumentException("Track Event: Channel cannot be less than 1");
        }
    }
}
