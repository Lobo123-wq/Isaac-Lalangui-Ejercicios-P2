public class JavaMath {
    public static void main(String[] args) {
        System.out.println("Mayor: " + Math.max(15, 28));
        System.out.println("Menor: " + Math.min(15, 28));
        System.out.println("Raíz: " + Math.sqrt(81));
        System.out.println("Absoluto: " + Math.abs(-14));
        System.out.println("Potencia: " + Math.pow(2, 3));

        int aleatorio = (int) (Math.random() * 10) + 1;
        System.out.println("Aleatorio del 1 al 10: " + aleatorio);
    }
}
