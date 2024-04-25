package model;

public class BasicPhoneLine implements LocalCaller{

    
    public static final int PRICE_LOCAL_CALL=35;
    private int numberOfCalls;
    private int numberOfLocalCalls;

    public BasicPhoneLine(int numberOfCalls, int numberOfLocalCalls) {
        this.numberOfCalls = numberOfCalls;
        this.numberOfLocalCalls = numberOfLocalCalls;
    }

    public BasicPhoneLine(int numberOfLocalCalls) {
        this.numberOfLocalCalls = numberOfLocalCalls;
    }

    public int getNumberOfCalls() {
        return numberOfCalls;
    }

    public void setNumberOfCalls(int numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }

    public int getNumberOfLocalCalls() {
        return numberOfLocalCalls;
    }

    public void setNumberOfLocalCalls(int numberOfLocalCalls) {
        this.numberOfLocalCalls = numberOfLocalCalls;
    }
    
    @Override
    public String toString() {
        return "BasicPhoneLine [numberOfCalls=" + numberOfCalls + ", numberOfLocalCalls=" + numberOfLocalCalls + "]";
    }

    //Metodos de la interfaz
    public void localCall(int min){


    }
	
	public int priceLocalCalls(){


        return 0;
    }

}