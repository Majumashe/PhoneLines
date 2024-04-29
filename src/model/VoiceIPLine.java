package model;

public class VoiceIPLine extends MobileLine implements LongDistanceCaller{
    public final int VOICEIP_CALL = 7;
    public final int VOICEIP_LONGDISTANCE_CALL = 80;
    private int minOfLongDistance;

    /*public VoiceIPLine(int minOfLongDistance){
        super();
        this.minOfLongDistance = minOfLongDistance;
    }
    */
    public VoiceIPLine(int numCalls,  int minsLocal, int minsCelular, int minOfLongDistance){

        super(numCalls, minsLocal, minsCelular);
        this.minOfLongDistance = minOfLongDistance;
    }
    

    public void longDistanceCall(int i){
        minOfLongDistance += i;
    }

    public int calculatePrice(){
        int precioInter = super.calculatePrice();
        return precioInter + minOfLongDistance*VOICEIP_LONGDISTANCE_CALL;
    }

    //sobreescribimos el toString

    @Override
    public String toString() {
        return super.toString() +"minOfLongDistance=" + minOfLongDistance;
        
    }

}
