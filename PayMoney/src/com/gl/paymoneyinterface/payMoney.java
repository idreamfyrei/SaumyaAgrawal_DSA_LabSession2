package com.gl.paymoneyinterface;

import java.util.Scanner;


public class payMoney {
	public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of transaction array :");
        int arrSize = input.nextInt();
        int[] transactions = new int[arrSize];
       
        //transaction array
        System.out.println("Enter the transaction values:");    
        for (int index = 0; index < arrSize; index ++) {
            transactions[index] = input.nextInt();
        }              
       
        System.out.print("Enter the total number of targets that needs to be achieved:");
        int targetSize = input.nextInt();
       
        for (int count = 1; count <= targetSize; count ++) {
 
            System.out.println();
            System.out.print("Enter the target value :");
            int dailyTarget = input.nextInt();
 
            System.out.println("Processing transactions with target value -> "
                                        + dailyTarget);
           
            TransactionTarget determinator =
                    new TransactionTarget (transactions, dailyTarget);
           
            determinator.determine();
           
        }
       
        if(input !=null) {
            input.close();
        }
    }

}

