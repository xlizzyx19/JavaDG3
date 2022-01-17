package scherm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MyFrame extends JFrame {
	private JPanel panel;

	ArrayList<Persoon> personen = new ArrayList <Persoon>();

	public MyFrame() {

		//Test data, straks weggooien
		personen.add(new Persoon("Lisa", "van der veen"));
		personen.add(new Persoon("Ivan", "karst"));
		personen.add(new Persoon("Atakan", "Karaca"));

		//hoogte en breedte van Jframe gemaakt
		this.setSize(480, 480);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

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
