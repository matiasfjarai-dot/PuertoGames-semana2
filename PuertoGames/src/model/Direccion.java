package model;

/**
 * Representa la dirección física de un cliente.
 */
public class Direccion {
    private String calle;
    private int numero;
    private String comuna;
    private String ciudad;

    /** Crea una dirección con sus datos principales. */
    public Direccion(String calle, int numero, String comuna, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.ciudad = ciudad;
    }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    /** Devuelve la dirección en formato legible. */
    @Override
    public String toString() {
        return calle + " " + numero + ", " + comuna + ", " + ciudad;
    }
}
