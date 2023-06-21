package com.bridglabz.linecomp;
import java.util.Scanner;
public class LineComp {
        void LengthOfTwoPoint() {
            System.out.println("welcome to the Line Comparison");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first Line x1");
            double fx1 = sc.nextDouble();
            System.out.println("Enter first Line x2");
            double fx2 = sc.nextDouble();
            System.out.println("Enter first Line y1");
            double fy1 = sc.nextDouble();
            System.out.println("Enter first Line y2");
            double fy2 = sc.nextDouble();
            System.out.println("Enter second Line x1");
            double Sx1 = sc.nextDouble();
            System.out.println("Enter second Line x2");
            double Sx2 = sc.nextDouble();
            System.out.println("Enter second Line y1");
            double Sy1 = sc.nextDouble();
            System.out.println("Enter second Line y2");
            double Sy2 = sc.nextDouble();
            double fx = Math.pow((fx2 - fx1), 2);
            double fy = Math.pow((fy2 - fy1), 2);
            double lengthOfLine1 = Math.sqrt(fx + fy);
            double Sx = Math.pow((Sx2 - Sx1), 2);
            double Sy = Math.pow((Sy2 - Sy1), 2);
            double lengthOfLine2 = Math.sqrt(Sx + Sy);
            System.out.println("Length of first Line=====>" + lengthOfLine1);
            System.out.println("Length of second Line=====>" + lengthOfLine2);

        if(lengthOfLine1==lengthOfLine2) {
            System.out.println("is equal");

        }else if(lengthOfLine1>lengthOfLine2){
            System.out.println("length of first line is greater====> "+lengthOfLine1);
        }else if(lengthOfLine2>lengthOfLine1){
            System.out.println("length of second line is greater=====>"+lengthOfLine2);
        }else {
            System.out.println("");

        }
        }

    public static void main(String[] args) {
        LineComp e=new LineComp();
        e.LengthOfTwoPoint();
    }




    }




