package scherm;

import javax.swing.*;
import java.util.ArrayList;

public class InvoerFrame extends JFrame {
    private ArrayList<Persoon> personen;

    private JPanel panel;

    public InvoerFrame(ArrayList<Persoon> personen) {
        this.personen = personen;

        //hoogte en breedte van Jframe gemaakt
        this.setSize(480, 480);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //panel maken
        panel = new JPanel();
        //panel opbouwen (schilderen)
        JLabel label1 = new JLabel("label2");
        panel.add(label1);
        this.add(panel);


        //persoonvelden om in te vullen

        JButton knop = new JButton("OK");
        InvoerFrame hier = this;
        knop.addActionListener(e -> {
            //bewaren in de lijst
            Persoon persoon = new Persoon("Joep", "meloen");

//                persoon.setVoornaam(jtVoornaam.getText());

//                persoon.setAchternaam("Meloen");
            personen.add(persoon);
            //Hoe komt de lijst hier op nette manier

            //scherm gesloten
            hier.dispose();
        });
        panel.add(knop);
    }


}




