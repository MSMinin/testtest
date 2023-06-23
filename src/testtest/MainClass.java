package testtest;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		FourNum f = new FourNum();
		int a = 800, b = 200, c = 300, d = 400, e = 500;
		Scanner sc = new Scanner(System.in);
		System.out.print("최초 금액을 입력해주세요. : ");
		int firMo = sc.nextInt();
		
		while(true) {
			System.out.println("1. 목록 확인 및 장바구니 담기");
			System.out.println("2. 장바구니 확인 및 삭제");
			System.out.println("3. 결제 및 잔금 확인");
			System.out.println("4. 영수증 출력");
			System.out.print(">>> : ");
			int num = sc.nextInt();
			switch(num) {
				case 1: break;
				case 2: 
					list_del del = new list_del();
					break;
				case 3: break;
				case 4:
					f.LastPrint(a, b, c, d, e, firMo);	
					break;
				default :
					System.out.println("다시 입력해주세요.");
					break;
			}
		}
	}
}
