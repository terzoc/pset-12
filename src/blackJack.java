import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class blackJack extends JPanel {

	/**
	 * Create the panel.
	 */
	public blackJack() {
//		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel BJNamePlate = new JLabel("Blackjack");
		BJNamePlate.setFont(new Font("Dialog", Font.PLAIN, 32));
		BJNamePlate.setBounds(359, 11, 149, 75);
		add(BJNamePlate);
	}
}
