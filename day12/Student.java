package com.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {
	
public boolean validate(String name,String adhar,String mob) {
	if(Pattern.matches("[6-9]{1}[0-9]{9}", mob))
	{
		if(Pattern.matches("[0-9]{12}", adhar))
				{
			if(Pattern.matches("[a-zA-Z]{3,8}",name))
			{
				Citizen c=new Citizen(mob,name,adhar);
				c.display();
			}
			else{
				System.out.println("enter valid name");
			}
		}
		else {
			System.out.println("emter valid adhar");
		}
		
	}
	else {
		System.out.println("emter valid mob");
	}
	return true;
}
	
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("emter name");
	String name=s.next();
	System.out.println("emter adhar");
	String adhar=s.next();
	System.out.println("enter mobile");
	String mob=s.next();
	
	
	Student o=new Student();
	o.validate(name,adhar,mob);
	
	
}
}
