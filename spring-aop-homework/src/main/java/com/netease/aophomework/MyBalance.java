package com.netease.aophomework;

public class MyBalance {
	int sum;
	
	public int add(int income) {
		sum = sum +income;
		System.out.println("���룺"+income);
		return sum;
	}

	public int sub( int expense) {
		sum = sum-expense;
		System.out.println("֧����"+expense);
		return sum;
	}
	
	public int showBalance(){
		System.out.println("��"+ sum);
		return sum;
		
	}
}
