package NewCalculator;

public class NewGuGuDanModel {
	private int num;

	public NewGuGuDanModel(int num) {

		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] calculateTable() {
		int[] table = new int[9];
		for (int i = 0; i < table.length; i++) {
			table[i] = num * (i + 1);
		}
		return table;
	}
}
