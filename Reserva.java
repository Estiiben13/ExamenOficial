
public class Reserva {

    private String codigo;
    private String nombrePelicula;
    private double costoBase;

    public Reserva(String codigo, String nombrePelicula, double costoBase) {
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costoBase = costoBase;
    }

    public void obtenerDetalles() {
        System.out.println("el codigo es: " + codigo + " la pelicula es: " + nombrePelicula + " y el costo es: " + costoBase);
    }

    public String getCodigo() {
        return codigo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

}
