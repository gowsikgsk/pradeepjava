package exceptionhandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOProgram {
	public static void main(String[] args) 
	{
		String a = null;
		try 
		{
			Scanner user = new Scanner(System.in);
			System.out.println("Enter the file name");
			a = user.nextLine();

			FileReader fr = new FileReader("C:/Users/sys/Desktop/" + a);
			int i;
			while ((i = fr.read()) != -1) 
			{
				System.out.print((char) i);
			}
			fr.close();

			FileWriter fw = new FileWriter("C:/Users/sys/Desktop/" + a);
			String s = " ";
			fw.write(s);
			fw.flush();
			fw.close();
		} 
		catch (Exception e) 
		{
			try 
			{
				FileWriter fw = new FileWriter("C:/Users/sys/Desktop/" + a);
				String s = "i'm done";
				fw.write(s);
				fw.flush();
				fw.close();
			} 
			catch (Exception ee) 
			{
				System.out.println(ee);
			}
			//System.out.println(e);
		}
	}
}
