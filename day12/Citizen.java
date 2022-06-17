package com.day12;

public class Citizen {
String name;
String adharname;
String mobilenumber;
void display() {
	System.out.println(name);
System.out.println(adharname);
System.out.println(mobilenumber);

}
public Citizen(String name, String adharname, String mobilenumber) {
	super();
	this.name = name;
	this.adharname = adharname;
	this.mobilenumber = mobilenumber;
}
}
