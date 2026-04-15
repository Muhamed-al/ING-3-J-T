public class Moto implements Vehicule{
    @Override
    public void start() {
        System.out.println("Moto se demarre avec BOUTTON");
    }


    @Override
    public void stop() {
        System.out.println("Moto stopping");
    }
}
