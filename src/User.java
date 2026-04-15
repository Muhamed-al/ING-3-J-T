public class User {

    private String name;
    private String cin;
    private ERole role;

    public User(String name, String cin, ERole role) {
        this.name = name;
        this.cin = cin;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public ERole getRole() {
        return role;
    }

    public void setRole(ERole role) {
        this.role = role;
    }
}
