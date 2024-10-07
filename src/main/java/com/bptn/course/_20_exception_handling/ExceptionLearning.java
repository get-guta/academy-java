package com.bptn.course._20_exception_handling;

public class ExceptionLearning{

    public static void main(String[] args) {

        try {
            //  Block of code to try
            int a = 11, b = 0;
            System.out.println(a/b);
            // ArithmeticException handling 
        } catch (ArithmeticException e) {
            //  Block of code to handle errors
            System.out.println("The number cannot be divided by zero: Error." + e);
        }
    }

}
