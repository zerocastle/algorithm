package ys.notepad;

public enum EqualState {

	SUCCESS("1", true), FAIL("0", false);

	private String state1;
	private boolean state2;

	private EqualState(String state1, boolean state2) {
		// TODO Auto-generated constructor stub
		/*
		 * ���� ���س��� Enum ��� �ȿ� ������ Ÿ���� ��ø� �����ؼ� ���� , �ű⿡ �ô� �����ڸ� ������ �Ѵ�.
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
