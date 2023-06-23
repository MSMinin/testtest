package third;

import testtest.TestDTO;

public class ThirdNum {
	public int sum;
	public void payMon() {
		TestDTO dto = new TestDTO();
		int a = 800, b = 200, c = 300, d = 400, e = 500;
		
		if(dto.getA()==0 && dto.getB()==0 && dto.getC()==0 && dto.getD()==0 && dto.getE()==0) {
			System.out.println("결제할 상품이 없습니다");
		}else {
			sum = dto.getA()*a+dto.getB()*b+dto.getC()*c+dto.getD()*d+dto.getE()*e;
			System.out.println("결제 금액 : "+sum);
		}
	}
}
