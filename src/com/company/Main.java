package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("tedade nomarat ra vared konid:");
        int n=input.nextInt();

        if(n<=0){
            System.out.println("error!!!");
        }

        Moadel moadel =new Moadel();
        if(n>0){
            double nomre[]=new double[n];
            System.out.println("nomarate khod ra vared konid:");
            for(int i = 0; i < n ; i++) {
                nomre[i]= input.nextFloat();
            }
            moadel.avg(n,nomre);
        }
    }
}
