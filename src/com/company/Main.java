package com.company;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Now it we will enter value1");
        String value1 = bufferedReader.readLine();

        System.out.println("Now it we will enter value2");
        String value2 = bufferedReader.readLine();

        double intValue1 = Double.parseDouble(value1);
        double intValue2 = Double.parseDouble(value2);

        double result = sum(intValue1, intValue2);

        System.out.println("result sum = " + result);

    }
    static int sum(int intValue1, int intValue2)
    {
        return intValue1 + intValue2;
    }

    static double sum(double intValue1, double intValue2)
    {
        return intValue1 + intValue2;
    }
}
