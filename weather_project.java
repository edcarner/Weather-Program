package weather_project;             // Eric Carner

import java.util.Scanner;

public class weather_project
{

	public static void main(String[] args) 
	{
		System.out.print("Type in degrees in Fahrenheit ");
		
		Scanner cin = new Scanner(System.in);
		
		double temperature = cin.nextInt();
		
		temperature = (((double)temperature - 32) * 5/9 );
		
		System.out.println(temperature); System.out.println("Degrees Celcius ");
		
		 
		if(temperature<0) 
		{
			System.out.println("It is cold out today ");
		}
		else if(temperature>32.23)
		{
			System.out.println("it is hot outside ");
		}
		cin.close();
				
	}

}