package Batch1Sat;

import java.util.*;
public class Stringrev{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the sentence: " );
        String senetence = obj.nextLine();
        System.out.println("The sentencce is :"+senetence);
        obj.close();
        String rev = "";
        for(int i = senetence.length()-1; i>=0; i--){
            rev = rev + senetence.charAt(i);
        }
        System.out.println("The reversed sentence is: "+rev);
    }
}