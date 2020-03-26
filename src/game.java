import java.awt.EventQueue;

import javax.swing.JFrame;

public class game {

	private JFrame frmCards;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					game window = new game();
					window.frmCards.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCards = new JFrame();
		frmCards.setTitle("Card Games");
		frmCards.setResizable(false);
		frmCards.setBounds(100, 100, 960, 720);
		frmCards.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
