package testtest;

import java.util.Scanner;

public class list_del {
	
	Scanner sc = new Scanner(System.in);

	public list_del() {
		
		TestDTO dto = new TestDTO();
		
		System.out.println("장바구니 목록");
		System.out.println("1. 휴지  : " + dto.getA());
		System.out.println("2.  물	: " + dto.getB());
		System.out.println("3. 라면 	: " + dto.getC());
		System.out.println("4. 세제 	: " + dto.getD());
		System.out.println("5. 수건 	: " + dto.getE());
		
		System.out.print("삭제할 목록 >>> ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			int mod = mod_list(dto.getA());
			dto.setA(mod);
			break;
		case 2:
			mod = mod_list(dto.getB());
			dto.setB(mod);
			break;
		case 3:
			mod = mod_list(dto.getC());
			dto.setC(mod);
			break;
		case 4:
			mod = mod_list(dto.getD());
			dto.setD(mod);
			break;
		case 5:
			mod = mod_list(dto.getE());
			dto.setE(mod);
			break;
		}
	}
	
	public int mod_list(int dto_num) {
		if (dto_num == 0) {
			System.out.println("담겨있지 않은 상품");
			return 0;
		}else {
			System.out.println("변경할 갯수");
			int del = sc.nextInt();
			
			if (dto_num < del) {
				System.out.println("삭제 갯수초과");
				return 0;
			}else {
				int mod = dto_num - del;	
				System.out.println(mod+ "개로 변경되었습니다");
				return mod;
			}
		}
	}
	
}