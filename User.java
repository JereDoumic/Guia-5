
public class User extends Person{

    private String tipeOfUser = "Basic";

    public User(String name, int age, String nationality, String tipeOfUser) {
        super(name, age, nationality);
        this.tipeOfUser = tipeOfUser;
    }

    public String getTipeOfUser() {
        return tipeOfUser;
    }

    public void setTipeOfUser(String tipeOfUser) {
        this.tipeOfUser = tipeOfUser;
    }
}
