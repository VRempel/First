//package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class first {

	/**
	 * @param args 
	 */
	public static void main(String[] args)
	{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String name;

		System.out.println("Hello...");
		System.out.println("What is your name?");

		try
		{
			name = buffer.readLine();
			System.out.println("Hello, " + name + ".");
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Catch ya later!");
	}

}

