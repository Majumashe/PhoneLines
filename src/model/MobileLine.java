package model;

	public class MobileLine extends BasicPhoneLine implements CellularCaller{
		public static final int MOBILE_PRICE_CALL = 10;
		private int minOfCellularCalls;

		//constructor
		public MobileLine(int minsCelular, int minsLocal){
			super(minsLocal); //Llama el constructor de la clase padre
			minOfCellularCalls = minsCelular;

		}
		//metodos de la interfaz
		public void celularCall(int mntsCall){


		}
 
    	public int calculatePrice(int timeCall){
			
			return 0;
		}
 
	}
	
	