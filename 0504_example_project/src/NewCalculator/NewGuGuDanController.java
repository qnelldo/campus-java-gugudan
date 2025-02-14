package NewCalculator;

public class NewGuGuDanController {
	private NewGuGuDanModel model;
	private NewGuGuDanView view;

	public NewGuGuDanController(NewGuGuDanModel model, NewGuGuDanView view) {
		this.model = model;
		this.view = view;

	}

	public void run() {
		try {
			int num = view.getInput();
			model.setNum(num);
			int[] table = model.calculateTable();
			view.result(table);

		} catch (Exception e) {
				view.errorMessage();
		}
	}

}
