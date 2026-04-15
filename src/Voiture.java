public class Voiture implements Vehicule{


    @Override
    public void start() {
        System.out.println("La voiture se demarre avec CLE");
    }

    @Override
    public void stop() {
        System.out.println("Voiture stopping");
    }
}
