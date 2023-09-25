package sample.cafekiosk.unit;

import org.junit.jupiter.api.Test;

import sample.cafekiosk.unit.beverage.Americano;

class CafeKioskTest {

	/**
	 * 잘못된 테스트의 예.
	 * 1. 최종 단계에서 사람이 개입하게 됨.
	 * 2. 무조건 성공하는 테스트.
	 * 3. 제 3자가 봤을 때 어떤 것을 테스트하는 것인지 알기 힘듦.
	 */
	@Test
	void add() {
		CafeKiosk cafeKiosk = new CafeKiosk();
		cafeKiosk.add(new Americano());
		System.out.println(">>>담긴 음료 수 : " + cafeKiosk.getBeverageList().size());
		System.out.println(">>>담긴 음료 : " + cafeKiosk.getBeverageList().get(0).getName());
	}

}