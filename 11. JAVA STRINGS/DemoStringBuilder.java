public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder mensaje = new StringBuilder("Hola");
        mensaje.append(" mundo");
        mensaje.insert(0, "Java: ");
        System.out.println(mensaje);
    }
}
