
package GuGuDanWithClass;

public class GuGuDanWithClassController {
	private GuGuDanWithClassModel model;
	private GuGuDanWithClassView view;

	public GuGuDanWithClassController(GuGuDanWithClassModel model, GuGuDanWithClassView view) {
		this.model = model;
		this.view = view;

	}

	public void setValue(String value) {
		model.setValue(value);
	}

	public String getValue() {
		return model.getValue();
	}

	public void setDan(String dan) {
		if (isInteger(dan)) {
			int i = Integer.parseInt(dan);
			if (i <= 0 || 999 < i) { // 범위 에러
				model.setErrorLimit();
			} else {
				model.setDan(dan); // 올바른 값
			}
		} else { // 문자열
			model.setErrorChar();
		}
	}

	public String getDan() {
		return model.getDan();
	}

	public void updateView() {
		if (model.isErrorLimit()==true) {
			   // 에러 시 화면 - 범위 벗어남
			   view.printErrorLimit();
			   
			} else if(model.isErrorChar()==true) {
				   // 에러 시 화면 - 문자열
				view.printErrorChar();}
		
				else {// 정상 출력
					view.printGuGuDan(model.getDan(), model.getValue());
				}
				
			}

	public static boolean isInteger(String s) {
		try { // 예외처리
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
