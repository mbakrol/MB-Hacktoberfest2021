package com.company;


import java.io.*;
import java.util.*;
    class test
    {
        public static void main(String []args)
        {
            Scanner q = new Scanner(System.in);
            int p=q.nextInt();
            int a=1,b=1;
            System.out.print(a+" "+b+" ");
            for(int i=2;i<p;i++)
            {
                int sum=a+b;
                    System.out.print(sum+" ");

                a=b;
                b=sum;

            }


        }


    }

