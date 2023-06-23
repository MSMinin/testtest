package testtest;

import java.util.Scanner;

public class TestClass {
	Scanner input = new Scanner(System.in);
	int num, n, sum;
	
	public void display(int a , int b, int c, int d, int e, TestDTO dto) {
		
		while(true) {
			System.out.println("1. 휴지 : " + a);
			System.out.println("2. 물  : " + b);
			System.out.println("3. 라면  : " + c);
			System.out.println("4. 세제 : " + d);
			System.out.println("5. 수건 : " + e);
			System.out.println("6. 나가기 ");
			System.out.print("구매하실 물건을 선택해주세요. : ");
			num = input.nextInt();
			
			switch(num) {
				case 1 :
					System.out.println("몇개 담을까요");
					n = input.nextInt();
					sum = n + dto.getA();
					dto.setA(sum);				
					break;
				case 2 :
					System.out.println("몇개 담을까요");
					n = input.nextInt();
					sum = n + dto.getB();
					dto.setB(sum);	
					break;
				case 3 :
					System.out.println("몇개 담을까요");
					n = input.nextInt();
					sum = n + dto.getC();
					dto.setC(sum);	
					break;
				case 4 :
					System.out.println("몇개 담을까요");
					n = input.nextInt();
					sum = n + dto.getD();
					dto.setD(sum);
					break;
				case 5 :
					System.out.println("몇개 담을까요");
					n = input.nextInt();
					sum = n + dto.getE();
					dto.setE(sum);	
					break;
				case 6 : 
					return;			
			}
		}
	}	
}
