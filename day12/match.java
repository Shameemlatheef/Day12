package com.day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class match {
	int count=0;
	
	public static void main(String[] args) {
		match h=new match();
		Pattern p=Pattern.compile("Java");
		Matcher m=p.matcher("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language"+"intended to let programmers write once, run anywhere "
			+ "(WORA)meaning that compiled Java code can run on all platforms that support Java without the need to recompile. Java applications are typically compiled to bytecode that can run on any Java virtualmachine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar toC and C++, but has fewer low-level facilities than either of them. The Java runtime providesdynamic capabilities (such as reflection and runtime code modification) that are typically notavailable in traditional compiled languages. As of 2019, Java was one of the most popularprogramming languages in use according to GitHub, particularly for client–server web applications,with a reported 9 million developers.");
		while (m.find()) {
			h.count++;
			System.out.println(m.start() + "------" + m.end() + "------" + m.group());
			}
			System.out.println("The no of occurences:" + h.count);
		

	}
	}
	


