public class Jetski extends Vehiculo{

    public int año;
    public int kilometraje;
    public String modelo;
    @Override
    public void apagar(){
        System.out.println("El jetski se esta apagando");
    }
    @Override
    public void acelerar(){
        System.out.println("El jetski esta acelerando");
    }
    @Override
    public void encender(){
        System.out.println("El jetski se esta encendiendo");
    }
}
