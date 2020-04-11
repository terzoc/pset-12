import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

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
		
		ImageIcon card = new ImageIcon("cards/2C.png");
		card = scaleImage(card, 243 , 311);
		
		JLabel cardDisplay = new JLabel();
		cardDisplay.setIcon(card);
		cardDisplay.setBounds(316, 148, 243, 311);
		add(cardDisplay);
		
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

