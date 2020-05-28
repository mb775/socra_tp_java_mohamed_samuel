package com.epita.socra.app;


import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Roman_test {
    @Test
    public void givenInt32_WhenRunningAFunction_ThenReturnARomanString()
    {
        int number = 32;
        String expected = "XXXII";

        String roman_string = ConvertToRoman.convert(number);


        assertEquals(expected, roman_string);

    }
}
