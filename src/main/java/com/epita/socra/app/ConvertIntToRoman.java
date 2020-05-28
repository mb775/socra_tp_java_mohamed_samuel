package com.epita.socra.app;

public class ConvertIntToRoman {

    public static String convert(int Number) {
        int IntTab[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String RomanTab[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        StringBuilder res = new StringBuilder();


        for (int i = RomanTab.length - 1; i >= 0; i--) {
            while (Number >= IntTab[i]) {
                Number = Number - IntTab[i];
                res.append(RomanTab[i]);
            }
        }
        return res.toString();
    }
}
