   package stock;

   import produit.Produit;

/**
 * Classe pour tester le stock
 * @author  F. Dagnat, B. Prou
 */
   public class TestTableau {
      public static void main(String[] args) {
         System.out.println("Test d'un stock base sur un tableau ");
      	
      	
      
         Produit beurre = new Produit("Beurre");
         Produit lait = new Produit("lait");
         Produit fromage = new Produit("fromage");
         Produit jambon1 = new Produit("jambon");
         Produit jambon2 = new Produit("jambon");
      
         Stock s;
      
      	
         System.out.println("\n\n 1) Tests avec un stock vide");	
      				
         s = new StockTableau(10);
         if (!s.isEmpty()) System.out.println("Erreur methode isEmpty()");
         if (s.isFull()) System.out.println("Erreur methode isFull()");
         if (s.getSize() != 0) System.out.println("Erreur methode getSize()");      	      	
         try {
            s.remove();
            System.out.println("Erreur remove() n'a pas leve d'Exception pour un stock vide");
         } 
            catch (StockEmpty e) { }
         try {
            s.remove(null);
            System.out.println("Erreur remove(null) n'a pas leve d'Exception");
         } 
            catch (StockEmpty e) { }
            catch (ProduitNull e) { }
         try {
            s.remove(beurre);
            System.out.println("Erreur remove(beurre) n'a pas leve d'Exception pour un stock vide");
         } 
            catch (StockEmpty e) { }
            catch (ProduitNull e) {
               System.out.println("Erreur remove(beurre) a  leve l'Exception ProduitNull");
            }
      		 
         System.out.println("\n toString() d'un Stock vide : " + s); 
         System.out.println("\non doit ne voir aucun produit"); 
      
      
      
         System.out.println("\n\n 2) Tests avec un stock contenant des produits ");	
         
         s = new StockTableau(30);
         try {
            s.add(beurre);
            s.add(lait);
            s.add(fromage);
            s.add(jambon1);
            s.add(jambon2);
         }
            catch (StockFull e) {
               System.out.println("Erreur add(unProduit)  a  leve l'Exception StockFull pour un stock suffisamment grand");
            }
            catch (ProduitNull e) {
               System.out.println("Erreur add(beurre) ou add(lait) a  leve l'Exception ProduitNull");
            }
      
         if (s.isEmpty()) System.out.println("Erreur methode isEmpty()");
         if (s.isFull()) System.out.println("Erreur methode isFull()");
         if (s.getSize() != 5) System.out.println("Erreur methode getSize()"); 
         try {
            s.remove();   
            if (s.getSize() != 4) System.out.println("Erreur methode getSize() apres remove()");          
         } 
            catch (StockEmpty e) {
               System.out.println("Erreur remove() a  leve l'Exception StockEmpty");
            }
         		
         try {
            if (!s.remove(lait)) System.out.println("Erreur remove(lait) n'a pas trouve le lait a enlever ");;
            if (s.getSize() != 3) System.out.println("Erreur remove(lait) n'a pas ote le lait du  stock "); 
         			
         }
            catch (Exception e) { 
               System.out.println("Erreur remove(lait) a  leve l'Exception " + e);
            }
         try {
            if (s.remove(lait)) System.out.println("Erreur remove(lait) a  pu oter le lait qui devait avoir ete ote precedemment ");;
            if (s.getSize() != 3) System.out.println("Erreur remove(lait) avec du lait qui avait ete ote precedemment ne devait pas modifier size "); 
         			
         }
            catch (Exception e) { 
               System.out.println("Erreur remove(lait) avec du laitote precedemment a  leve l'Exception " + e);
            }
         try {
            s.remove(fromage);
            if (s.getSize() != 2) System.out.println("Erreur remove(fromage) n'a pas ote le fromage du stock "); 
         			
         }
            catch (Exception e) { 
               System.out.println("Erreur remove(fromage) a  leve une Exception");
            }
         try {
            s.remove(jambon2);
            if (s.getSize() != 2) System.out.println("Erreur remove(jambon2) n'a pas leve une Exception alors que le produit jambon2 n'est plus dans le stock ");          			
         }
            catch (Exception e) { 
               System.out.println("Erreur remove(jambon2)  a  leve une Exception");
            }
      		
           	      	
         System.out.println("\n toString() d'un Stock non vide de 2 produits : " + s); 
         System.out.println("\non doit y voir du beurre et du jambon"); 
         
          
         System.out.println("\n\n 3) Test remplissage d'un stock");
      	
         s = new StockTableau(5);
         try {
            for (int i = 0; i < 5; i++)   {
               s.add(new Produit("Smirnoff"));
            }
            if (!s.isFull()) System.out.println("Erreur methode isFull()"); 
         }
            catch (ProduitNull e) {
               System.out.println("Erreur add(new Produit(\"Smirnoff\") a  leve l'Exception ProduitNull");
            }
            catch (StockFull e) {
               System.out.println("Erreur add(new Produit(\"Smirnoff\") de moins de 6 produits a  leve l'Exception StockFull");
            }
         try {
            s.add(new Produit("Smirnoff"));
            System.out.println("Erreur l'ajout d'un produit dans un stock plein  n'a pas leve l'Exception StockFull");
         } 
            catch (ProduitNull e) {
               System.out.println("Erreur add(new Produit(\"Smirnoff\") a  leve l'Exception ProduitNull");
            }
            catch (StockFull e) {
            }
         
         System.out.println("\n toString() d'un Stock plein de 5 produits : " + s); 
         System.out.println("\non doit y voir  5 smirnoff"); 
      	
      }
   }
