import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class poker extends JPanel {

	/**
	 * Create the panel.
	 */
	public poker() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Poker");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_1.setBounds(316, 118, 173, 79);
		add(lblNewLabel_1);	
	}

}
