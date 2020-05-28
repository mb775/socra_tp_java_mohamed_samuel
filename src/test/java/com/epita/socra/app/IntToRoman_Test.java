package com.epita.socra.app;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntToRoman_Test {

    @Test
    public void givenInt32_WhenRunningAFunction_ThenReturnARoman() {
        int res = 32;
        String expected = "XXXII";

        String result = ConvertIntToRoman.convert(res);

        assertEquals(expected, result);
    }
    @Test
    public void givenInt3000_WhenRunningAFunction_ThenReturnARoman() {
        int res = 3000;
        String expected = "MMM";

        String result = ConvertIntToRoman.convert(res);

        assertEquals(expected, result);
    }
    @Test
    public void givenInt5_WhenRunningAFunction_ThenReturnARoman() {
        int res = 5;
        String expected = "V";

        String result = ConvertIntToRoman.convert(res);

        assertEquals(expected, result);
    }
    @Test
    public void givenInt14_WhenRunningAFunction_ThenReturnARoman() {
        int res = 14;
        String expected = "XIV";

        String result = ConvertIntToRoman.convert(res);

        assertEquals(expected, result);
    }
    @Test
    public void givenInt16_WhenRunningAFunction_ThenReturnARoman() {
        int res = 16;
        String expected = "XVI";

        String result = ConvertIntToRoman.convert(res);

        assertEquals(expected, result);
    }
    @Test
    public void givenInt70_WhenRunningAFunction_ThenReturnARoman() {
        int res = 70;
        String expected = "LXX";

        String result = ConvertIntToRoman.convert(res);

        assertEquals(expected, result);
    }
    @Test
    public void givenInt196_WhenRunningAFunction_ThenReturnARoman() {
        int res = 196;
        String expected = "CXCVI";

        String result = ConvertIntToRoman.convert(res);

        assertEquals(expected, result);
    }


}
