
public class SalaTradicional extends Reserva {

    private int duracionMin;

    public SalaTradicional(String codigo, String nombrePelicula, double costoBase, int duracionMin) {
        super(codigo, nombrePelicula, costoBase);

        this.duracionMin = duracionMin;

    }

    @Override

    public String obtenerDetalles() {
        return "código: " + getCodigo() + " nombre de la pelicula: " + getNombrePelicula() + " costo: " + getCostoBase()
                + " y la duracion de la pelicula es de: " + duracionMin + " minutos" +
                "\n El costo total es: " + getCostoBase();

    }

    public int getDuracionMin() {
        return duracionMin;
    }

}
