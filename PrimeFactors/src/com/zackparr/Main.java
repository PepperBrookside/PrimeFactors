package com.zackparr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int num;
        do{
            System.out.println("Please enter a number:");
            num = scan.nextInt();
        }while (num<2);

        while (num%2==0){
            System.out.println("2");
            num = num/2;
        }

        factor(num);

    }

    private static void factor(int n){
        if(isPrime(n)){
            System.out.println(n);
            return;
        }

        for(int i =3; i<=n; i+=2){
            if(n%i==0 && isPrime(i)){
                System.out.println(i);
                factor(n/i);
                break;
            }
        }
    }

    private static boolean isPrime(int n){
        if(n==1) return false;

        for(int i=3; i<=Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
