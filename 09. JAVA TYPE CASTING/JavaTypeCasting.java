public class JavaTypeCasting {
    public static void main(String[] args) {
        int numeroEntero = 10;
        double conversionAmplia = numeroEntero;

        double precio = 19.95;
        int conversionReducida = (int) precio;

        System.out.println("Widening: " + conversionAmplia);
        System.out.println("Narrowing: " + conversionReducida);
    }
}
