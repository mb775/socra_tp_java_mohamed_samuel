package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void givenAMock_WhenRunningMain_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        App app = new App(mock);
        app.run();

        verify(mock).write("Hello, what's your name ?");
        verify(mock).write(argThat(message -> message.contains("TEST")));

    }

    @Test
    public void givenNumbers_whenRunningIsNeed_ThenCheckBool() {
        String str = "25";
        String need = "0123456789";


        boolean b = App.isOtherIn(str,need);
        assertEquals(true,b);
    }

    @Test
    public void givenNumbersAndChars_whenRunningIsNeed_ThenCheckBool() {
        String str = "2a5";
        String need = "0123456789";


        boolean b = App.isOtherIn(str,need);
        assertEquals(false,b);
    }


    @Test
    public void givenChars_whenRunningIsNeed_ThenCheckBool() {
        String str = "dae";
        String need = "0123456789";


        boolean b = App.isOtherIn(str,need);
        assertEquals(false,b);
    }
}
