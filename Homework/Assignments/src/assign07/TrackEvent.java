package assign07;

public class TrackEvent{

    private int channel;
    private int startTime;

    public TrackEvent(int channel, int startTime){
        this.channel = channel;
        this.startTime = startTime;
    }

    public int getChannel(){
        return channel;
    }

    public int getStartTime(){
        return startTime;
    }

    public String toString(){
        return "TrackEvent{" + channel + " Start Time: " + startTime;
    }

}
