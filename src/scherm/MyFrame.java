package scherm;

import javax.swing.*;
import java.awt.*;


@SuppressWarnings("ALL")
public class MyFrame extends JFrame {
	AllePersonen personen;
	DefaultListModel<Persoon> model;

	public MyFrame(JPanel ignoredPanel) {

		JList<Persoon> jl;
		JLabel lb;
		JButton jb1;

		model = new DefaultListModel<>();
		jl = new JList<>(model);
		jl.setBounds(50, 100, 500, 300);
		jl.setFont(new Font("Serif", Font.PLAIN, 20));

		add(jl);

		personen = new AllePersonen();

		int i = 0;
		for (Persoon text : personen.getAll()) {
			model.add(i, text);
			i++;
		}

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);

		lb = new JLabel("Lijst van personen");
		lb.setFont(new Font("Serif", Font.PLAIN, 30));

		lb.setBounds(200, 30, 450, 40);
		add(lb);

		setLayout(null);
		setSize(600, 500);
		setVisible(true);


		jb1 = new JButton("Vul Hier In!!");
		jb1.setBounds(50, 200, 100, 30);
		jb1.setLocation(250 , 420);
		add(jb1);
		MyFrame hier = this;
		jb1.addActionListener(e -> {
			InvoerFrame invoerFrame = new InvoerFrame(personen, hier);
			invoerFrame.setVisible(true);
			});
		}

	public void update() {

		for(Persoon p: personen.getAll()){
			System.out.println(p);
		}

		model.clear();
		int i = 0;
		for (Persoon text : personen.getAll()) {
			model.add(i, text);
			i++;
		}
	}
}
