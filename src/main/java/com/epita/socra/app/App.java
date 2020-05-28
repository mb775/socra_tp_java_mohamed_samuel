package com.epita.socra.app;

import com.epita.socra.app.tools.*;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
        application.convert();
    }

    public void run(){
        adapter.write("Hello, what's your name ?");
        String name = adapter.read();
        adapter.write("Nice to meet you, " + name + " !");
    }

    public static boolean isOtherIn(String str, String NeddIn){
        for (int i = 0; i < str.length(); i++) {
            boolean b = true;
            for (int j = 0; j < NeddIn.length(); j++) {
                if (str.charAt(i) == NeddIn.charAt(j)) {
                    b = false;
                    break;
                }
            }
            if (b) {
                return false;
            }
        }
        return true;
    }

    public void convert(){
        while (true){
            adapter.write("Enter your number:");
            String entrance = adapter.read();
            if (isOtherIn(entrance, "0123456789")) {
                adapter.write(ConvertIntToRoman.convert(Integer.parseInt(entrance)));
            }
            else if (isOtherIn(entrance, "IVXLCDM")){
                adapter.write(Integer.toString(ConvertRomanToInt.convert(entrance)));
            }
            else {
                adapter.write("Nothing to be done with that.");
            }
        }
    }
}
