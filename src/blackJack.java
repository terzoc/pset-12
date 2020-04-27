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
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class blackJack extends JPanel {
	
	private int betAmount = 2;

	/**
	 * Create the panel.
	 */
	public blackJack() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel BJNamePlate = new JLabel("Blackjack");
		BJNamePlate.setFont(new Font("Dialog", Font.PLAIN, 32));
		BJNamePlate.setBounds(410, 6, 149, 75);
		add(BJNamePlate);
		
		ImageIcon card = new ImageIcon("cards/anotherback.png");
		card = scaleImage(card, 131 , 200);		
		
		ImageIcon card2 = new ImageIcon("cards/jrapproved.png");
		card2 = scaleImage(card2, 131 , 200);	
		
		ImageIcon card3 = new ImageIcon("cards/cheer.png");
		card3 = scaleImage(card3, 131 , 200);	
		
		ImageIcon card4 = new ImageIcon("cards/bestback.png");
		card4 = scaleImage(card4, 131 , 200);	
		
		Panel cardDisplayPanel = new Panel();
//		panel.setBackground(new Color(7, 99, 36));
		cardDisplayPanel.setBounds(79, 117, 140, 210);
		add(cardDisplayPanel);
		cardDisplayPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel cardDisplay = new JLabel();
		cardDisplayPanel.add(cardDisplay);
		cardDisplay.setForeground(Color.WHITE);
		cardDisplay.setBackground(Color.WHITE);
		cardDisplay.setIcon(card);
		
		Panel cardDisplayPanel2 = new Panel();
		cardDisplayPanel2.setBounds(293, 117, 140, 210);
		add(cardDisplayPanel2);
		cardDisplayPanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		
		JLabel cardDisplay2 = new JLabel();
		cardDisplay2.setForeground(Color.WHITE);
		cardDisplay2.setBackground(Color.WHITE);
		cardDisplayPanel2.add(cardDisplay2);
		cardDisplay2.setIcon(card2);
		
		JLabel lblNewLabel = new JLabel("Dealer");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(92, 86, 110, 25);
		add(lblNewLabel);
		
		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPlayer.setBounds(79, 381, 110, 25);
		add(lblPlayer);
		
		Panel cardDisplayPanel3 = new Panel();
		cardDisplayPanel3.setBounds(79, 417, 140, 210);
		add(cardDisplayPanel3);
		cardDisplayPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel cardDisplay3 = new JLabel();
		cardDisplay3.setForeground(Color.WHITE);
		cardDisplay3.setBackground(Color.WHITE);
		cardDisplayPanel3.add(cardDisplay3);
		cardDisplay3.setIcon(card3);
		
		Panel cardDisplayPanel4 = new Panel();
		cardDisplayPanel4.setBounds(293, 417, 140, 210);
		add(cardDisplayPanel4);
		cardDisplayPanel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel cardDisplay4 = new JLabel();
		cardDisplay4.setForeground(Color.WHITE);
		cardDisplay4.setBackground(Color.WHITE);
		cardDisplayPanel4.add(cardDisplay4);
		cardDisplay4.setIcon(card4);
		
		JLabel betDisplay = new JLabel("Bet Amount : 2");
		betDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		betDisplay.setBounds(707, 56, 140, 25);
		add(betDisplay);
		
		JButton increaseBet = new JButton("+");
		increaseBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(betAmount < 20) {
					betAmount += 2;
					betDisplay.setText("Bet Amount : " + betAmount);
				}
			}
		});
		increaseBet.setBounds(651, 56, 46, 23);
		add(increaseBet);
		
		JButton decreaseBet = new JButton("-");
		decreaseBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(betAmount > 2) {
					betAmount -= 2;
					betDisplay.setText("Bet Amount : " + betAmount);
				}
			}
		});
		decreaseBet.setBounds(855, 56, 46, 23);
		add(decreaseBet);
		
		JButton startButton = new JButton("Start");
		startButton.setBounds(735, 93, 89, 23);
		add(startButton);
		
		JButton hitButton = new JButton("Hit");
		hitButton.setBounds(92, 651, 89, 23);
		add(hitButton);
		
		JButton stayButton = new JButton("Stay");
		stayButton.setBounds(217, 651, 89, 23);
		add(stayButton);
		
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

