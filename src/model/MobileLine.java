package model;

	public class MobileLine extends BasicPhoneLine implements CellularCaller{
		public static final int MOBILE_PRICE_CALL = 10;
		private int minOfCellularCalls;

		//constructor
		public MobileLine(int numCalls, int minsCelular, int minsLocal){
			super(numCalls, minsLocal); //Llama el constructor de la clase padre
			this.minOfCellularCalls = minsCelular;

		}
		//metodos de la interfaz
		public void celularCall(int mntsCall){


		}
 
    	public int calculatePrice(int timeCall){
			
			return 0;
		}
 
	}
	
	