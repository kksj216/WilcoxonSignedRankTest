package main.java.csee.handong.edu.isel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.math3.stat.inference.WilcoxonSignedRankTest;

public class Main {
	
	
	public static void main(String args[]) throws IOException {
		
		// Read first file and save in array1 
		BufferedReader reader1 = new BufferedReader(new FileReader(args[0])); 
		String str;
		int count1 = 0;
		double[] array1 = new double[27];
		
		System.out.println("file1: " + args[0]) ;
		
		while ((str = reader1.readLine()) != null) { 
			array1[count1] = Double.parseDouble(str) ;
			if (count1 >= 26) break;
			count1++;
		}
		
		reader1.close();
		
		// Read second file and save in array2 
		BufferedReader reader2 = new BufferedReader(new FileReader(args[0])); 
		double[] array2 = new double[27];
		count1 = 0;
		
		System.out.println("file2: " + args[1]) ;
		
		while ((str = reader2.readLine()) != null) { 
			array2[count1] = Double.parseDouble(str) ;
			if (count1 >= 26) break;
			count1++;
		}
		reader2.close();
		
		double result1 ;
		double result2 ;
		
		WilcoxonSignedRankTest wilcoxon = new WilcoxonSignedRankTest();
		
		result1 = wilcoxon.wilcoxonSignedRank(array1, array2); 
		
		result2 = wilcoxon.wilcoxonSignedRankTest(array1, array2, true); 
		
		System.out.println("result1: " + result1);
		
		System.out.println("result2: " + result2);
		
//		System.out.printf("%.3f", result2) ;
		
		
		
	}

}
