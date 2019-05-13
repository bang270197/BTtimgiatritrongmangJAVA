package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] student={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a name student");
        String name=scanner.nextLine();
        boolean flag=false;
        for (int i=0;i<student.length;i++){
            if (name.equals(student[i])){
                System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
            flag=true;
            break;

            }
        }
   if (!flag){
       System.out.println("Not found" + name + " in the list.");
   }
    }
}
