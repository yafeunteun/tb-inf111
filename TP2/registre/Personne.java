
   package registre;

import date.DateFrancaise;

/**
 * @author prou
 *
 */
    public class Personne {
   
      private String nom;
   
      private String prenom;
   
      private char sexe;
   
      private String communeNaissance;
   
      private DateFrancaise dateNaissance;
   
      private DateFrancaise dateDeces;
   
      private int numero;
   
      private static int dernierNumero = 0;
   
   
   
       public Personne(Personne personne) {
      }
   
       public Personne(String nom, String prenom,  char sexe,  DateFrancaise dateNaissance, String communeNaissance) {
      }
   
   
   }
