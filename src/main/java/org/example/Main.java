package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrId = new String[0];
        String[] arrName = new String[0];
        int[] arrSub1 = new int[0];
        int[] arrSub2 = new int[0];
        int[] arrSub3 = new int[0];

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("Enter your choice: ");
            System.out.println("3. Exit");
            int choice = input.nextInt();
            if (choice == 1) {                        //Add New Student
                System.out.println("Enter Student ID: ");
                input.nextLine();
                String id = input.nextLine();
                System.out.println("Enter Student Name: ");
                String name = input.nextLine();
                System.out.println("Enter marks in subject 1: ");
                int sub1 = input.nextInt();
                System.out.println("Enter marks in subject 2: ");
                int sub2 = input.nextInt();
                System.out.println("Enter marks in subject 3: ");
                int sub3 = input.nextInt();

                arrId = extendAddString(arrId, id);
                arrName = extendAddString(arrName, name);
                arrSub1 = extendAddInteger(arrSub1, sub1);
                arrSub2 = extendAddInteger(arrSub2, sub2);
                arrSub3 = extendAddInteger(arrSub3, sub3);
            }
        }
    }
    public static int[] extendAddInteger (int[] oldArray, int value) {
        int [] temp = new int[oldArray.length + 1];
        for (int i = 0; i<oldArray.length; i++) {
            temp[i] = oldArray[i];
        }
        temp[temp.length-1] = value;
        return temp;
    }
    public static String[] extendAddString (String[] oldArray, String value) {
        String [] temp = new String[oldArray.length + 1];
        for (int i = 0; i<oldArray.length; i++) {
            temp[i] = oldArray[i];
        }
        temp[temp.length-1] = value;
        return temp;
    }
}