
public class AirField extends JetsApplication {

	private Jet[] jetsList = new Jet[30];

	public AirField() {

	}

	public AirField(Jet[] jets, AirField add, Jet raptor, Jet eagle, Jet sukhoi, Jet falcon, Jet typhoon,
			Jet cessna, Jet saab, Jet atr) {
		this.Raptor = raptor;
		this.Eagle = eagle;
		this.Sukhoi = sukhoi;
		this.Falcon = falcon;
		this.Typhoon = typhoon;
		this.Cessna = cessna;
		this.Saab = saab;
		this.Atr = atr;
	}

	Jet Raptor = new FighterJet("F-22 Raptor", 1500, 1839, 138_000_000);
	Jet Eagle = new FighterJet("F-15 Eagle", 1875, 2992, 29_900_000);
	Jet Sukhoi = new FighterJet("Sukhoi Su-27", 1553, 2193, 22_000_000);
	Jet Falcon = new FighterJet("F-16 Fighting Falcon", 1500, 2622, 18_800_000);
	Jet Typhoon = new FighterJet("EuroFighter Typhoon", 1550, 2355, 140_000_000);
	Jet Cessna = new CargoPlane("Cessna 406", 263, 1327, 307_500);
	Jet Saab = new CargoPlane("Saab 340", 288, 2145, 7_000_000);
	Jet Atr = new CargoPlane("ATR 72-600", 309, 2065, 26_000_000);

	public Jet[] getJet() {
		return jetsList;
	}

	public void setJets(Jet[] jets) {
		this.jetsList = jets;
	}

	public void listFleet() {
		for (Jet jet2 : jetsList) {
			System.out.println(jet2);
		}
	}

//	public void insertArr(Jets[] jet) {
//		for (int i = 0; i < jets.length; i++) {
//		}
//	

//	public void addJet(Jets jet) {
//		for (int i = 0; i < jets.length; i++) {
//			if (jets[i] == null) {
//				jets[i] = jet;
//				break;
//			}
//		}
//	}
}