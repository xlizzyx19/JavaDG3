package scherm;

import javax.swing.*;
import java.awt.*;

public class InvoerFrame extends JFrame {
    private MyFrame hoofdscherm;
    private AllePersonen personen;

    private JPanel panel;

    public InvoerFrame(AllePersonen personen, MyFrame hoofd) {
        this.personen = personen;
        this.hoofdscherm = hoofd;

        //hoogte en breedte van Jframe gemaakt
        this.setSize(480, 480);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //panel maken
        panel = new JPanel();
        panel.setLayout(new GridLayout(5,0));
        panel.setSize(100,100);
        //panel opbouwen (schilderen)
        JLabel label1 = new JLabel("formulier:", SwingConstants.CENTER);
        label1.setFont(new Font("Serif", Font.PLAIN, 32));
        panel.add(label1);

        //inputveld 1
        JTextField jtVoornaam = new JTextField();
        jtVoornaam.setHorizontalAlignment(JTextField.CENTER);
        jtVoornaam.setText("vul hier je voornaam in !");
        jtVoornaam.setSize(190,20);
        panel.add(jtVoornaam);

        //inputveld 2
        JTextField jtAchternaam = new JTextField();
        jtAchternaam.setHorizontalAlignment(JTextField.CENTER);
        jtAchternaam.setText("vul hier je achternaam in !");
        jtAchternaam.setSize(190,20);
        panel.add(jtAchternaam);
        this.add(panel);


        //persoonvelden om in te vullen

        JButton knop = new JButton("verzend");
        InvoerFrame hier = this;
            knop.addActionListener(e -> {
                //bewaren in de lijst
                Persoon persoon = new Persoon(jtVoornaam.getText(),jtAchternaam.getText());

                personen.add(persoon);
                //Hoe komt de lijst hier op nette manier

                hoofdscherm.update();
                //scherm gesloten
                hier.dispose();
            });
        panel.add(knop);
    }
}




