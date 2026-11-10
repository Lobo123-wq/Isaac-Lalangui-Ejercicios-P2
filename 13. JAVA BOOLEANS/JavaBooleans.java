public class JavaBooleans {
    public static void main(String[] args) {
        boolean esMayorDeEdad = true;
        boolean tienePermiso = false;

        int edad = 20;
        boolean edadSuficiente = edad >= 18;
        boolean puedeIngresar = edadSuficiente && tienePermiso;

        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        System.out.println("¿Tiene permiso? " + tienePermiso);
        System.out.println("¿Edad suficiente? " + edadSuficiente);
        System.out.println("¿Puede ingresar? " + puedeIngresar);
        System.out.println("¿10 es mayor que 5? " + (10 > 5));
    }
}
