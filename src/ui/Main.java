package ui;

import java.util.Scanner;
import model.CompanyController;


public class Main {
    private Scanner sc;
    private CompanyController controller;

    public Main () {
        sc = new Scanner(System.in);
        controller = new CompanyController();
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Start Application");
        //main.run();
    }

    public void addLine(){
        String status = " ";
        int numCalls = 0, minLocal = 0, minCel = 0, minLarge = 0;
        System.out.println("******LINE-TYPE******\n"+
            "1.Basic line.\n"+
            "2.Mobile line.\n"+
            "3.VozIP line.\n"+
            "Option: ");
        int opc = sc.nextInt();

        switch(opc){
            case 1:
            //int numberOfCalls, int minOfLocalCalls
                //numCalls = 
                
                //stauts = controller.addBasicPhoneLine();
                break;
            case 2:
            
        }

    }

    public void calculateBasicLine(){


    }

    public void calculateLocalPayment(){


        
    }
}