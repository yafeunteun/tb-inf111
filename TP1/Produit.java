
/**
* je suis un Produit. j'obtiens un numero et un name a ma creation
* <br> Ma classe (Produit) garde le namebre numberCreated de produits crees.
*
* <br> un produit sait :
*  <br> - etre cree
*  <br> - donner son numero
*  <br> - donner son name
*  <br> - s'imprimer
* <br> la classe produit sait :
*  <br> - donner le nombre numberCreated de produits crees
* <br> le main permet de tester la classe
*
* <br> J'utilise les classes systeme : String, (System pour le test)
*
* @author  A. Beugnard    R. Ogor  F. Dagnat
* @version 0.3
*/

  public class Produit {
   
    /**
   *Chaque Produit a un nom
   */
   private String name;
		
	/**
   *variable de classe qui memorise le nombre de produits crees
   */
   static private int numberCreated = 0;  
   	
   /**
   *Chaque Produit a un numero
   */
   private int number;

   private Producteur producteur; 
   	
     
   /**@param  name le name du nouveau Produit 
   *  cree, et m'attribue un numero 
   * incremente le nombre de produits crees.
   */
       public Produit(String name, Producteur pProducteur) { 
		 	this.name = name;
		 	this.producteur = pProducteur;
         number = ++numberCreated; 
      }
   
   /**
   * rend mon numero, fixe a sa creation, 
   * @return le number du produit
   */
       public int getNumber() {
		    return number;
      }
   
    /**
   * rend le nom du Produit
   * @return le name du produit
   */
       public String getName() {
         return name;
      }
   
   
   /**
   * rend le nombre de produits crees
   * @return le numberCreated de la classe
   */      
       public static int getNumberCreated() {
         return numberCreated;
      }
   
   /**
   *  methode standard qui transforme un objet en Chaine de caracteres.
   * @return une representation textuelle d'un produit
   */
       public String toString() {
    	 String prod = (producteur == null) ? " Producteur inconnu" : " Producteur : " + producteur.getName();
         return "Produit " + name + "  number : " + number + prod;
      }
   
       public static void main(String [] args ) {
      // for testing run : java niveau1_1.Produit
         Produit p1, p2, p3;
         p1 = new Produit("beurre", null);
         System.out.println(p1);
            // -> Produit number : 1
         System.out.println("NombreproduitCrees ==  " +
            					 Produit.getNumberCreated());
            // -> NombreproduitCrees == 1
         p2 = new Produit("lait", null);
         p3 = new Produit("fromage", null);
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
