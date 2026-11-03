public class Moto extends Vehiculo{
    public String modelo;
    public int año;
    public int kilometraje;

    @Override
    public void apagar(){
        System.out.println("La moto se esta apagando");
    }
    @Override
    public void acelerar(){
        System.out.println("La moto esta acelerando");
    }
    @Override
    public void encender(){
        System.out.println("La moto se esta encendiendo");
    }
}
