package scherm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class AllePersonen {
    private ArrayList<Persoon> personen = new ArrayList<>();
    private String tableName = "persoon";


    public void add(Persoon persoon) {
//        String sql = "Insert into personen values("+persoon.getAchternaam()+")";
    }

    public ArrayList<Persoon> getAll() {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/a3_java", "root", "");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+tableName);
            while (rs.next()) {
                Persoon p = new Persoon(rs.getString("voornaam"), rs.getString("achternaam"));
                personen.add(p);
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return personen;
    }
}
