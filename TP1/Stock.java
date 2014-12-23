
/**
* Je gere un  Stock d'objet instance de Produit.
* <br> Ma taille est fixee a ma creation.
*
* <br> un stock sait :
*  <br> - etre cree avec une taille donnee
*  <br> - ajouter/enlever un produit (doit etre defini)
*  <br> - indiquer s'il est vide ou plein
*  <br> - donner le nombre de produits qu'il contient
*<br>  le main permet de tester la classe
*
* <br> J'utilise les classes systeme : String, (System pour le test)
* <br> J'utilise les classes : Produit
*
* @author  A. Beugnard    R.Ogor  F. Dagnat
* @version 0.2
*/
   public class Stock {
   
   /**
   * le tableau ou ranger les produits du stock
   */
      private Produit []  content; // un tableau de produit par exemple

   /**
   * le nombre de produits actuellement dans le stock
   */
      private int size = 0;
   
   /**
   * Construit un stock dont la capacite est donne par s
   * @param s la taille du stock
   */
      public Stock(int s) {
         content = new Produit [s];
      }
   
   /**
   * ajoute un produit, et incremente le nombre d'elements 
   * @param p le produit ajoute
	*/
      public void add(Produit p){
         content[size++] = p;
      }
   
   /**
   * retire un produit, et decremente le nombre d'elements
   * on voit ici que le choix du produit retire pourrait
   * etre different...
   * @return le dernier produit mis dans le stock
   */
      public Produit remove() {
         Produit p;
         p = content[--size];
         return p;
      }
   
   /**
   * indique si je suis vide
   * @return true si le stock ne contient pas de produit et false
   * autrement
   */
      public boolean isEmpty() {
         return size == 0;
      }
   
   /**
   * indique si je suis plein
   * @return true si le tableau ou sont les produits du stock 
   * est plein et false autrement
   */
      public boolean isFull() {
         return size == content.length;
      }
   
   /**
   * retourne le nombre d'elements presents dans le Stock
   * @return le nombre de produits dans le stock
   */
      public int getSize() {
         return size ;
      }
   
   /**
   *  Rend une chaine qui decrit chaque element present dans le Stock
   * @return une representation textuelle d'un stock
   */ 
      public String toString() {
			if(isEmpty())
				return "Le stock est vide";
         String s = "Stock contient :\n " + content[0];
         for (int i = 1; i < size; i++) 
            s = s + ", " + content[i];
         return s;
      }
   
   	
      public static void main(String args []) {
         Stock s;
         s = new Stock(5);
         if (!s.isEmpty()) 
            System.out.println("Le stock devrait etre vide");
         if (s.isFull()) 
            System.out.println("Le stock ne devrait pas etre plein");
         if (s.getSize() != 0) 
            System.out.println("Le stock devrait contenir 0 produit");
         s.add(new Produit("Beurre", null));
         if (s.getSize() != 1) 
            System.out.println("Le stock devrait contenir 1 produit");
         s.add(new Produit("lait", null));
         Produit pAjoute = new Produit("fromage", null);
         s.add(pAjoute);
         if (s.getSize() != 3) 
            System.out.println("Le stock devrait contenir 3 produits");
         Produit pRetire = s.remove();
         if (pRetire != pAjoute)
            System.out.println("Le produit retire n'est pas le dernier ajoute");
         if (s.getSize() != 2) 
            System.out.println("Le stock devrait contenir 2 produits");
         s.add(new Produit("lait", null));
         s.add(new Produit("fromage", null));
         s.add(new Produit("fromage", null));
         if ( !s.isFull()) 
            System.out.println("Le stock devrait etre plein");
         System.out.println(s);
      } 
   
   
   }

