public class Mammifere extends Animal{

    private double temperatureCorps;

    public Mammifere (String nom , int age ,  double temperatureCorps){
        super(nom , age , AnimalType.MAMMIFERE);
        this.temperatureCorps = temperatureCorps;
    }

    public double getTemperatureCorps() {
        return temperatureCorps;
    }

    public void setTemperatureCorps(double temperatureCorps) {
        this.temperatureCorps = temperatureCorps;
    }

    public void allaiter(){
        System.out.println("le mammifère nourrit ses petits");
    }

    @Override
    public void manger() {
        System.out.println("Le Mammifere mange");
    }

    @Override
    public void faireBruits() {
        System.out.println("Le mammifere fait du bruits");
    }

    @Override
    public void afficherInfos(){
        super.afficherInfos();
        System.out.println("Temp Corps : " + temperatureCorps);
    }
}
