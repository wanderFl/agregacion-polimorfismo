public class persona {
    private String nombre;
    private direccion direccion;

    public persona(String nombre, direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la dirección
    public direccion getDireccion() {
        return direccion;
    }

    // Setter para la dirección
    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion.imprimirDireccion());
    }

}
