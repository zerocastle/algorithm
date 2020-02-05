package ys.notepad;

public enum EqualState {

	SUCCESS("1", true), FAIL("0", false);

	private String state1;
	private boolean state2;

	private EqualState(String state1, boolean state2) {
		// TODO Auto-generated constructor stub
		/*
		 * 내가 정해놓은 Enum 상수 안에 데이터 타입을 명시를 열거해서 정의 , 거기에 맡는 생성자를 만들어야 한다.
		 */
		this.state1 = state1;
		this.state2 = state2;

	}

	private String getStateValue() {
		// TODO Auto-generated method stub
		return this.state1;
	}

	private boolean isState2Value() {
		return this.state2;
	}

}
