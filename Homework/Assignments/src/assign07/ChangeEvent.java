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
        synth.setVolume(channel, newValue);
    }

    public
}
