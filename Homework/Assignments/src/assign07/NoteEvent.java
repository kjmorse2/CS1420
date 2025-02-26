package assign07;

public class NoteEvent extends AudioEvent{

    private int Duration;
    private int Pitch;

    public NoteEvent(int time, int channel, int duration, int pitch){
        super(time, channel);
        this.Duration = duration;
        this.Pitch = pitch;
    }

    public void execute(SimpleSynthesizer synth){
        synth.noteOn(this.getChannel(), Pitch);
    }

    public void complete(SimpleSynthesizer synth){
        synth.noteOff(this.getChannel(), Pitch);
    }

    public int compareTo(AudioEvent other){
        int thisEventTime = this.getEventTime();
        int otherEventTime = other.getEventTime();
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

    public String toString(){
        return "NoteEvent[" + super.toString() + ", " + Duration + ", =" + Pitch + "]";
    }

}
