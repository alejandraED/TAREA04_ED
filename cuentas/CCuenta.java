package cuentas;
/**
 * 
 * @author alejandra
 *
 */
public class CCuenta {

	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Devuelve el tipo de interés
     * @return Porcentaje de interés que aplica
     */
    double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Asignamos el valor del tipo de interés
	 * @param tipoInterés Porcentaje de interés que aplica
	 */
    void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el saldo actual de la cuenta
	 * @return saldo actual
	 */
    double getSaldo() {
		return saldo;
	}

	/**
	 * Asignamos valor del saldo
	 * @param saldo Introduce saldo actual
	 */
    void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el número de la cuenta
	 * @return número de cuenta
	 */
    String getCuenta() {
		return cuenta;
	}

	/**
	 * Asigna número de cuenta
	 * @param cuenta Cuenta del cliente
	 */
    void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el nombre del cliente
	 * @return Nombre del cliente
	 */
    String getNombre() {
		return nombre;
	}

	/**
	 * Asignamos el nombre del cliente
	 * @param nombre Nombre del cliente
	 */
    void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * constructor sin argumentos
	 */
	public CCuenta()
    {
    }

	/**
	 * constructor con los parámetros de la clase
	 * 
	 * @param nom Nombre del Cliente
	 * @param cue Número de la cuenta
	 * @param sal Saldo de la cuenta
	 * @param tipo Tipo de interés que se aplica a la cuenta
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método que devuelve el saldo disponible de la cuenta
     * @return saldo disponible
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para introducir cantidades en la cuenta y modificar saldo
     * 
     * @param cantidad Dinero a ingresar en cuenta
     * @throws Exception Controla que no se introduzcan cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar cantidades en la cuenta y modificar saldo
     * 
     * @param cantidad Dinero a retirar de la cuenta
     * @throws Exception Controla que no se retiren cantidades inferiores al saldo ni negativas
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
