package com.demo.Test;

import java.util.Scanner;

import com.demo.Beans.WrongNumberException;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(true){
		try {
			if(a==2) {
				System.out.println("you got the number");
				break;
			}
			else {
				throw new WrongNumberException("try again ");
			}
			
		}catch(WrongNumberException e){
			System.out.println(e.getMessage());
		}

	}
	}
}
