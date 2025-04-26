package TestFinal;

import java.util.Scanner;

import Service.India;

public class test {

	public static void main(String[] args) 
	{
		India i=new India();
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("*****************WHELCOM VEHICLE PROJECT***********");
			System.out.println(" 1> REG_VEHICL \n 2> VIEW_DETAILS \n 3>UPDATE_DETAILS");
			
			System.out.println("Enter Your Choise: ");
			int ch=s.nextInt();
			
			switch(ch)
			{
				
				case 1: i.regVehicle();
						break;
						
				case 2: i.viewDetails();
						break;
						
				case 3: i.updateDetails();
						break;
						
				default : System.out.println("Wrong Enter: ");
		
			
			}
		
		
		
		}
	}

}
