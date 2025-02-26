package assign07;

public abstract class AudioEvent implements Comparable<AudioEvent>{

    private int eventTime;

    private int channel;

    public AudioEvent(int eventTime, int channel) {
        this.eventTime = eventTime;
        this.channel = channel;
    }

    public int getEventTime() {
        return eventTime;
    }

    public int getChannel() {
        return channel;
    }

    public abstract void execute(SimpleSynthesizer synth);

    public abstract void complete(SimpleSynthesizer synth);

    public String toString(){
        return eventTime + ", " + channel;
    };

}
