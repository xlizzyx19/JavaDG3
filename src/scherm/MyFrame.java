package scherm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MyFrame extends JFrame {
	private JPanel panel;

	ArrayList<Persoon> personen = new ArrayList();

	public MyFrame() {

		//Test data, straks weggooien
		personen.add(new Persoon("Lisa"));
		personen.add(new Persoon("Ivan"));
		personen.add(new Persoon("Atakan"));

		//hoogte en breedte van Jframe gemaakt
		this.setSize(480, 480);
		this.setDefaultCloseOperation(2);

		//panel maken
		panel = new JPanel();
		//panel opbouwen (schilderen)
		JLabel label1 = new JLabel("label1");
		panel.add(label1);
		this.add(panel);

		JButton knop = new JButton(" Knop");
		knop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InvoerFrame invoerFrame = new InvoerFrame(personen);
				invoerFrame.setVisible(true);

				//JList opnieuw vullen met alles uit de lijst personen
				//Listmodel zorgt voor dat de JLIST gevuld wordt vanuit de personen lijst
			}
		});
		panel.add(knop);
	}
}
