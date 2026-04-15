//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        User u = new User("Mohamed" , "12312345" , ERole.ENSEIGANT);

        System.out.println(u.getName());
        System.out.println(u.getCin());
        System.out.println(u.getRole());

    }
}