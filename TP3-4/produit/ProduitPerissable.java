package produit;

import date.*;

/**
 * je suis un ProduitPerissable. j'obtiens un numero et un name a ma creation
 * ainsi qu'une date de peremption
 * Ma classe (Produit) garde le nombre numberCreated de produits crees.
 *
 * un produitPerissable sait :
 *  - etre cree
 *  - donner son numero
 *  - donner son name
 *  - donner son date de peremption
 *  - donner la chaine de caracteres correspondant a un ProduitPerissable
 *  - donner le nombre numberCreated de produits creer
 * le main permet de tester la classe
 *
 * J'utilise les classes systeme : String, (System pour le test)
 *
 * @author  P. Geffroy
 */

public class ProduitPerissable extends Produit {
    
    /**
     * Chaque ProduitPerissable a un date de peremption
     */
    private Date bestBeforeDate;
   
   
    /**
     * @param  name le nom du nouveau Produit 
     * @param  bestBeforeDate la date de consommation
     * me cree, et m'attribue un numero, un nom et une date de Peremption 
     */
    public ProduitPerissable(String name, Date bestBeforeDate) { 
	super(name);
	this.bestBeforeDate = bestBeforeDate; 
    }
   
    /**
     * @param  date la date que l'on veut comparer avec la date de peremption
     */
    public boolean isOutOfDate(){
	Date now = new Date();
	return  bestBeforeDate.before(now);
    }  

    /**
     *  retourne la date de peremption.
     */
    public Date getBestBeforeDate(){
	return  bestBeforeDate;
    }  
	
    /**
     *  methode standard qui transforme un objet en Chaine de caractere.
     */
    public String toString() {
	return super.toString() + " sera perime le " + bestBeforeDate;
    }
   
    public static void main(String[] args) {
	try{
	    Date d1 = new Date(2004, 3, 25);
	    Date d2 = new Date(2004, 3, 29);
	    Date d3 = new Date(2004, 4, 15);
	    ProduitPerissable p1 = new ProduitPerissable("beurre", d1);
	    System.out.println(p1);
            // -> Produit number : 1
	    System.out.println("NombreproduitCrees ==  " +
			       Produit.getNumberCreated());
	    // -> NombreproduitCrees == 1
	    ProduitPerissable p2 = new ProduitPerissable("lait", d2);
	    ProduitPerissable p3 = new ProduitPerissable("fromage", d2);
	    if(p1.isOutOfDate())
		System.out.println(p1 + " est perime aujourd'hui le " + new Date());
	    else
		System.out.println(p1 + " n'est pas perime le "+ new Date());
	    System.out.println(p1);
            // -> Produit number : 1
	    System.out.println(p3);
            // -> Produit number : 3
	    System.out.println("numero de p3  :" + p3.getNumber());
            // -> number de p3  :3
	    System.out.println("Nombre de produits crees =  " + Produit.getNumberCreated());
            // -> NombreproduitCrees ==  3
	    System.out.println("Le produit  " + p3.getName() + " sera perime le " +
			       p3.getBestBeforeDate());
	} catch(DateInvalide er){
	    System.out.println("votre date est erronnee");
	} 
    }
}
