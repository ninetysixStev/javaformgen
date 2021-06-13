package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PanelReforge extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 651L;
	
	private JLabel[] label_generico;
	private JTextField[] textfield_generico;
	private JButton[] button_generico;
	private SpringLayout layout;
	private int iterador = 0;
	private int x;
	private int y;
	int ancho = 8;
	int alto  = 10;
	
	public PanelReforge(String[] labels, String[] inputs, String[] bottoms, int x, int y) {
		label_generico = new JLabel[labels.length];
		textfield_generico = new JTextField[inputs.length];
		button_generico = new JButton[bottoms.length];
		this.y = y;
		this.x = x;
		layout = new SpringLayout();
		setLayout(layout);
		createComponent(labels, 'l');
		createComponent(inputs, 'i');
		createComponent(bottoms, 'b');
	}
	
	public void createComponent(String componentes[], char tipo) {
		
		for(String componente : componentes) {
			if(tipo == 'l') {
				this.label_generico[iterador] = createLabels(componente);
				layout.putConstraint(SpringLayout.WEST, label_generico[iterador], ancho, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.NORTH, label_generico[iterador], alto, SpringLayout.NORTH, this);
				this.add(label_generico[iterador]);
				alto = alto + 40;
				iterador++;
			}else if(tipo == 'i') {
				this.textfield_generico[iterador] = createInput();
				layout.putConstraint(SpringLayout.WEST, textfield_generico[iterador], (ancho+(x/2)), SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.NORTH, textfield_generico[iterador], alto+5, SpringLayout.NORTH, this);
				this.add(textfield_generico[iterador]);
				alto = alto + 40;
				iterador++;
			}else if(tipo == 'b') {
				this.button_generico[iterador] = createButton(componente);
				layout.putConstraint(SpringLayout.WEST, button_generico[iterador], ancho+(x/8), SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.NORTH, button_generico[iterador], y-100, SpringLayout.NORTH, this);
				this.add(button_generico[iterador]);
				iterador++;
				ancho = ancho + (x/2);
			}
		}
		alto = 0;
		iterador=0;
	}
	
	private JButton createButton(String text) {
		JButton generico = new JButton(text);
		generico.setPreferredSize(new Dimension(100, 20	));
		generico.addActionListener(this);
		return generico;
	}
	
	private JTextField createInput() {
		JTextField generico = new JTextField();
		generico.setPreferredSize(new Dimension(200, 30));
		return generico;
	}
	
	private JLabel createLabels(String texto){
		JLabel generico = new JLabel();
		generico.setText(texto);
		return generico; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
