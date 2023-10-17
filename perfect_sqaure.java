package spiders;

import java.util.Scanner;

public class perfect_sqaure {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=1;
		for( ;i*i<=a;i++) {
			if(i*i==a) {
				System.out.println("perfect");
				break;
			}
		}
		if(i*i>a) {
			System.out.println("not a perfect sqaure");
		}
}}
