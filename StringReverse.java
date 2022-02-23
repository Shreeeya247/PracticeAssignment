package com.company;

import java.util.Scanner;

public class StringReverse {
    public void ReverseMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String sentence = scan.nextLine();

        System.out.println("Input String: " + sentence);
        String words[] = sentence.split(" ");
        String reversesentense = "";

        for (int i = 0;i < words.length; i++){
            String word = words[i];
            String reverseword = "";
            for (int j = word.length()-1; j >= 0; j--){
                reverseword = reverseword + word.charAt(j);
            }
            reversesentense = reversesentense + reverseword + " ";
        }
        System.out.println("Reversed String: " + reversesentense);
    }
    public static void main(String[] args){
        StringReverse ob = new StringReverse();
        ob.ReverseMethod();
    }
}
