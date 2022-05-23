package scherm;

import java.util.ArrayList;

public class AllePersonen {
    private ArrayList<Persoon> personen = new ArrayList<>();


    public void add(Persoon persoon) {
        personen.add(persoon);

        String sql = "Insert into personen values("+persoon.getAchternaam()+")";
    }

    public ArrayList<Persoon> getAll() {
        String sql = "SELECT * from personen";
        return personen;
    }
}
