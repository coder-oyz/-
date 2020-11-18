package com.oyz.test6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FreeLink link=new FreeLink();
		
		link.init();
		
		link.insertBefore(new Process(0, 0, 16));
		
		for(;;) {
			System.out.print("是否主要进行内存操作（1/0）：");
			int flag=sc.nextInt();
			if(flag==1) {
				link.waitRequest();
				link.waitRelease();
			}else {
				break;
			}
			System.out.println("是否查看（1/0）：");
			int fl=sc.nextInt();
			if(fl==1) {
				link.printAll();
			}
		}
		link.printAll();
		
	}
}
