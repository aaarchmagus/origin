package com.netease.aophomework;

public class MyBalance {
	int sum;
	
	public int add(int income) {
		sum = sum +income;
		System.out.println("收入："+income);
		return sum;
	}

	public int sub( int expense) {
		sum = sum-expense;
		System.out.println("支出："+expense);
		return sum;
	}
	
	public int showBalance(){
		System.out.println("余额："+ sum);
		return sum;
		
	}
}
