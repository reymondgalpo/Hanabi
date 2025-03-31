package Galpo.com.ex;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
	  //initialization 
	  String Bank ="China Bank";
	  String Code = "0101";
	  String nBank = null;
	  String nCode = null;
	  Scanner input = new Scanner(System.in); //Creating scanner obj
	  
	  	System.out.println("Enter credit card");
	  do {
	  	System.out.print("Credit card");
	  	nBank = input.next(); //user input
	  	System.out.print("");
	  	nCode = input.next(); //user input
	  	if (nBank.equals(Bank)&& nCode.equals(Code)){
	  	  System.out.println("Bank and Code code");
} else { 
			System.out.println("Invalide bank or code"); 
	}
}while(!nBank.equals(Bank) || !nCode.equals(Code)); 

}//main

 }//class
