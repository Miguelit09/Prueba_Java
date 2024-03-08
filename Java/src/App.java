import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    // Método para agregar productos
    public static void registrarProducto(List<Producto> listaProductos) {
        List<String> listaInfoProducto = new ArrayList<>();

        Integer id;
        String nombre;
        String descripcion;
        Double precio;
        Integer cantidad;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Ingrese el id del producto: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        listaInfoProducto.add(String.valueOf(id));
                        break;
                    }
                    else if (i == 1) {
                        System.out.print("Ingrese el nombre del producto: ");
                        nombre = scanner.nextLine();
                        listaInfoProducto.add(nombre);
                        break;
                    }
                    else if (i == 2) {
                        System.out.print("Ingrese una descripción del producto: ");
                        descripcion = scanner.nextLine();
                        listaInfoProducto.add(descripcion);
                        break;
                    }
                    else if (i == 3) {
                        System.out.print("Ingrese el precio del producto: ");
                        precio = scanner.nextDouble();
                        scanner.nextLine();
                        listaInfoProducto.add(String.valueOf(precio));

                        break;
                    }
                    else {
                        System.out.print("Ingrese la cantidad del producto: ");
                        cantidad = scanner.nextInt();
                        scanner.nextLine();
                        listaInfoProducto.add(String.valueOf(cantidad));
                        break;
                    }
                } catch (Exception e) {
                    System.out.print("Error. Entrada no válida.\n");
                    scanner.next();
                } 
            }
        } 
        // if (scanner.hasNextLine()) {
        //     String linea = scanner.nextLine();
        //     System.out.println(linea);
        // } else {
        //     System.out.println("No hay más líneas disponibles.");
        // }
        scanner.close();

        listaProductos.add(new Producto (Integer.parseInt(listaInfoProducto.get(0)), listaInfoProducto.get(1), listaInfoProducto.get(2), Double.parseDouble(listaInfoProducto.get(3)), Integer.parseInt(listaInfoProducto.get(4))));
    }

    // Método para identificar el producto con menor consonantes



    public static String obtenerProductoConMenosConsonantes(List<Producto> listaProductos) {
        if (listaProductos.isEmpty()) {
            return null; // Devolver null si la lista está vacía
        }

        Producto productoConMenosConsonantes = listaProductos.get(0);

            for (Producto producto : listaProductos) {
                if (producto.contarConsonantes(producto.getNombre()) < productoConMenosConsonantes.contarConsonantes(productoConMenosConsonantes.getNombre())) {
                    productoConMenosConsonantes = producto;
                }
            }

        return productoConMenosConsonantes.getNombre();
    }


    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();
        String opcion;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Seleccione el número de las siguientes opciones: \n1) Agregar Productos\n2) ¿Cuál producto tiene menor número de consonantes en su nombre?\n3) ¿Cuál es el número primo más cercano al precio del producto más barato?\n4) Salir.\n");
            opcion = scanner.nextLine();
            if ("1".equals(opcion)){
                registrarProducto(listaProductos);
            } else if ("2".equals(opcion)) {
                System.out.println(obtenerProductoConMenosConsonantes(listaProductos)); 
            } else if ("4".equals(opcion)){
                System.out.print("Adios");
                break;
            }

        }
        scanner.close();
    }
}
