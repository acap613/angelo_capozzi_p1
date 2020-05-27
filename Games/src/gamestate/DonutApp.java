package gamestate;
import java.awt.EventQueue;

import javax.swing.JFrame;


public class DonutApp extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DonutApp() {
		
		initUI();
	}
	
	private void initUI() {
		
		add(new GameBoard());
		
		setSize(450, 400);
		
		 setName("Donut-App");
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setLocationRelativeTo(null);
	}

	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
			DonutApp ex = new DonutApp();
			ex.setVisible(true);
			
		});
	}
}
