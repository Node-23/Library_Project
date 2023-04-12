package com.lumberjack.Services;

import java.util.Scanner;

public class UIService {
    static Scanner input = new Scanner (System.in);

    public static int getUserOption(){
        return input.nextInt();
    }

    public static String getUserInput(){
        return input.nextLine();
    }

    public static void HeaderOutPut(){
        System.out.println("|------------****--------------|");
    }

    public static void FooterOutput(){
        System.out.println("|#----------------------------#|\n");
    }

    public static void lineOutput(String text){
        final int TEXT_MAX_SIZE = 28;
        if(text.trim().length() <= TEXT_MAX_SIZE){
            StringBuilder output = new StringBuilder("| ");
            output.append(text.trim());
            for (int i = 0; i < TEXT_MAX_SIZE - text.trim().length(); i++) {
                output.append(" ");
            }
            output.append(" |");
            System.out.println(output);
            return;
        }

        int linesCount = (int) Math.ceil((double) text.length() / TEXT_MAX_SIZE);
        String[] arr = new String[linesCount];

        for (int i = 0; i < linesCount; i++) {
            arr[i] = text.substring(i * TEXT_MAX_SIZE, Math.min((i + 1) * TEXT_MAX_SIZE, text.length()));
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            output.append("| ").append(arr[i]).append(i == arr.length-1? " |":" |\n");
        }
        System.out.println(output);
    }
}
