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

            int choice = input.nextInt();
            if (choice == 1) {                        //Add New Student
                System.out.println("Enter Student ID: ");
                input.nextLine();
                String id = input.nextLine();
                int index = findIndexById(arrId, id);
                if (index != -1) {
                    System.out.println("Student ID Already Exist. Please Add Another Student ID");
                    continue;
                }
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
            if (choice == 2){
                System.out.println("Enter Student ID: ");
                input.nextLine();
                String id = input.nextLine();
                int index = findIndexById(arrId, id);
                if (index != -1) {
                    String name = arrName[index];
                    int sub1 = arrSub1[index];
                    int sub2 = arrSub2[index];
                    int sub3 = arrSub3[index];
                    System.out.println("*------------------*----------------------*");
                    System.out.printf("| Name             | %-30s |\n",name);
                    System.out.printf("| subject 1 Marks  | %-20d |\n",sub1);
                    System.out.printf("| subject 2 Marks  | %-20d |\n",sub2);
                    System.out.printf("| subject 3 Marks  | %-20d |\n",sub3);
                    System.out.println("*------------------*----------------------*");
                }else {
                    System.out.println("Student not found");
                }
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

    public static int  findIndexById(String[] arrId, String id) {
        for (int i = 0; i < arrId.length; i++) {
            if (arrId[i].equals(id)) {
                return i;
            }
        }
        return -1;
    }
}