package com.AGM.eed.examen.optimizacionydocumentacion;

/**
 * Esto es un comentario para esta clase.

 * @author Adrian Gómez Martínez
 */


public class Perro extends Mascota {
  // Variable estática Guauuuuuu.
	
  
  private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
  
  private int age;
  /**
   * Constructor que crea un perro.
   * @param String name
   * @param int age
   * @throws EdadErroneaException
   */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
    setAge(age);
		this.name = name;
	}
	/**
	 * Asignamos la edad del perro.
	 * @param int age
	 * @throws EdadErroneaException
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}

	/**
	 * Obtenemos la edad del perro.
	 * @return this.age
	 *
	 */
	public int getAge() {
		return this.age;
	}
	/**
     * Hacemos ladrar al perro.
     * @return GUAUUUUUUUUUU
     *
     */
	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
