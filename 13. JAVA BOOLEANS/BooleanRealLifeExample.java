public class BooleanRealLifeExample {
    public static void main(String[] args) {
        int edad = 19;
        boolean tieneEntrada = true;
        boolean puedeEntrar = edad >= 18 && tieneEntrada;
        System.out.println("Puede ingresar: " + puedeEntrar);
    }
}
