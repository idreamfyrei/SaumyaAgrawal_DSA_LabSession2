package com.gl.paymoneyinterface;

import java.util.Arrays;

	public class TransactionTarget {

		private int[] transactions;
		private int dailyTarget;
		
		private boolean outcome;

		public TransactionTarget (int[] transactions, int dailyTarget) {
			this.transactions = transactions;
			this.dailyTarget = dailyTarget;
			this.outcome = false;
		}
		
		public int[] getTransactions() {
			return transactions;
		}

		public void setTransactions(int[] transactions) {
			this.transactions = transactions;
		}

		public int getDailyTarget() {
			return dailyTarget;
		}

		public void setDailyTarget(int dailyTarget) {
			this.dailyTarget = dailyTarget;
		}

		public boolean isOutcome() {
			return outcome;
		}

		public void setOutcome(boolean outcome) {
			this.outcome = outcome;
		}
		
		//transaction
		void determine() {
			int sum = 0;      
	        int transactionCounter = 0;
	       
	        for (int index = 0; index < transactions.length; index ++) {
	           
	            int transactionValue = transactions[index];
	           
	            sum = sum + transactionValue;
	           
	            if (sum >= dailyTarget) {
	           
	                outcome = true;
	                transactionCounter = index + 1;
	                break;
	            }
	        }
	        
	        if (outcome) {
	            System.out.println(
	                String.format(
	            "Daily target of %d is achieved after %d transactions - from the transactions list [%s]",
	                dailyTarget, transactionCounter, Arrays.toString(transactions)));
	        }else {
	            System.out.println(
	                String.format(
	                "Daily target of %d CANNOT BE Achieved - from the transactions list [%s]",
	                dailyTarget, Arrays.toString(transactions)));
	        }



		}
			
		
	}


