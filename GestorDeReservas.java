
public class GestorDeReservas extends Reserva {

    public GestorDeReservas(String codigo, String nombrePelicula, double costoBase) {
        super(codigo, nombrePelicula, costoBase);
    }

    public Reserva[] reservas = new Reserva[4];

    public void agregarReserva(Reserva item, int posicion) {
        reservas[posicion] = item;
    }
}
