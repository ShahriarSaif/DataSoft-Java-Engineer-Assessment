package com.datasoft.javaengineersassessment.solution;

import java.util.Scanner;
import java.util.Iterator;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;
import com.google.gson.*;
import org.json.*;
import com.datasoft.javaengineersassessment.utils.IO;

public class Solution implements Runnable
{

	@Override
	public void run()
	{
		IO io = new IO();
		int numTestCases = Integer.parseInt(io.readLine());
		int testCase = 1;

		while(testCase <= numTestCases) {
			String numbers[] = io.readLine().split(" ");
			int numTables = Integer.parseInt(numbers[0]);
			int numObjs = Integer.parseInt(numbers[1]);
			System.out.println(numTestCases);
			System.out.println(numTables);
			System.out.println(numObjs);
			String meta = io.readLine();
			System.out.println(meta);

			String json = io.readLine();
			JSONObject job = new JSONObject(json);

			Iterator<String> keysItr = job.keys();
			System.out.print("id ");
			while(keysItr.hasNext()) 
				System.out.print(keysItr.next() + " ");
			System.out.println();
			String[] stringType, objType, arrType;
			int stringTypeCounter = 0, objTypeCounter = 0, arrTypeCounte = 0;
			keysItr = job.keys();

    		while(keysItr.hasNext()) {
    			String key = keysItr.next();
    			if(job.get(key) instanceof JSONObject) {
    				JSONObject innerJob = new JSONObject(job.get(key).toString());
    				Iterator<String> keysItrInner = innerJob.keys();
    				System.out.print("id ");
    				while(keysItrInner.hasNext())
						System.out.print(keysItrInner.next() + " ");
					System.out.println();
    			}
    			else if(job.get(key) instanceof JSONArray){
    				System.out.print("id ");
    				System.out.print(key);
    				System.out.println();
    			}
    		}
			++testCase;
		}
	}
}
