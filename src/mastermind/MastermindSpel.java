package master1;

public class MastermindSpel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// De geheime code staat vast
		String geheimeCode = "OOOO"; 
		int maxBeurten = 10;

		System.out.println("=== Simpel Mastermind ===");
		System.out.println("Raad de code van 4 letters. Kies uit: R, O, Ge, G, B, P"); //rood orange geel groen blauw paars
		System.out.println("Typ je gok in hoofdletters.\n");

		// De game loop
		for (int beurt = 1; beurt <= maxBeurten; beurt++) {
			System.out.print("Beurt " + beurt + ": Voer je gok in: ");
			String gok = scanner.nextLine().toUpperCase();

			// als je meer dan 4 letter type
			if (gok.length() != 4) {
				System.out.println("Typ precies 4 letters!");
				beurt--; // deze beurt telt niet mee
				continue;
			}

			// Check of de gok meteen helemaal goed is
			if (gok.equals(geheimeCode)) {
				System.out.println("Gewonnen! Je hebt de code gekraakt!");
				break;
			}

			// Tel de juiste letters op de juiste plek
			int juistePlek = 0;
			for (int i = 0; i < 4; i++) {
				if (gok.charAt(i) == geheimeCode.charAt(i)) {
					juistePlek++;
				}
			}

			System.out.println("-> Letters op de juiste plek: " + juistePlek);

			// Als de beurten op zijn
			if (beurt == maxBeurten) {
				System.out.println("\n Helaas, je beurten zijn op! De code was: " + geheimeCode);
			}
		}

		scanner.close();
	}
}
