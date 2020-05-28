package com.epita.socra.app;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertRomanToInt {

    private static int countStringInString(String str, String StringPattern) {
        int res = 0;

        Pattern pattern = Pattern.compile(StringPattern);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            res++;
        }

        return res;
    }

    private static String DeletePattern(String str, String pattern) {
        StringBuilder rep = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int save = i;
            boolean b = false;
            for (int j = 0; j < pattern.length() && i < str.length(); j++, i++) {
                if (str.charAt(i) != pattern.charAt(j) || (i + 1 >= str.length() && j + 1 < pattern.length())) {
                    b = true;
                    break;
                }
            }

            if (b) {
                i = save;
                rep.append(str.charAt(i));
            }
            else
            {
                i--;
            }
        }
        return rep.toString();
    }


    public static int convert(String RomanNumber) {
        int IntTabDouble[] = {4,9,40,90,400,900};
        String RomanTabDouble[] = {"IV","IX","XL","XC","CD","CM"};
        int IntTabSimple[] = {1,5,10,50,100,500,1000};
        String RomanTabSimple[] = {"I","V","X","L","C","D","M"};

        int res = 0;

        for (int i = 0; i < RomanTabDouble.length; i++) {
            int mul = countStringInString(RomanNumber, RomanTabDouble[i]);
            RomanNumber = DeletePattern(RomanNumber, RomanTabDouble[i]);
            res = res + (mul * IntTabDouble[i]);
        }
        for (int i = 0; i < RomanTabSimple.length; i++) {
            int mul = countStringInString(RomanNumber, RomanTabSimple[i]);
            RomanNumber = DeletePattern(RomanNumber, RomanTabSimple[i]);
            res = res + (mul * IntTabSimple[i]);
        }


        return res;
    }
}
