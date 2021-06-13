package main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Marco extends JFrame {
	
	//< = Texto
	//> = int
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1723021444798055327L;
	
	String[] label = {"Nombre Contacto:", "Numero Contacto:", "Fecha de contacto", "Cumpleaños de cotacto"};
	String[] input = {"<", ">", "<", ">"};
	String[] boton = {"Agregar", "Borrar"};
	
	public Marco() {
		
		
		setTitle("Formulario beta 0.1");
		setSize(new Dimension(500, 300));
		int y = this.getSize().height;
		int x = this.getSize().width;
		PanelReforge n = new PanelReforge(label, input, boton, x, y);
		add(n);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
