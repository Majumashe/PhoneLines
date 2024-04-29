package model;

public class CompanyController{
	
	private BasicPhoneLine[] basicLines;
	
	public CompanyController(){
		this.basicLines = new BasicPhoneLine[1000];
	}
	
	public int calculateTotalPayment(){

		return 0;
		
	}

	
	
	public String addBasicPhoneLine(int numberOfCalls, int minOfLocalCalls){
		String msg = "";
			for(int i = 0; i<basicLines.length; i++){
				if(basicLines[i] == null){
					basicLines[i] = new BasicPhoneLine(numberOfCalls, minOfLocalCalls);
					msg = "New phone line";
				}
			}
			
		return msg;
	}

	public String addMobileLine(int numberOfCalls, int minOfLocalCalls, int minOfCelular){
		String msg = "";

		for(int i = 0; i<basicLines.length; i++){
			if(basicLines[i] == null){
				basicLines[i] = new MobileLine(numberOfCalls, minOfLocalCalls, minOfCelular);
				msg = "New phone line";
			}
		}
		
		return msg;
	}

	public String addVozIPLine(int numberOfCalls, int minOfLocalCalls, int minOfCelular, int minLargeDistance){
		String msg = "";

		for(int i = 0; i<basicLines.length; i++){
			if(basicLines[i] == null){
				basicLines[i] = new VoiceIPLine(numberOfCalls, minOfLocalCalls, minOfCelular, minLargeDistance);
				msg = "New phone line";
			}
		}
		
		return msg;
	}



	public String showLines(){

		String msg = " ";

		for(int i = 0; i<basicLines.length; i++){
			if(basicLines[i] !=null){
				msg = basicLines[i].toString() + "\n";

			}

		}
	

		return msg;


	}
}