package com.house;
import java.io.*;


public class mainhouse{

public static void main(String[] args)throws IOException {
	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the area of material for standard material,above standard material,high standard material");
	int stdmat = Integer.parseInt(inp.readLine());
	int abovestdmat= Integer.parseInt(inp.readLine());
	int highstdmat = Integer.parseInt(inp.readLine());
	System.out.println("enter yes if you want fully automated home or no if you don't");
	String str = inp.readLine();
	house h = new HighStandard(stdmat,abovestdmat,highstdmat,str.equals("yes"));
	System.out.println("Total cost of the house is:"+h.totalCost());
	System.out.println("Enter Principle, rate and time:");
	float principle = Float.parseFloat(inp.readLine());
	float rate = Float.parseFloat(inp.readLine());
	float time = Float.parseFloat(inp.readLine());
	interest o = new interest(principle,rate,time);
	System.out.println("Simple Interest:"+o.simpleInterest());
	System.out.println("Compound Interest:"+o.compoundInterest());
}
}
