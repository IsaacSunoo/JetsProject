import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();

	}

	public JetsApplication() {

	}

	private void launch() {
		AirField airfield = new AirField();
		displayUserMenu(airfield);

	}

	private void displayUserMenu(AirField airfield) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. List fleet\n2. Fly all jets\n3. View the fastest jet\n4. View jet with longest range\n5. Load all Cargo Jets");
		System.out.println("6. Add a jet to Fleet\n7. Quit");
		int input = sc.nextInt();

		while (input != 7) {
			switch (input) {
			case 1:
				airfield.listFleet();
				break;
			case 2:
				airfield.flyAllJets();
				break;
			case 3:
				System.out.println("The fastest Jet is: " + airfield.fastestJet());
				break;
			case 4:
				System.out.println("The longest range jet is: " + airfield.longestRange());
				break;
			case 5:
				airfield.loadCargo();
				break;
			case 6:
				airfield.addJet();
				break;
			case 7:
				if (input == 7) {
					System.exit(0);
				}
				break;
			default:
				System.err.println("Please enter 1-7.");
			}
			System.out.println("1. List fleet\n2. Fly all jets\n3. View the fastest jet\n4. View jet with longest range\n5. Load all Cargo Jets");
			System.out.println("6. Add a jet to Fleet\n7. Quit");
			input = sc.nextInt();
		}
	}
}
