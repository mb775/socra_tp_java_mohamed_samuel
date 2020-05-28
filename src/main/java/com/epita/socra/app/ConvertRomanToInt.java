package com.epita.socra.app;

import java.util.ArrayList;

public class ConvertRomanToInt {
    public static int convert(String RomanNumber) {
        int IntTab[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String RomanTab[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        
        int res = 0;

        for (int i = 0; i < RomanNumber.length(); i++) {
            Boolean b = false;
            for (int j = 0; j < RomanTab.length; j++)
            {
                String elm = RomanTab[j];
                int count = 0;

                for (int k = 0; k < elm.length(); k++) {
                    System.out.print("element :");
                    System.out.println(elm);
                    System.out.print("rest of number :");
                    System.out.println(RomanNumber.substring(i));
                    if (elm.charAt(k) == RomanNumber.charAt(i)) {
                        count++;
                        i++;
                        if (k + 1 == elm.length()) {
                            b = true;


                        }
                    }
                    break;
                }

                if (b) {
                    res = res + IntTab[j];
                    i = i - 1;
                    break;
                }
                i = i - count;
            }
        }
        return res;
    }
}
