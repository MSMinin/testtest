package testtest;

import java.util.Scanner;

public class TestClass {
	TestDTO dto;
	public TestClass() {
		dto = new TestDTO();
	}
	public void display(int a, int b, int c, int d, int e) {
		Scanner input = new Scanner(System.in);
		int num, n;
		
		while(true) {
			System.out.println("1. 휴지의 가격은 " + a + "원 입니다.");
			System.out.println("2. 물의 가격은 " + b + "원 입니다.");
			System.out.println("3. 라면의 가격은 " + c + "원 입니다.");
			System.out.println("4. 세제의 가격은 " + d + "원 입니다.");
			System.out.println("5. 수건의 가격은 " + e + "원 입니다.");
			System.out.println("6. 나가기");
			System.out.print("구매하실 물건을 선택해주세요. : ");
			num = input.nextInt();
			switch(num) {
				case 1 :
					System.out.print("몇개 담을까요. : ");
					n = input.nextInt();
					dto.setA(n);
					System.out.println(dto.getA());
					break;
				case 2 :
					System.out.print("몇개 담을까요. : ");
					n = input.nextInt();
					dto.setB(n);
					System.out.println(dto.getB());
					break;
				case 3 :
					System.out.print("몇개 담을까요. : ");
					n = input.nextInt();
					dto.setC(n);
					System.out.println(dto.getC());
					break;
				case 4 :
					System.out.print("몇개 담을까요. : ");
					n = input.nextInt();
					dto.setD(n);
					System.out.println(dto.getD());
					break;
				case 5 :
					System.out.print("몇개 담을까요. : ");
					n= input.nextInt();
					dto.setE(n);
					System.out.println(dto.getE());
					break;
				case 6 : 
					return;	
			}
		}
	}
}
