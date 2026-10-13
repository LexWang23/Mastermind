package master1;

import java.util.Scanner;
import java.util.random.RandomGenerator;

class MastermindSpel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//	pinkleuren
		String RodePin = "rood";
		String OranjePin = "oranje";
		String GelePin = "geel";
		String GroenePin = "groen";
		String BlauwePin = "blauw";
		String PaarsePin = "paars";

		String ZwartePin = "zwart";
		String WittePin = "wit";
		String LegePin = "leeg";

		int ZwartePinnen = 0;
		int WittePinnen = 0;

		boolean gewonnen = false;

//		geheimecode maken
		String[] geheimeCodes = new String[4];
		geheimeCodes[0] = RodePin;
		geheimeCodes[1] = RodePin;
		geheimeCodes[2] = RodePin;
		geheimeCodes[3] = RodePin;

//		pogingen
		String[] poging = new String[4];
		int[] maxPogingen = new int[10];

		for (int rij = 1; rij <= 10; rij++) {

			System.out.println("speler 1: codemaker");
			System.out.println("speler 2: codekraker");

			System.out.println("vakje1");
			poging[0] = input.nextLine();

			System.out.println("vakje2");
			poging[1] = input.nextLine();

			System.out.println("vakje3");
			poging[2] = input.nextLine();

			System.out.println("vakje4");
			poging[3] = input.nextLine();

			System.out.println("de code is:");
			System.out.println(geheimeCodes[0] + " " + geheimeCodes[1] + " " + geheimeCodes[2] + " " + geheimeCodes[3]);

			System.out.println(poging[0] + " " + poging[1] + " " + poging[2] + " " + poging[3]);

			ZwartePinnen = 0;
			WittePinnen = 0;

			{
				String[] pogingen = new String[4];
			}

			for (int i = 0; i < 4; i++) {

				if (poging[i].equalsIgnoreCase(geheimeCodes[i])) {
					ZwartePinnen++;
				} else if (poging[i].equalsIgnoreCase(geheimeCodes[0]) || poging[i].equalsIgnoreCase(geheimeCodes[1])
						|| poging[i].equalsIgnoreCase(geheimeCodes[2]) || poging[i].equalsIgnoreCase(geheimeCodes[3])

				) {
					WittePinnen++;
					}
				}

			System.out.println("totale zwarte pinnen: " + ZwartePinnen);
			System.out.println("totale witte pinnen: " + WittePinnen);

			if (ZwartePinnen == 4) {
				System.out.println("je hebt gewonnen!!!");
				gewonnen = true;
				break;

			}
			for (int i = 10; i < geheimeCodes.length; i++) {
				if (poging[0].equalsIgnoreCase(geheimeCodes[i])) {

				}
			}
		}

		if (gewonnen == false) {
			System.out.println("je hebt verloren");
		}
	}
}
