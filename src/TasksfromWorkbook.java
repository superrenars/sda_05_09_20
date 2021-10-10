package com.company;
import java.util.Scanner;

public class TasksfromWorkbook {
    public static void main(String[] args) {
        All_Digits();
        //   First_Digits();
        // Last_Digits();
        //Up();
        ;
    }


    public static void All_Digits() {
        int[] masivs = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};
        System.out.print("Skaitļu rinda:");
       // for (int i = 0; i < 10; i++)
        for(int i = 10; i > -4; i--)
            System.out.print(" " + masivs[i]);
        System.out.println();
    }
}

  /*   public static void First_Digits() {
        int[] masivs = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};
        System.out.print("Skaitļu rinda:");
        for (int i = 0; i < 6; i++)
            // for (int i = 0; i >=masivs.length-6; i++)
            System.out.print(" " + masivs[i]);
        System.out.println();
    }

    public static void Last_Digits() {
        int[] masivs = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};
        System.out.print("Skaitļu rinda:");
        for (int i = 0; i < 10; i++);
        //for (int i = masivs.length-1;i >= masivs.length-6; i--)
        System.out.print(" " + masivs[i]);
        System.out.println();
    }
}
   public static void Up()
    {
        String hello = "Hello, World!";
        hello = hello.toUpperCase();
        System.out.println(hello);
    }


        public static void Skaitli() {
        Scanner input = new Scanner(System.in);
            int a;
            // System.out.print("Ievadi skaitli a: ");
            a = input.nextInt();

            int b;
            // System.out.print("Ievadi skaitli b: ");
            b = input.nextInt();
            int summa = 0;
            for(int i = a; i <= b; i++) {
                summa += i;
            }
            if(a>=b){
                System.out.println("Job completed");
            } else{
                System.out.println(summa);
            }





            // Implement your solution here
        }
    }

/*    public static void Last_Digits() {
        int[] masivs = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};
        System.out.print("Skaitļu rinda:");
        for (int i =9; i > 3; i--)
            System.out.print(" " + masivs[i]);
        System.out.println();
    }
*/



