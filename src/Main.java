//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Animal mammifere = new Mammifere("test", 1  , 1.2);

        System.out.println(mammifere.getType());

        Animal oiseau = new Oiseau("oiseau001" , 1 , 1.2);

    }
}