package collections;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String input = sc.next();
            
        System.out.println(getVowel(input));
    
    }


	//WRITE YOUR CODE BELOW HERE
    
    
    
    public static boolean Vowels (char input){
         return (input == 'a' || input == 'e' || input == 'i'
                || input == 'o' || input == 'u');}
    

    public static getVowel(String s){
    HashSet <Character> hash = new HashSet<Character>();
    int begin = 0;
    
    for (int i = 0; i < s.length(); i++) {
        if (Vowels(s.charAt(i)) == true){
            hash.add(s.charAt(i));

            if (hash.size() == 5)
               System.out.print(s.substring(begin, i +1) + " ");
        } else {
            begin = i + 1;
            hash.clear();
        }}}}

   
    

