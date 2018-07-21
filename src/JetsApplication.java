import java.util.Scanner;

public class JetsApplication {
	public static void main(String[] args) {

		AirField airfield = new AirField();


	}

	public JetsApplication() {

	}

	private void launch() {

	}

	private void displayUserMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. list fleet\n2. Fly all jets\n3.View jet with longest range\n5.Load all Cargo Jets");
		System.out.println("6. DogFight!\n7.Add a jet to Fleet\n 8.Quit");
		int input = sc.nextInt();

		while (input != 8 && input < 9) {
			if (input == 1) {

			}
		}

	}

}
