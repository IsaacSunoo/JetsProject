import java.util.Scanner;

public class AirField extends JetsApplication {
	private Jet[] jetsList = new Jet[20];

	public AirField() {

	}

	{
		Jet Raptor = new FighterJet("F-22 Raptor", 1500, 1839, 138_000_000);
		Jet Eagle = new FighterJet("F-15 Eagle", 1875, 2992, 29_900_000);
		Jet Sukhoi = new FighterJet("Sukhoi Su-27", 1553, 2193, 22_000_000);
		Jet Falcon = new FighterJet("F-16 Fighting Falcon", 1500, 2622, 18_800_000);
		Jet Typhoon = new FighterJet("EuroFighter Typhoon", 1550, 2355, 140_000_000);
		Jet Cessna = new CargoPlane("Cessna 406", 263, 1327, 307_500);
		Jet Saab = new CargoPlane("Saab 340", 288, 2145, 7_000_000);
		Jet Atr = new CargoPlane("ATR 72-600", 309, 2065, 26_000_000);

		jetsList[0] = Raptor;
		jetsList[1] = Eagle;
		jetsList[2] = Sukhoi;
		jetsList[3] = Falcon;
		jetsList[4] = Typhoon;
		jetsList[5] = Cessna;
		jetsList[6] = Saab;
		jetsList[7] = Atr;
	}

	public void addJet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to add a Fighter or Cargo Jet?");
		String type = sc.nextLine();
		System.out.println("Enter the model of the Jet.");
		String model = sc.nextLine();
		System.out.println("Enter the speed of the Jet.");
		double speed = sc.nextInt();
		System.out.println("Enter the range of the Jet.");
		int range = sc.nextInt();
		System.out.println("Enter the price of the Jet.");
		long price = sc.nextLong();

		if (type.equalsIgnoreCase("fighter")) {
			FighterJet newFighter = new FighterJet(model, speed, range, price);
			addJetToAirfield(newFighter, jetsList);
		}
		if (type.equalsIgnoreCase("cargo")) {
			CargoPlane newCargo = new CargoPlane(model, speed, range, price);
			addJetToAirfield(newCargo, jetsList);
		} else {
			Jet addJet = new JetImpl(model, speed, range, price);
			addJetToAirfield(addJet, jetsList);
		}
	}

	public Jet[] addJetToAirfield(Jet jet, Jet[] jetsList) {
		for (int i = 0; i < jetsList.length; i++) {
			if (jetsList[i] == null) {
				jetsList[i] = jet;
				break;
			}
		}
		return jetsList;
	}

	public void listFleet() {
		for (int i = 0; i < jetsList.length; i++) {
			if (jetsList[i] == null) {
				break;
			}
			System.out.println("Jet " + (i + 1) + ": " + jetsList[i].getModel() + ", Speed: " + jetsList[i].getSpeed()
					+ ", Range: " + jetsList[i].getRange() + ", Price: " + jetsList[i].getPrice());
		}
	}

	public void loadCargo() {
		for (int i = 0; i < jetsList.length; i++) {
			if (jetsList[i] != null) {
				if (jetsList[i] instanceof CargoPlane) {
					((CargoPlane) jetsList[i]).loadCargo();
				}
			}
		}
	}

	public Jet[] getJetsList() {
		return jetsList;
	}

	public void setJetsList(Jet[] jetsList) {
		this.jetsList = jetsList;
	}

	public void flyAllJets() {
		for (Jet jet : jetsList) {
			if (jet != null) {
				jet.fly();
			}
		}
	}

	public Jet fastestJet() {
		Jet fastestJet = jetsList[0];

		for (int i = 0; i < jetsList.length; i++) {
			if (jetsList[i] != null) {
				if (fastestJet.getSpeed() < jetsList[i].getSpeed()) {
					fastestJet = jetsList[i];
				}
			}
		}
		return fastestJet;
	}

	public Jet longestRange() {
		Jet longestRange = jetsList[0];
		for (int i = 0; i < jetsList.length; i++) {
			if (jetsList[i] != null) {
				if (longestRange.getRange() < jetsList[i].getRange()) {
					longestRange = jetsList[i];
				}
			}
		}
		return longestRange;
	}
	
}
