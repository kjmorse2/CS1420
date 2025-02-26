package assign07;

public class TrackEvent implements Comparable<TrackEvent> {

    private int startTime;
    private int channel;


    public TrackEvent(int startTime, int channel){
        this.startTime = startTime;
        this.channel = channel;
    }

    public int getStartTime(){
        return startTime;
    }

    public int getChannel(){
        return channel;
    }

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


    public String toString() {
        return "TrackEvent[" + startTime + ", " + channel + "]";
    }
}
