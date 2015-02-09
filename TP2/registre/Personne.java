
   package registre;

import date.DateFrancaise;

/**
 * @author prou
 *
 */
    public class Personne {
   
      /**
	 * @uml.property  name="nom"
	 */
    private String nom;
   
      /**
	 * @uml.property  name="prenom"
	 */
    private String prenom;
   
      /**
	 * @uml.property  name="sexe"
	 */
    private char sexe;
   
      /**
	 * @uml.property  name="communeNaissance"
	 */
    private String communeNaissance;
   
      /**
	 * @uml.property  name="dateNaissance"
	 * @uml.associationEnd  readOnly="true"
	 */
    private DateFrancaise dateNaissance;
   
      /**
	 * @uml.property  name="dateDeces"
	 * @uml.associationEnd  readOnly="true"
	 */
    private DateFrancaise dateDeces;
   
      /**
	 * @uml.property  name="numero"
	 */
    private int numero;
   
      private static int dernierNumero = 0;
   
   
   
       public Personne(Personne personne) {
      }
   
       public Personne(String nom, String prenom,  char sexe,  DateFrancaise dateNaissance, String communeNaissance) {
      }

	/** 
	 * @uml.property name="registre"
	 * @uml.associationEnd inverse="personne:registre.Registre"
	 */
	private Registre registre;
   
   
   }
