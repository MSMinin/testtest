package testtest;

import java.util.Scanner;

public class TestClass {
	TestDTO dto;
	public TestClass() {
		dto = new TestDTO();
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		int num;
		int a = 800, b = 200, c = 300, d = 400, e = 500;
		while(true) {
			System.out.println("1. 휴지 : "+a);
			System.out.println("2. 물  : "+b);
			System.out.println("3. 라면  : "+c);
			System.out.println("4. 세제 : "+d);
			System.out.println("5. 수건 : "+e);
			System.out.println("선택해주세요 ");
			num = input.nextInt();
			switch(num) {
			case 1 :
				System.out.println("몇개 담을까요");
				num = input.nextInt();
				dto.setA(num);
				break;
			case 2 :
				System.out.println("몇개 담을까요");
				num = input.nextInt();
				dto.setB(num);break;
			case 3 :
				System.out.println("몇개 담을까요");
				num = input.nextInt();
				dto.setC(num);break;
			case 4 :
				System.out.println("몇개 담을까요");
				num = input.nextInt();
				dto.setD(num);break;
			case 5 :
				System.out.println("몇개 담을까요");
				num = input.nextInt();
				dto.setE(num);break;
			case 6 : return;
				
				
			
			}
			
		}
	}
}
