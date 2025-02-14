package NewCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		while (true) {

			System.out.println("어떤 기능을 사용하실 건가요?");
			System.out.println("1. 구구단");
			System.out.println("2. 계산기");
			System.out.println("종료하시려면 3을 입력하세요");

			input = br.readLine();

			if (input.equals("3")) {
				System.out.println("계산기를 종료합니다.");
				System.exit(0);

			} else if (input.equals("1") || input.equals("2")) {
				break;
			}
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

		}

		if (input.equals("1")) {
			NewGuGuDanModel gugudanModel = new NewGuGuDanModel(0);
			NewGuGuDanView gugudanView = new NewGuGuDanView();
			NewGuGuDanController gugudanController = new NewGuGuDanController(gugudanModel, gugudanView);

			gugudanController.run();
		}

		if (input.equals("2")) {
			NewCalculatorModel calculratorModel = new NewCalculatorModel();
			NewCalculatorView calculratorView = new NewCalculatorView();
			NewCalculatorController calculratorController = new NewCalculatorController(calculratorModel,
					calculratorView);

			calculratorController.run();

		}

	}
}
