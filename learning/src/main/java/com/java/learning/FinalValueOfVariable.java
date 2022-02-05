package com.java.learning;

import java.util.Arrays;
import java.util.List;

/*
Qn:
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, 
return the final value of X after performing all the operations.
*/

public class FinalValueOfVariable {

	public static void main(String[] args) {
		FinalValueOfVariable obj = new FinalValueOfVariable();
		String[] operations = { "--X", "X++", "X++" };
		int finalValue = obj.finalValueAfterOperations(operations);
		System.out.println("value of finalValue: " + finalValue);
	}

	public int finalValueAfterOperations(String[] operations) {

		// Converting an Array to List
		List<String> list = Arrays.asList(operations);
		System.out.println("list:  " + list);
		int x = 0;
		for (String op : list) {
			if (op.contains("--")) {
				x = x - 1;
			} else if (op.contains("++")) {
				x = x + 1;
			}
		}
		return x;
	}
}
