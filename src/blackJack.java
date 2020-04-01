import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class blackJack extends JPanel {

	/**
	 * Create the panel.
	 */
	public blackJack() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel BJNamePlate = new JLabel("Blackjack");
		BJNamePlate.setFont(new Font("Dialog", Font.PLAIN, 32));
		BJNamePlate.setBounds(338, 73, 149, 75);
		add(BJNamePlate);
	}

}
