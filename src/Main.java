public class Main extends Vehiculo {

    public static void main (String[] args) {

        Moto mimoto = new Moto();

        Auto miauto = new Auto();

        Jetski mijski = new Jetski();

        miauto.modelo = "bugatti";
        miauto.año = 2027;
        miauto.kilometraje = 0;

        mimoto.modelo = "Yamaha";
        mimoto.año = 2023;
        mimoto.kilometraje = 7000;

        mijski.modelo = "Sea-Doo";
        mijski.año = 2025;
        mijski.kilometraje = 15000;


        System.out.println("La moto es marca " + mimoto.modelo + " y es del año " + mimoto.año);
        System.out.println("El auto es marca " + miauto.modelo + " y es del año " + miauto.año);
        System.out.println("El jetski es marca " + mijski.modelo + " y es del año " + mijski.año);

        System.out.println("____Kilometrajes_____");

        System.out.println("El kilometraje de la moto es " + mimoto.kilometraje);
        System.out.println("El kilometraje del auto es " + miauto.kilometraje);
        System.out.println("El kilometraje del jetski es " + mijski.kilometraje);

        System.out.println("____Pruebas____");


        miauto.encender();
        miauto.acelerar();

        mimoto.encender();
        mimoto.apagar();

        mijski.acelerar();

    }
}
