/**
 * La clase Postre es una subclase de Producto y representa un tipo de producto que es un postre. Hereda atributos como ID, nombre,
 * cantidad disponible, cantidad vendida, disponibilidad y precio de la clase Producto, y agrega atributos específicos como gramos y tipo.
 */
public class Postre extends Producto {
    private int gramos;
    private String tipo;

    /**
     * Constructor para crear un objeto Postre con los atributos especificados, incluyendo los heredados de la clase Producto.
     *
     * @param id            El identificador único del postre.
     * @param nombre        El nombre del postre.
     * @param cantDisponible La cantidad disponible del postre.
     * @param cantVendidos   La cantidad de postres vendidos.
     * @param disponibilidad Indica si el postre está disponible (true) o no (false).
     * @param precio        El precio del postre.
     * @param gramos        La cantidad de gramos en el postre.
     * @param tipo          El tipo de postre (por ejemplo, "Pastel" o "Helado").
     */
    public Postre(int id, String nombre, int cantDisponible, int cantVendidos, boolean disponibilidad, float precio, int gramos, String tipo) {
        super(id, nombre, cantDisponible, cantVendidos, disponibilidad, precio);
        this.gramos = gramos;
        this.tipo = tipo;
    }

    /**
     * Obtiene la cantidad de gramos en el postre.
     *
     * @return La cantidad de gramos del postre.
     */
    public int getGramos() {
        return gramos;
    }

    /**
     * Obtiene el tipo de postre.
     *
     * @return El tipo de postre (por ejemplo, "Pastel" o "Helado").
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Devuelve una representación en forma de cadena de texto de la instancia Postre, incluyendo los atributos heredados de Producto.
     *
     * @return Una cadena de texto que contiene los atributos del postre, incluyendo gramos y tipo.
     */
    @Override
    public String toString() {
        return super.toString() + "\nGramos: " + gramos + "\nTipo: " + tipo;
    }
}
