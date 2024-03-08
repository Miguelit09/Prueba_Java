public class Producto {
    // Atributos de la clase Producto
    private Integer id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidad;

    // Constructor de la clase Producto
    public Producto(Integer id, String nombre, String descripcion, Double precio, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y Setters de la clase Producto
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    public int contarConsonantes(String nombre) {
        int contador = 0;
        String nombreEnMinuscula = nombre.toLowerCase();

        for (int i = 0; i < nombreEnMinuscula.length(); i++) {
            char caracter = nombreEnMinuscula.charAt(i);
            if (Character.isLetter(caracter) && "aeiou".indexOf(caracter) == -1) {
                // Si el caracter es una letra y no es una vocal, aumentar el contador de consonantes
                contador++;
            }
        }

        return contador;
    }
}
