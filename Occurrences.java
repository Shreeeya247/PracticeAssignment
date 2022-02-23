package com.company;

import java.util.Scanner;

public class Occurrences {
    public void MaxMin(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String string;
        string = scan.nextLine();
        String sentence = string.replaceAll("\\s","");
        char [] characters =sentence.toCharArray();
        int [] occurrence = new int[sentence.length()];

        char maxchar =  sentence.charAt(0);
        char minchar = sentence.charAt(0);

        for (int i =0; i < characters.length; i++){
            occurrence[i] = 1;
            for (int j = i+1; j < characters.length; j++){
                if (characters[i] == characters[j] && characters[i] != ' ' && characters[i] != '0'){
                    occurrence[i]++;
                    characters[j] = '0';
                }
            }
        }

        int max = occurrence[0];
        int min = occurrence[0];
        for (int i = 0; i < occurrence.length;i++){
            if (min > occurrence[i] && occurrence[i] != '0'){
                min = occurrence[i];
                minchar = characters[i];
            }
        }
        System.out.print("Minimum occurred character: " + minchar +"\n");
        for (int i = 0; i < occurrence.length;i++) {
            if (max < occurrence[i]) {
                max = occurrence[i];
                maxchar = characters[i];
            }
        }


        System.out.print("Maximum occurred character: " + maxchar +"\n");
    }
    public static void main(String args[]){
        Occurrences ob = new Occurrences();
        ob.MaxMin();
    }

}
