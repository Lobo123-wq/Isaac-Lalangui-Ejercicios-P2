public class JavaOperators {
    public static void main(String[] args) {
        int a = 12, b = 5;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División entera: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        boolean comparacion = a > b;
        boolean logica = (a > 10) && (b < 10);
        System.out.println("a es mayor que b: " + comparacion);
        System.out.println("Condición lógica: " + logica);
    }
}
