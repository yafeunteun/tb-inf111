package registre;

import date.DateFrancaise;


public class Contrat {

	/**
	 * @uml.property  name="type"
	 */
	private String type;

	/**
	 * Getter of the property <tt>type</tt>
	 * @return  Returns the type.
	 * @uml.property  name="type"
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter of the property <tt>type</tt>
	 * @param type  The type to set.
	 * @uml.property  name="type"
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @uml.property  name="date"
	 */
	private DateFrancaise date;

	/**
	 * Getter of the property <tt>date</tt>
	 * @return  Returns the date.
	 * @uml.property  name="date"
	 */
	public DateFrancaise getDate() {
		return date;
	}

	/**
	 * Setter of the property <tt>date</tt>
	 * @param date  The date to set.
	 * @uml.property  name="date"
	 */
	public void setDate(DateFrancaise date) {
		this.date = date;
	}

}
