   package registre;

   import date.DateFrancaise;
import java.util.Collection;
import java.util.Iterator;


/**
 * @author prou
 *
 */
    public class Registre {
   
      /**
	 * @uml.property  name="nom"
	 */
    private String nom;
   
   
   
   
       public int ajouterPersonne() {
         return 0;
      }
   
       public void consulter() {
      }
   
       public Personne rechercherPersonne(Personne personne) {
         return null;
      }
   
       public void modifierContrat() {
      }
   
       public void redigerDeces(){
      
      }
   	
       public void redigerSeparation() {
      
      }
   
       public int  redigerUnion()  {
         return 0;
      }
   
   
       public String saisirContrat() {
         return null;
      }
   
       public DateFrancaise saisirDate() {
         return null;
      }
   
       public Personne saisirPersonne() {
         return null;
      }

	/** 
	 * @uml.property name="personne"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="registre:registre.Personne"
	 */
	private Collection personne;
   
   
   }
