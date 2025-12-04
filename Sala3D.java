
public class Sala3D extends Reserva {

    private double valorLentes;

    public Sala3D(String codigo, String nombrePelicula, double costoBase, double valorLentes) {
        super(codigo, nombrePelicula, costoBase);

        this.valorLentes = valorLentes;
    }

    @Override
    public void obtenerDetalles() {
        double total = getCostoBase() + valorLentes;
        System.out.println("código: " + getCodigo() + " nombre de la pelicula: " + getNombrePelicula() + " costo: " + getCostoBase()
                + " y el valor de los lentes es: " + valorLentes);

        System.out.println("El costo total es: " + total);
    }

    public double getValorLentes() {
        return valorLentes;
    }

}
