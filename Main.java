
public class Main {

    public static void main(String[] args) {

        SalaTradicional sala = new SalaTradicional("1", "Terminator", 10000, 90);
        SalaTradicional sala2 = new SalaTradicional("2", "Nemo", 10000, 90);

        Sala3D sala3 = new Sala3D("3", "Zelda", 10000, 5000);
        Sala3D sala4 = new Sala3D("4", "Cards", 10000, 5000);

        System.out.println(sala.obtenerDetalles());
        System.out.println(sala2.obtenerDetalles());
        System.out.println(sala3.obtenerDetalles());
        System.out.println(sala4.obtenerDetalles());

    }
}
