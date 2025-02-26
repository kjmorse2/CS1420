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
        synth.noteOn(channel, Pitch);
    }

    public void complete(SimpleSynthesizer synth){
        synth.noteOff(channel, Pitch);
    }

}
