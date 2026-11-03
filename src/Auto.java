public class Auto extends Vehiculo{

    public int año;
    public int kilometraje;
    public String modelo;


    @Override
    public void apagar(){
        System.out.println("El auto se esta apagando");
    }
    @Override
    public void acelerar(){
        System.out.println("El auto esta acelerando");
    }
    @Override
    public void encender(){
        System.out.println("El auto se esta encendiendo");
    }
}
