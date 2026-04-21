public class Oiseau extends Animal{

    private double envergure;

    public Oiseau (String nom , int age ,  double envergure){
        super(nom , age , AnimalType.OISEAU);
        this.envergure=envergure;
    }

    public double getEnvergure() {
        return envergure;
    }

    public void setEnvergure(double envergure) {
        this.envergure = envergure;
    }

    public void voler(){
        System.out.println("Le oiseau vole ");
    }


    @Override
    public void manger() {
        System.out.println("Le oiseau mange");
    }

    @Override
    public void faireBruits() {
        System.out.println("Le oiseau chante");
    }

    @Override
    public void afficherInfos(){
        super.afficherInfos();
        System.out.println("Envergure : "+ envergure);
    }
}
