public class direccion {
    private String calle;
    private int numero;

    public direccion(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }
    public String getCalle() {
        return calle;
    }

    // Setter para la calle
    public void setCalle(String calle) {
        this.calle = calle;
    }

    // Getter para el número
    public int getNumero() {
        return numero;
    }

    // Setter para el número
    public void setNumero(int numero) {
        this.numero = numero;
    }
    // Método para imprimir información de la dirección
    public String imprimirDireccion() {
        return calle + " " + numero;
    }
}
