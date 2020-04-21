import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;

@SuppressWarnings("serial")
public class blackJack extends JPanel {

	/**
	 * Create the panel.
	 */
	public blackJack() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel BJNamePlate = new JLabel("Blackjack");
		BJNamePlate.setFont(new Font("Dialog", Font.PLAIN, 32));
		BJNamePlate.setBounds(359, 11, 149, 75);
		add(BJNamePlate);
		
		ImageIcon card = new ImageIcon("cards/red_back.png");
		card = scaleImage(card, 137 , 209);		
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(99, 101, 137, 209);
		add(panel);
		panel.setLayout(null);
		
		JLabel cardDisplay = new JLabel();
		cardDisplay.setBounds(0, 0, 137, 209);
		panel.add(cardDisplay);
		cardDisplay.setForeground(Color.WHITE);
		cardDisplay.setBackground(Color.WHITE);
		cardDisplay.setIcon(null);
		
		JButton btnNewButton = new JButton("Change Card");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Chaning Card.");
				ImageIcon card = new ImageIcon("cards/2D.png");
				card = scaleImage(card, 137 , 209);
				cardDisplay.setIcon(card);
			}
		});
		btnNewButton.setBounds(213, 523, 110, 23);
		add(btnNewButton);
		
	}
	
	public ImageIcon scaleImage(ImageIcon icon, int w, int h){
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if(icon.getIconWidth() > w)
        {
          nw = w;
          nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if(nh > h)
        {
          nh = h;
          nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
}

