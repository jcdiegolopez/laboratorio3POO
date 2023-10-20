/**
 * La clase Bebida es una subclase de Producto y representa un tipo de producto que es una bebida. Hereda atributos como ID,
 * nombre, cantidad disponible, cantidad vendida, disponibilidad y precio de la clase Producto, y agrega atributos específicos como
 * mililitros y tipo.
 */
public class Bebida extends Producto {
    private int mililitros;
    private String tipo;

    /**
     * Constructor para crear un objeto Bebida con los atributos especificados, incluyendo los heredados de la clase Producto.
     *
     * @param id            El identificador único de la bebida.
     * @param nombre        El nombre de la bebida.
     * @param cantDisponible La cantidad disponible de la bebida.
     * @param cantVendidos   La cantidad de bebidas vendidas.
     * @param disponibilidad Indica si la bebida está disponible (true) o no (false).
     * @param precio        El precio de la bebida.
     * @param mililitros    La cantidad de mililitros en la bebida.
     * @param tipo          El tipo de bebida (por ejemplo, "Energética" o "Natural").
     */
    public Bebida(int id, String nombre, int cantDisponible, int cantVendidos, boolean disponibilidad, float precio, int mililitros, String tipo) {
        super(id, nombre, cantDisponible, cantVendidos, disponibilidad, precio);
        this.mililitros = mililitros;
        this.tipo = tipo;
    }

    /**
     * Obtiene la cantidad de mililitros en la bebida.
     *
     * @return La cantidad de mililitros de la bebida.
     */
    public int getMililitros() {
        return mililitros;
    }

    /**
     * Obtiene el tipo de bebida.
     *
     * @return El tipo de bebida (por ejemplo, "Energética" o "Natural").
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Devuelve una representación en forma de cadena de texto de la instancia Bebida, incluyendo los atributos heredados de Producto.
     *
     * @return Una cadena de texto que contiene los atributos de la bebida, incluyendo mililitros y tipo.
     */
    @Override
    public String toString() {
        return super.toString() + "\nMililitros: " + mililitros + "\nTipo: " + tipo;
    }
}
