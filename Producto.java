/**
 * La clase Producto representa un producto genérico con atributos como ID, nombre, cantidad disponible, cantidad vendida,
 * disponibilidad y precio.
 */
public class Producto {
    protected int id;
    protected String nombre;
    protected int cantDisponible;
    protected int cantVendidos;
    protected boolean disponibilidad;
    protected float precio;

    /**
     * Constructor para crear un objeto Producto con los atributos especificados.
     *
     * @param id            El identificador único del producto.
     * @param nombre        El nombre del producto.
     * @param cantDisponible La cantidad disponible del producto.
     * @param cantVendidos   La cantidad de productos vendidos.
     * @param disponibilidad Indica si el producto está disponible (true) o no (false).
     * @param precio        El precio del producto.
     */
    public Producto(int id, String nombre, int cantDisponible, int cantVendidos, boolean disponibilidad, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantDisponible = cantDisponible;
        this.cantVendidos = cantVendidos;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }

    /**
     * Obtiene el ID del producto.
     *
     * @return El ID del producto.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la cantidad disponible del producto.
     *
     * @return La cantidad disponible del producto.
     */
    public int getCantD() {
        return cantDisponible;
    }

    /**
     * Obtiene la cantidad de productos vendidos.
     *
     * @return La cantidad de productos vendidos.
     */
    public int getCantV() {
        return cantVendidos;
    }

    /**
     * Verifica la disponibilidad del producto.
     *
     * @return true si el producto está disponible, false en caso contrario.
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Devuelve una representación en forma de cadena de texto de la instancia Producto.
     *
     * @return Una cadena de texto que contiene los atributos del producto.
     */
    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nCantidad Disponible: " + cantDisponible
                + "\nCantidad Vendida: " + cantVendidos + "\nDisponibilidad: " + disponibilidad + "\nPrecio: " + precio;
    }
}
