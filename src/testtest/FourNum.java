package testtest;

public class FourNum {
	private TestDTO dto;
	public FourNum() {
		dto = new TestDTO();
	}
	
	public void LastPrint(int a, int b, int c, int d, int e, int s) {
		int sum = (dto.getA() * a) +(dto.getB() * b) + (dto.getC() * c) + (dto.getD() * d) + (dto.getE() * e); 
		System.out.println("구매하신 물품의 내용은 이러합니다.");
		System.out.println("휴지는 총 " + dto.getA() + "개 구매하여 " + dto.getA() * a + "원이 나왔습니다.");
		System.out.println("물은 총 " + dto.getB() + "개 구매하여 " + dto.getB() * b + "원이 나왔습니다.");
		System.out.println("라면은 총 " + dto.getC() + "개 구매하여 " + dto.getC() * c + "원이 나왔습니다.");
		System.out.println("세제는 총 " + dto.getD() + "개 구매하여 " + dto.getD() * d + "원이 나왔습니다.");
		System.out.println("수건은 총 " + dto.getE() + "개 구매하여 " + dto.getE() * e + "원이 나왔습니다. ");
		System.out.println("최초 금액은 " + s + "원이였고 잔액은 " + (s - sum) + "원 남았습니다.");
		
		System.exit(0);
	}
}
