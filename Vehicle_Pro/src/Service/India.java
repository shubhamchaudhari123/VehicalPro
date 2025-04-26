package Service;

import java.util.Scanner;

import Registration.Vehirg;

public class India implements RTO
{
	 Vehirg v=new Vehirg();
	Scanner s=new Scanner(System.in);
	public void regVehicle() 
	{
		System.out.println("**********Whelcom Vehical Registraion************");
		
		
		System.out.println("Enter Vehical ID: ");
		v.setId(s.nextInt());
		
		System.out.println("Enter Vehical Name: ");
		v.setName(s.next());
		s.nextLine();
		
		System.out.println("Enter Gender: ");
		v.setGender(s.nextLine());
		
		
		System.out.println("Enter Price: ");
		v.setPrice(s.nextInt());
		
		
		System.out.println("Enter colour: ");
		v.setColour(s.next()+s.nextLine());
		
		
		System.out.println("Enter Mob: ");
		v.setMob(s.nextLong());
		
		System.out.println("Enter Adhar: ");
		v.setAdhar(s.nextLong());
		
        if (String.valueOf(v.getAdhar()).length() == 12) 
        {
        	System.out.println("adhar submitted");
        	
        }
        else 
        {
        	System.out.println("invalid adhar");
        }
		

		
	}


	public void viewDetails() 
	{
		
		System.out.println("**********View Your Details:*************** ");
		System.out.println(v.getId());
		System.out.println("Name: "+ v.getName());
		System.out.println("Gender: "+v.getGender());
		System.out.println("Price: "+v.getPrice());
		System.out.println("Colour: "+v.getColour());
		System.out.println("Mob: "+v.getMob());
		System.out.println("Adhar: "+v.getAdhar());
	}


	public void updateDetails() 
	{
		System.out.println("Which steps You Update: ");
		
		System.out.println(" 1>ID \n 2>PRICE  ");
		int ch=s.nextInt();
		
		switch(ch)
		{
			case 1: System.out.println("Enter new ID: ");
					v.setId(s.nextInt());
					
					System.out.println("Enter New NAME: ");
					v.setName(s.next()+s.nextLine());
					
					System.out.println("Enter New MOB: ");
					v.setMob(s.nextLong());
					
					System.out.println("Enter New ADHAR: ");
					v.setAdhar(s.nextLong());
					
					System.out.println("********VALUES UPDATED************");
					
					break;
					
			case 2: System.out.println("Enter New Price: ");
					v.setPrice(s.nextInt());
					
					System.out.println("Enter New Colour: ");
					v.setColour(s.next()+s.nextLine());
					
					System.out.println("********UPDATE SUCCESFUL*************");
					
					break;
				
			default : System.out.println("Wrong Input, Enter Valid Input: ");
		}
		
	}

	
}
