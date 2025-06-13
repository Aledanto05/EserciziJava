package ES_Utentepermessi;

import java.util.ArrayList;

class Cliente extends Utente {
    public Cliente(String username, String email) {
        this.setDati(username, email);
    }

    @Override
    public ArrayList<String> getPermessi() {
        ArrayList<String> permessi = new ArrayList<>();
        permessi.add("READ");
        return permessi;
    }
}

