package examen.practico;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto(1, "cereal", 0.5, 100);
        Producto producto2 = new Producto(2, "papas", 1.0, 50);
        Producto producto3 = new Producto(3, "jugo", 1.5, 30);

        producto1.mostrarNombre();
        producto1.mostrarPrecio();
        producto1.mostrarExistencias();
        System.out.println();

        producto2.mostrarNombre();
        producto2.mostrarPrecio();
        producto2.mostrarExistencias();
        System.out.println();

        producto3.mostrarNombre();
        producto3.mostrarPrecio();
        producto3.mostrarExistencias();
        System.out.println();

        producto1.setPrecio(0.6);
        producto1.setExistencias(90);
        System.out.println("Información actualizada del producto1:");
        producto1.mostrarNombre();
        producto1.mostrarPrecio();
        producto1.mostrarExistencias();
    }
}
