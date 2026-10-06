package master1;

import java.util.Scanner;
import java.util.random.RandomGenerator;

class MastermindSpel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// test
//	pinleuren
		String RodePin = "rood";
		String OranjePin = "oranje";
		String GelePin = "geel";
		String GroenePin = "groen";
		String BlauwePin = "blauw";
		String PaarsePin = "paars";

		String ZwartePin = "zwart";
		String WittePin = "wit";
		String LegePin = "leeg";

//		geheimecode maken
		String[] geheimeCodes = new String[4];
		geheimeCodes[0] = RodePin;
		geheimeCodes[1] = OranjePin;
		geheimeCodes[2] = GelePin;
		geheimeCodes[3] = GroenePin;

//		pogingen
		String[] poging = new String[4];

		System.out.println("speler 1: codemaker");
		System.out.println("speler 2: codekraker");

		System.out.println("rij1 vakje1");
		poging[0] = input.nextLine();

		System.out.println("rij1 vakje2");
		poging[1] = input.nextLine();

		System.out.println("rij1 vakje3");
		poging[2] = input.nextLine();

		System.out.println("rij1 vakje4");
		poging[3] = input.nextLine();

		System.out.println("de code is:");
		System.out.println(geheimeCodes[0] + " " + geheimeCodes[1] + " " + geheimeCodes[2] + " " + geheimeCodes[3]);

		System.out.println(poging[0] + " " + poging[1] + " " + poging[2] + " " + poging[3]);

		for (int i = 0; i > 4; i++) {
			if (poging[i].equalsIgnoreCase(geheimeCodes[i]));
		}
		
		if (poging[0].equalsIgnoreCase(geheimeCodes[0])) {
			System.out.println("je hebt één zwarte");
		} else if (poging[0].equalsIgnoreCase(geheimeCodes[1])) {
			System.out.println("je hebt één wit");
		} else if (poging[0].equalsIgnoreCase(geheimeCodes[2])) {
			System.out.println("je hebt één wit");
		} else if (poging[0].equalsIgnoreCase(geheimeCodes[3])) {
			System.out.println("je hebt één wit");
		} else {
			System.out.println("deze kleur zit niet in de code");
		}

	}

}
