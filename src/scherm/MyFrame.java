package scherm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MyFrame extends JFrame {
	private JPanel panel;

	public MyFrame() {

		JList jl;
		JLabel lb;
		JButton jb1;


		DefaultListModel model = new DefaultListModel();
		jl = new JList(model);
		jl.setBounds(50, 100, 500, 300);
		jl.setFont(new Font("Serif", Font.PLAIN, 20));

		add(jl);

		ArrayList<Persoon> personen = new ArrayList<>();

		//Test data, straks weggooien
		personen.add(new Persoon("Lisa", "van der Veen"));
		personen.add(new Persoon("Ivan", "Karst"));
		personen.add(new Persoon("Atakan", "Karaca"));

		int i = 0;
		for (Persoon text : personen) {
			model.add(i, text);
			i++;
		}

		setLayout(null);
		setVisible(true);

		lb = new JLabel("Lijst van personen");
		lb.setFont(new Font("Serif", Font.PLAIN, 30));

		lb.setBounds(200, 30, 450, 40);
		add(lb);

		setLayout(null);
		setSize(600, 500);
		setVisible(true);


		jb1 = new JButton("Knop");
		jb1.setBounds(50, 200, 100, 30);
		jb1.setLocation(250 , 420);
		add(jb1);

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InvoerFrame invoerFrame = new InvoerFrame();
				invoerFrame.setVisible(true);

					//JList opnieuw vullen met alles uit de lijst personen
					//Listmodel zorgt voor dat de JLIST gevuld wordt vanuit de personen lijst


				}

			});
		}


	private void Test() {
	}
}
