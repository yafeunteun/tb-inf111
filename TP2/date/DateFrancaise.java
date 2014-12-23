package date;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.io.*;
import java.util.StringTokenizer;
/**
 * @author prou
 *
 */
public class DateFrancaise extends GregorianCalendar {


	public static void main(String[] args) {
	}

	public String toString() {
		String s =
			" "
				+ this.get(Calendar.DAY_OF_MONTH)
				+ "/"
				+ ((this.get(Calendar.MONTH)) + 1)
				+ "/"
				+ this.get(Calendar.YEAR);
		return s;
	}

	static DateFrancaise lireDate() {
		System.out.print(" (Jour/Mois/Annee) :  ");
		DateFrancaise gc = null;
		try {
			BufferedReader stdin =
				new BufferedReader(new InputStreamReader(System.in));
			String ligne = stdin.readLine();
			StringTokenizer st = new StringTokenizer(ligne, "/");
			int jour = new Integer(st.nextToken()).intValue();
			int mois = new Integer(st.nextToken()).intValue();
			int an = new Integer(st.nextToken()).intValue();
			gc = new DateFrancaise(an, mois, jour);
			return gc;
		} catch (Exception e) {
			System.out.print(" Date incorrecte \n" + e.getClass().getName());
		}
		return null;
	}

	public DateFrancaise(int jour, int mois, int annee) {
		super(annee, mois - 1, jour);
	}

	public DateFrancaise() {
		super();
	}


}
