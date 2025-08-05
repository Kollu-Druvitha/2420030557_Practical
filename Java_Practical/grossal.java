package myproject;
import java.util.*;
import java.util.Scanner;

public class grossal{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id: ");
		String id=sc.next();
		System.out.println("enter basic: ");
		double basic=sc.nextDouble();
		System.out.println("enter hra: ");
		double hra=sc.nextDouble();
		System.out.println("enter da: ");
		double da=sc.nextDouble();
		System.out.println("enter pf: ");
		double pf=sc.nextDouble();
		double ans=basic + basic*(hra/100) + basic*(da/100) - basic*(pf/100);
		double check=basic*(pf/100);
		System.out.println("Gross Salary is : " + ans);
		System.out.println("pf is : " + check);
		if(check>1000 && ans>20000) System.out.println("eligible");
		else System.out.println(" Not eligible");
	}
		
}
