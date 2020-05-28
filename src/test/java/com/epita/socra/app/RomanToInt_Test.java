package com.epita.socra.app;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToInt_Test {
    @Test
    public void givenRoman32_WhenRunningAFunction_ThenReturnAInt()
    {
        int exepted = 32;
        String RomanNumber = "XXXII";

        int result = ConvertRomanToInt.convert(RomanNumber);

        assertEquals(exepted,result);
    }


    @Test
    public void givenRoman3000_WhenRunningAFunction_ThenReturnAInt()
    {
        int exepted = 3000;
        String RomanNumber = "MMM";

        int result = ConvertRomanToInt.convert(RomanNumber);

        assertEquals(exepted,result);
    }

    @Test
    public void givenRoman5_WhenRunningAFunction_ThenReturnAInt()
    {
        int exepted = 5;
        String RomanNumber = "V";

        int result = ConvertRomanToInt.convert(RomanNumber);

        assertEquals(exepted,result);
    }

    @Test
    public void givenRoman14_WhenRunningAFunction_ThenReturnAInt()
    {
        int exepted = 14;
        String RomanNumber = "XIV";

        int result = ConvertRomanToInt.convert(RomanNumber);

        assertEquals(exepted,result);
    }

    @Test
    public void givenRoman70_WhenRunningAFunction_ThenReturnAInt()
    {
        int exepted = 70;
        String RomanNumber = "LXX";

        int result = ConvertRomanToInt.convert(RomanNumber);

        assertEquals(exepted,result);
    }


    @Test
    public void givenRoman196_WhenRunningAFunction_ThenReturnAInt()
    {
        int exepted = 196;
        String RomanNumber = "CXCVI";

        int result = ConvertRomanToInt.convert(RomanNumber);

        assertEquals(exepted,result);
    }


}
