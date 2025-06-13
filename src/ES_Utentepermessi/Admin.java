package ES_Utentepermessi;
import java.util.ArrayList;

class Admin extends Utente {
    public Admin(String username, String email) {
        this.setDati(username, email);
    }

    @Override
    public ArrayList<String> getPermessi() {
        ArrayList<String> permessi = new ArrayList<>();
        permessi.add("READ");
        permessi.add("WRITE");
        permessi.add("DELETE");
        return permessi;
    }
}
