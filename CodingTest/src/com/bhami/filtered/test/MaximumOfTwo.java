package com.bhami.filtered.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaximumOfTwo {
	
	public static void main(String[] args) throws Exception{
		//String FILE_PATH = "C:\\Users\\Bhami\\git\\LocalCodingTest\\CodingTest\\src\\file2.txt";
		//String FILE_PATH = "C:/Users/Bhami/git/LocalCodingTest/CodingTest/src/file2.txt";
		String FILE_PATH = "src/max2.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
        String line = br.readLine();
        int N1 = Integer.parseInt(line);
        line = br.readLine();
        int N2 = Integer.parseInt(line);
        //System.out.println(getMaxNumber(N1, N2));
        System.out.println(getMaxNumber2(N1, N2));
        int test1 = (int) Math.pow(2, (6 - 4));
        int test2 = (int) Math.pow(2, (4 - 6));
        //System.out.println("test1:" + test1 + " test2:" + test2);
	}
    static int getMaxNumber(int firstNumber, int secondNumber)
    {
        try
        {
            int result = firstNumber / (int) Math.pow(2, (firstNumber - secondNumber));
            return firstNumber;
        }
        catch (Exception Ex)
        {
        	//System.out.println("going in exception");
            return secondNumber;
        }
    }
    
    //another way of getting maximum of two without doing any operation
    static int getMaxNumber2(int firstNumber, int secondNumber) 
    {
        try
        {
            String result = String.valueOf(firstNumber - secondNumber).replace("-", "*");
            Integer.parseInt(result);
        }
        catch (Exception Ex)
        {
            return secondNumber;
        }
        return firstNumber;
    }
}
        
	