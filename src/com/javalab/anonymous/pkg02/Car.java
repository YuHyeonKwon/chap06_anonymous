package com.javalab.anonymous.pkg02;

/**
 * Tire를 사용하는 사용클래스
 */
public class Car { // class s

	// filed(부모 타입인 Tire 타입을 필드로 갖고 있음)
	public Tire tire = new SnowTire(); // 기본적으로 SnowTire 장착되서

	// 익명 객체 field : 광폭타이어 익명 객체
	// 광폭타이어는 사용빈도가 거의 없다. 굳이 재사용 가능한 클래스로 만들지 말고 바로
	public Tire tireBig = new Tire() {
		//익명 객체 생성
		@Override
		public void roll() {
			System.out.println("광폭타이어가 산길에서 힘차게 굴러갑니다.");
		}
	};
	
	public void run() {
		tire.roll();
		tireBig.roll();
	}

} // class e
