/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String Str1="";
        String Str2="";
        String Str3="";
        String Str4="";
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a noun: ");
        Str1=input.nextLine();
        System.out.print("Enter a verb: ");
        Str2=input.nextLine();
        System.out.print("Enter an adjective: ");
        Str3=input.nextLine();
        System.out.print("Enter an adverb: ");
        Str4=input.nextLine();
        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!",Str2,Str3,Str1,Str4));
    }
}