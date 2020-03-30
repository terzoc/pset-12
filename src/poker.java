import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

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
