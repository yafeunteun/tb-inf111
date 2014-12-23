package date;

import java.util.GregorianCalendar;
import java.util.Calendar;
      
/**
 * Classe qui gere une date avec l'year, le month , le day 
 * @author  P. Geffroy
 */

public class Date {
    private int year;
    private int month;
    private int day;
   
    /** 
     * Construit une date a partir de l'annee y, du mois m et du jour d
     * @param y l'year de la nouvelle Date 
     * @param m le month de la nouvelle Date 
     * @param d le day de la nouvelle Date
     */
    public Date(int y, int m, int d)
	throws DateInvalide {
	if (mauvaiseDate(y, m, d))
            throw new DateInvalide();
	year = y;
	month = m;
	day = d;
    }

    /** 
     * Construit la Date du day
     */  
    public Date() {    
	GregorianCalendar cal = new GregorianCalendar();
	year = cal.get(Calendar.YEAR);
	month = cal.get(Calendar.MONTH) +1;
	day = cal.get(Calendar.DAY_OF_MONTH);
    }

   
   /** 
    * retourne l'entier correspondant a l'year de l'objet courant
    */        
    public int getYear() {
	return year;
    }
   
   /** 
    * modifie l'annee de l'objet courant
    * @param  y la nouvelle annee de la date 
    */
    public void setYear(int y)
	throws DateInvalide {
	if (mauvaiseDate(y, month, day))
            throw new DateInvalide();
	year = y;
    }
   
   /** 
    * retourne l'entier correspondant a l'year de l'objet courant
    */
    public int getMonth(){
	return month;
    }
   
   /** 
    * modifie le month de l'objet courant
    * leve l'exception DateInvalide si le month est mauvais
    * @param  m le nouveau mois de la date 
    */
    public void setMois(int m)
	throws DateInvalide {
	if (mauvaiseDate(year, m, day))
            throw new DateInvalide();
	month = m;
    }
   
    /** 
     * retourne l'entier correspondant au day de l'objet courant
     */
    public int getJour(){
	return day;
    }
   
    /** 
     * modifie le day de l'objet courant
     * leve l'exception DateInvalide si le day est mauvais
     * @param  d le nouveau jour de la date 
     */
    public void setJour(int d)
	throws DateInvalide {
	if (mauvaiseDate(year, month, d))
            throw new DateInvalide();
         day = d;
      }
   
   
   /**
    * retourne true si la date courante est before uneDate
    * @param uneDate la date avec laquelle on veut faire la comparaison 
    */
    public boolean before(Date uneDate){
	return year < uneDate.year
            ||(year == uneDate.year && month < uneDate.month)
            ||(year == uneDate.year && month == uneDate.month && day < uneDate.day);
    }
   
   /**
    * retourne true si la date courante est after uneDate
    * @param uneDate la date avec laquelle on veut faire la comparaison
    */
    public boolean after(Date uneDate){
	return year > uneDate.year
            ||(year == uneDate.year && month > uneDate.month)
            ||(year == uneDate.year && month == uneDate.month && day > uneDate.day);
    }
   
   /**
    * retourne la chaine correspondant a la date sous la forme day/month/year 
    */
    public String toString(){
	return (day + "/" + month + "/" + year);
    }
   
    /**
     * retourne false si la date est mauvaise sans rentrer trop dans les
     * details
     * @param  y l'annee de la nouvelle Date 
     * @param  m le mois de la nouvelle Date 
     * @param  j le jour de la nouvelle Date
     */
    private static boolean mauvaiseDate(int y, int m, int d){
	return m < 1 || m > 12 || d < 1 || d > jours[m]
	    // Cas du 29 fevrier : l'annee ne doit pas etre bissextile
	    // soit elle n'est pas divisible par 4
	    // soit elle est divisible par 400
	    || (d == 29 && m == 2 && (y % 4 != 0 || y % 400 == 0));
    }
   
    /**
     * Le nombre de jours par mois
     */
    private static int[] jours = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
}
