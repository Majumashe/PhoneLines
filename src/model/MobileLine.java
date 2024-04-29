package model;

	public class MobileLine extends BasicPhoneLine implements CellularCaller{
		public static final int MOBILE_PRICE_CALL = 10;
		protected int minOfCellularCalls;

		//constructor
		public MobileLine(int numCalls, int minsCelular, int minsLocal){
			super(numCalls, minsLocal); //Llama el constructor de la clase padre
			this.minOfCellularCalls = minsCelular;

		}
		//sobreescribimos el toString
		@Override
		public String toString(){
			return super.toString() + ", numberOfCellularCalls: " + minOfCellularCalls;
		}




		//metodos de la interfaz
		public void celularCall(int mntsCall){
			minOfCellularCalls += mntsCall;


		}
 
    	public int calculatePrice(int timeCall){
			
			return MOBILE_PRICE_CALL*minOfCellularCalls;
		}
 
	}
	
	