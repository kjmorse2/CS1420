package assign07;

public class ChangeEvent extends AudioEvent{
    private int newValue;

    public ChangeEvent(int time, int channel, int value){
        super(time, channel);
        newValue = value;
    }

    public int getValue(){
        return newValue;
    }

    public void execute(SimpleSynthesizer synth){
        synth.setVolume(this.getChannel(), newValue);
    }

    public void complete(SimpleSynthesizer synth){}

    public int compareTo(AudioEvent other){
        int thisEventTime = this.getEventTime();
        int otherEventTime = other.getEventTime();
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

    @Override
    public String toString(){
        return "ChangeEvent[" + super.toString() + ", " + newValue + "]";
    }
}
