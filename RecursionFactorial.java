package com.ignasku.recursion.factorial;

public class RecursionFactorial {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(3));
        System.out.println(iterativeFactorial(3));
    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!
    // n! = n * (n - 1)!

    //Does use recursion, recursive implementation
    public static int recursiveFactorial(int num){
        if (num == 0){
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }


    //Does not use recursion, iterative implementation
    public static int iterativeFactorial(int num){
        if (num == 0){
            return 1;
        }

        int factorial = 1;
        for(int i = 1; i <=num; i++){
            factorial *= i;
        }

        return factorial;
    }
}
