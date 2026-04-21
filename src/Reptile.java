public class Reptile extends Animal{

    private boolean venimeux;

    public  Reptile(String nom , int age , boolean venimeux){
        super(nom , age , AnimalType.REPTILE);
    }

    public boolean isVenimeux() {
        return venimeux;
    }

    public void setVenimeux(boolean venimeux) {
        this.venimeux = venimeux;
    }


    public void changerPeau(){
        System.out.println("Le reptile change du peau");
    }


    @Override
    public void manger() {
        System.out.println("Le reptile mange");
    }

    @Override
    public void faireBruits() {
        System.out.println("Le reptile mange");
    }

    @Override
    public void afficherInfos(){
        super.afficherInfos();
        System.out.println("Venimeux : " + venimeux);
    }
}
