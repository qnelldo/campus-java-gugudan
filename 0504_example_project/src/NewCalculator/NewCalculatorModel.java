package NewCalculator;

public class NewCalculatorModel {
    private int firstNum;
    private int secondNum;
    private String operator;


    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
    

    public int calculate() {
        switch(operator) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return firstNum / secondNum;
	            default:
	                throw new IllegalArgumentException("연산기호를 다시 입력해주세요.");
        }
    }
}