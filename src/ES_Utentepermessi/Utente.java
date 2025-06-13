package ES_Utentepermessi;
import java.util.ArrayList;

abstract class Utente {
    protected String username;
    protected String email;

    public Utente() {
    }

    public void setDati(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void stampaInfo() {
        System.out.println("Username: " + this.username + " - Email: " + this.email);
    }

    public abstract ArrayList<String> getPermessi();
}
