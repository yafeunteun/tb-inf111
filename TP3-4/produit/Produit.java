package produit;

import date.*;

/**
 * je suis un Produit. j'obtiens un numero et un name a ma creation
 * Ma classe (Produit) garde le nombre numberCreated de produits crees.
 *
 * un produit sait :
 *  - etre cree
 *  - donner son numero
 *  - donner son name
 *  - s'imprimer
 * la classe produit sait :
 *  - donner le namebre numberCreated de produits creer
 * le main permet de tester la classe
 *
 * J'utilise les classes systeme : String, (System pour le test)
 *
 * @author  A. Beugnard    R. Ogor  F. Dagnat
 * @version 0.3
 */

public class Produit {
   
    /**
     * Chaque Produit a un nom
     */
    private String name;
		
    /**
     * variable de classe qui memorise le nombre de produits crees
     */
    static private int numberCreated = 0;  
   	
    /**
     * Chaque Produit a un numero
     */
    private int number;
   	
     
    /**
     * @param  unNom le name du nouveau Produit 
     * me cree, et m'attribue un numero 
     * incremente le namebre de produits crees.
     */
    public Produit(String name) { 
	this.name = name;
	number = ++numberCreated; 
    }
   
    /**
     * rend mon numero, fixe a sa creation, 
     */
    public int getNumber() {
	return number;
    }
   
    /**
     * rend le nom du Produit
     */
    public String getName() {
	return name;
    }
   
    /**
     * rend le nombre de produits crees
     */      
    public static int getNumberCreated() {
	return numberCreated;
    }

	 
    /**
     * compare ce Produit avec l'objet specifie
     *@param o l'Objet a comparer avec le Produit courant
     */    		
    public boolean equals(Object o){
	Produit p = (Produit)o;
	return name.equals(p.name) && number == p.number;
    }

    /**
     *  methode standard qui transforme un objet en Chaine de caractere.
     */
    public String toString() {
	return "(Produit=" + name + ", number=" + number + ")";
    }
   
    public static void main(String args []) {
	// for testing run : java niveau1_1.Produit
	Produit p1, p2, p3;
	p1 = new Produit("beurre");
	System.out.println(p1);
	// -> Produit number : 1
	System.out.println("NombreproduitCrees ==  " +
			   Produit.getNumberCreated());
	// -> NombreproduitCrees == 1
	p2 = new Produit("lait");
	p3 = new Produit("fromage");
	if(p2.equals(p3))
	    System.out.println(p2 + " est identique a " + p3);
	else
	    System.out.println(p2 + " est different de " + p3);
	System.out.println(p1);
	// -> Produit number : 1
	System.out.println(p3);
	// -> Produit number : 3
	System.out.println("number de p3  :" + p3.getNumber());
	// -> number de p3  :3
	System.out.println("NombreproduitCrees ==  " + Produit.getNumberCreated());
	// -> NombreproduitCrees ==  3
    }
}
