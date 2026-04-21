public abstract class Animal implements AnimalActions{

    private String nom;
    private int age;
    private AnimalType type;

    public Animal(String nom , int age , AnimalType type){
        this.nom = nom;
        this.age = age;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public void afficherInfos(){
        System.out.println("Nom : " + nom);
        System.out.println("Age : " + age);
        System.out.println("Type : " + type);
    }
}
