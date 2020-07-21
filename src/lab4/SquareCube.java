package lab4;

import java.util.Scanner;

public class SquareCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int number;
		String str;
		do
		{
			System.out.println("Learn your squares and cubes!");
			System.out.println("Enter an integer");
			number=scnr.nextInt();
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			for(int i=1; i<=number;i++)
			{
				System.out.println(i+"\t"+(i*i)+"\t"+(i*i*i));
			}
			System.out.println("Multiplication Table");
			System.out.print("\t");
			for(int i=1;i<=number;i++)
			{
				System.out.print("\t"+i);
				
			}System.out.println();
			System.out.print("\t");
			for(int i=1;i<=number;i++)
			{
				System.out.print("\t"+"=");
				
			}System.out.println();
			
			for(int i=1; i<=number;i++)
			{
						
				System.out.print(i+"\t|");
				for(int j=1;j<=number;j++)
				{
				System.out.print("\t"+(i*j));
				}
				System.out.println();
			}
			
			System.out.println("Do you want to continue?(y/n)");
			str=scnr.next();
		}while(str.equalsIgnoreCase("yes"));
		System.out.println("Thanks for using the application");
		scnr.close();

	}

}
