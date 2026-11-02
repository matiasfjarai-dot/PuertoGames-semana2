package model;

/**
 * Representa a un cliente de PuertoGames y contiene su dirección.
 */
public class Cliente {
    private String nombre;
    private String correo;
    private String telefono;
    private Direccion direccion;

    /** Crea un cliente y su dirección (relación de composición). */
    public Cliente(String nombre, String correo, String telefono,
                   String calle, int numero, String comuna, String ciudad) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = new Direccion(calle, numero, comuna, ciudad);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public Direccion getDireccion() { return direccion; }
    /** Reemplaza los datos de dirección creando una nueva dirección para el cliente. */
    public void setDireccion(String calle, int numero, String comuna, String ciudad) {
        this.direccion = new Direccion(calle, numero, comuna, ciudad);
    }

    /** Devuelve la información completa del cliente. */
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nCorreo: " + correo
                + "\nTelefono: " + telefono
                + "\nDireccion: " + direccion.toString();
    }
}
