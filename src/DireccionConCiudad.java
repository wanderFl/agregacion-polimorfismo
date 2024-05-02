public class DireccionConCiudad extends direccion {
    private String ciudad;

    public DireccionConCiudad(String calle, int numero, String ciudad) {
        super(calle, numero);
        this.ciudad = ciudad;
}
@Override
public String imprimirDireccion() {
    return getCalle() + " " + getNumero() + ", " + ciudad;
}
}

