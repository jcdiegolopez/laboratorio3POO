/**
 * La clase Snack es una subclase de Producto y representa un tipo de producto que es un snack. Hereda atributos como ID, nombre,
 * cantidad disponible, cantidad vendida, disponibilidad y precio de la clase Producto, y agrega atributos específicos como gramos,
 * sabor y tamaño.
 */
public class Snack extends Producto {
    private int gramos;
    private String sabor;
    private String tama;

    /**
     * Constructor para crear un objeto Snack con los atributos especificados, incluyendo los heredados de la clase Producto.
     *
     * @param id            El identificador único del snack.
     * @param nombre        El nombre del snack.
     * @param cantDisponible La cantidad disponible del snack.
     * @param cantVendidos   La cantidad de snacks vendidos.
     * @param disponibilidad Indica si el snack está disponible (true) o no (false).
     * @param precio        El precio del snack.
     * @param gramos        La cantidad de gramos en el snack.
     * @param sabor         El sabor del snack (por ejemplo, "Sal" o "Chocolate").
     * @param tama          El tamaño del snack (por ejemplo, "Pequeño", "Mediano" o "Grande").
     */
    public Snack(int id, String nombre, int cantDisponible, int cantVendidos, boolean disponibilidad, float precio, int gramos, String sabor, String tama) {
        super(id, nombre, cantDisponible, cantVendidos, disponibilidad, precio);
        this.gramos = gramos;
        this.sabor = sabor;
        this.tama = tama;
    }

    /**
     * Obtiene la cantidad de gramos en el snack.
     *
     * @return La cantidad de gramos del snack.
     */
    public int getGramos() {
        return gramos;
    }

    /**
     * Obtiene el sabor del snack.
     *
     * @return El sabor del snack (por ejemplo, "Sal" o "Chocolate").
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * Obtiene el tamaño del snack.
     *
     * @return El tamaño del snack (por ejemplo, "Pequeño", "Mediano" o "Grande").
     */
    public String getTama() {
        return tama;
    }

    /**
     * Devuelve una representación en forma de cadena de texto de la instancia Snack, incluyendo los atributos heredados de Producto.
     *
     * @return Una cadena de texto que contiene los atributos del snack, incluyendo gramos, sabor y tamaño.
     */
    @Override
    public String toString() {
        return super.toString() + "\nGramos: " + gramos + "\nSabor: " + sabor + "\nTamaño: " + tama;
    }
}
