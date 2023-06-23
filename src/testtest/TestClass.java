package testtest;

import java.util.Scanner;

public class TestClass {
	
	Scanner input = new Scanner(System.in);
	int num, n;
	
	public void display(int a , int b, int c, int d, int e, TestDTO dto) {
		
		while(true) {
			System.out.println("1. 휴지 : " + a);
			System.out.println("2. 물  : " + b);
			System.out.println("3. 라면  : " + c);
			System.out.println("4. 세제 : " + d);
			System.out.println("5. 수건 : " + e);
			System.out.println("6. 나가기 ");
			System.out.print("물건 선택 >> ");
			num = input.nextInt();
			
			switch(num) {
			case 1 :
				System.out.println("몇개 담을까요");
				n = input.nextInt();
				dto.setA(n);				
				break;
			case 2 :
				System.out.println("몇개 담을까요");
				n = input.nextInt();
				dto.setB(n);
				break;
			case 3 :
				System.out.println("몇개 담을까요");
				n = input.nextInt();
				dto.setC(n);
				break;
			case 4 :
				System.out.println("몇개 담을까요");
				n = input.nextInt();
				dto.setD(n);
				break;
			case 5 :
				System.out.println("몇개 담을까요");
				n = input.nextInt();
				dto.setE(n);
				break;
			case 6 : 
				return;			
			}
		}
	}	
}
