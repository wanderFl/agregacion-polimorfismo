public class App {
    public static void main(String[] args) {
        // Crear instancias de diferentes tipos de dirección
        direccion direccionSinCiudad = new direccion("Calle Principal", 123);
        direccion direccionConCiudad = new DireccionConCiudad("Calle Secundaria", 456, "Ciudad de Ejemplo");

        // Crear instancia de Persona con cada tipo de dirección
        persona personaSinCiudad = new persona("Juan", direccionSinCiudad);
        persona personaConCiudad = new persona("María", direccionConCiudad);

        // Imprimir información de las personas y sus direcciones
        System.out.println("Persona sin ciudad");
        personaSinCiudad.imprimirInformacion();
        System.out.println();

        System.out.println("Persona con ciudad");
        personaConCiudad.imprimirInformacion();
    }

}
