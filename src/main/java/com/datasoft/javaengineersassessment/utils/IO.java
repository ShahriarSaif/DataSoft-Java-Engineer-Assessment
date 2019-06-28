package com.datasoft.javaengineersassessment.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class IO
{
	private static final BufferedReader reader;
	
	static {
		try {
			FileInputStream instream = new FileInputStream("D:/Shahriar Saif/workspace/DataSoft/Java-Engineers-Assessment/src/main/java/com/datasoft/javaengineersassessment/solution/buffer_input.txt");
			System.setIn(instream);
		} 
		catch(IOException e) {
		   System.err.println(e);
		}
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	
	public static String readLine()
	{
		try {
			return reader.readLine().trim();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
