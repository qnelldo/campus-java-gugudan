
package GuGuDanWithClass;

public class GuGuDanWithClassModel {
	// 모델에서는 받은 데이터 및 계산을 진행
	private String dan;
	private String value;

	public String getDan() {
		return dan;
	}

	public void setDan(String dan) {
		this.dan = dan;
	}

	public String getValue() {
		value = "";
		for (int i = 1; i <= 9; i++) {
			value += dan + " * " + i + " = " + (Integer.parseInt(dan) * i) + "\n";
		}
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private boolean isErrorLimit;

	public void setErrorLimit() {
		this.isErrorLimit = true;
	}

	public boolean isErrorLimit() {
		return this.isErrorLimit;
	}
	
	private boolean isErrorChar;

	public void setErrorChar() {
		this.isErrorChar = true;
	}

	public boolean isErrorChar() {
		return this.isErrorChar;
	}
}
