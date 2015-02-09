
package registre;

import date.DateFrancaise;

import java.util.Collection;

/**
 * @author prou
 *
 */
public class Union {

	/**
	 * @uml.property  name="numero"
	 */
	private int numero;


	/**
	 * @uml.property  name="dateUnion"
	 * @uml.associationEnd  readOnly="true"
	 */
	private DateFrancaise dateUnion;

	/**
	 * @uml.property  name="dateSeparation"
	 * @uml.associationEnd  readOnly="true"
	 */
	private DateFrancaise dateSeparation;

	private static int dernierNumero = 0;



	public Union(Collection lesPersonnesUnies, Personne LOfficier, Collection lesTemoins, DateFrancaise date, String leContrat) {
	}

	public void separer(DateFrancaise dateSeparation) {
	}

	public void modifierContrat( String nouveauContrat,	DateFrancaise dateNouveauContrat) {
	}



}
