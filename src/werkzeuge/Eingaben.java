package werkzeuge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Sammlung von Eingabe-Methoden f�r Tastatureingaben
 * (C) Thomas Kessler 2014-2016 */
public class Eingaben {
	
	/* "Reader" f�r Tastatureingabe; "BufferedReader" erlaubt
	   zusammengeh�rige Eingaben mit Abschluss durch "Enter"-Taste
	   ("InputStreamReader" verarbeitet Bytes einzeln) */
	private static BufferedReader	TastaturEingabe = new BufferedReader(new InputStreamReader(System.in));

	/* Eingabe einer "int"-Zahl */
	public static int intEingabe() {
		int	Wert;
		
		try {
			/* Eingabestring wird in "int" gewandelt */
			Wert = Integer.parseInt(TastaturEingabe.readLine());
			/* Im Fehlerfall wird der Wert auf "0" gesetzt */
		} catch (NumberFormatException e) {
			Wert = 0;
		} catch (IOException e) {
			Wert = 0;
		}
		return Wert;
	}

	/* Eingabe einer "int"-Zahl mit Eingabeaufforderung */
	public static int intEingabe(String Prompt) {
		int	Wert;
		
		/* Text f�r Eingabeaufforderung */
		System.out.print(Prompt);
		try {
			/* Eingabestring wird in "int" gewandelt */
			Wert = Integer.parseInt(TastaturEingabe.readLine());
			/* Im Fehlerfall wird der Wert auf "0" gesetzt */
		} catch (NumberFormatException e) {
			Wert = 0;
		} catch (IOException e) {
			Wert = 0;
		}
		return Wert;
	}

	/* Eingabe einer "double"-Zahl */
	public static double doubleEingabe() {
		double	Wert;
		
		try {
			/* Eingabestring wird in "double" gewandelt */
			Wert = Double.parseDouble(TastaturEingabe.readLine());
			/* Im Fehlerfall wird der Wert auf "0.0" gesetzt */
		} catch (NumberFormatException e) {
			Wert = 0.0;
		} catch (IOException e) {
			Wert = 0;
		}
		return Wert;
	}

	/* Eingabe einer "double"-Zahl mit Eingabeaufforderung */
	public static double doubleEingabe(String Prompt) {
		double	Wert;
		
		/* Text f�r Eingabeaufforderung */
		System.out.print(Prompt);
		try {
			/* Eingabestring wird in "double" gewandelt */
			Wert = Double.parseDouble(TastaturEingabe.readLine());
			/* Im Fehlerfall wird der Wert auf "0.0" gesetzt */
		} catch (NumberFormatException e) {
			Wert = 0.0;
		} catch (IOException e) {
			Wert = 0.0;
		}
		return Wert;
	}

	/* Eingabe eines Strings */
	public static String stringEingabe() {
		String	Wert;
		
		try {
			/* String wird eingelesen */
			Wert = TastaturEingabe.readLine();
			/* Im Fehlerfall wird der String auf "null" gesetzt */
		} catch (IOException e) {
			Wert = null;
		}
		return Wert;
	}

	/* Eingabe eines Strings mit Eingabeaufforderung */
	public static String stringEingabe(String Prompt) {
		String	Wert;
		
		/* Text f�r Eingabeaufforderung */
		System.out.print(Prompt);
		try {
			/* String wird eingelesen */
			Wert = TastaturEingabe.readLine();
			/* Im Fehlerfall wird der String auf "null" gesetzt */
		} catch (IOException e) {
			Wert = null;
		}
		return Wert;
	}

}
