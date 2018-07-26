import java.util.*;
public class Forclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print 10 even and odd numbers
		String even="",odd="";
		for (int i=1;i<=20;i++) 
		{
			if (i%2==0)
			{
				even=i+" ";
			}
			else
			{
				odd=i+" ";
			}
		}
		System.out.println("Even numbers ="+even);
		System.out.println("Odd numbers ="+odd);

	}

}
