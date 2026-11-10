public class LogicalOperators {
    public static void main(String[] args) {
        int edad = 22;
        boolean puede = edad >= 18 && edad <= 65;
        boolean especial = edad < 18 || edad > 65;
        System.out.println(puede);
        System.out.println(!especial);
    }
}
