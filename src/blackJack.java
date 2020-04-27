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
	private deck deck = new deck();

	/**
	 * Create the panel.
	 */
	public blackJack() {
		Player player = new Player();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel BJNamePlate = new JLabel("Blackjack");
		BJNamePlate.setFont(new Font("Dialog", Font.PLAIN, 32));
		BJNamePlate.setBounds(410, 6, 149, 75);
		add(BJNamePlate);
		
		Panel cardDisplayPanel = new Panel();
//		panel.setBackground(new Color(7, 99, 36));
		cardDisplayPanel.setBounds(79, 117, 140, 210);
		add(cardDisplayPanel);
		cardDisplayPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel dealerCardDisplay = new JLabel();
		cardDisplayPanel.add(dealerCardDisplay);
		dealerCardDisplay.setForeground(Color.WHITE);
		dealerCardDisplay.setBackground(Color.WHITE);
		
		Panel cardDisplayPanel2 = new Panel();
		cardDisplayPanel2.setBounds(293, 117, 140, 210);
		add(cardDisplayPanel2);
		cardDisplayPanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		
		JLabel dealerCardDisplay2 = new JLabel();
		dealerCardDisplay2.setForeground(Color.WHITE);
		dealerCardDisplay2.setBackground(Color.WHITE);
		cardDisplayPanel2.add(dealerCardDisplay2);
		
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
		
		JLabel playerCardDisplay = new JLabel();
		playerCardDisplay.setForeground(Color.WHITE);
		playerCardDisplay.setBackground(Color.WHITE);
		cardDisplayPanel3.add(playerCardDisplay);
		
		Panel cardDisplayPanel4 = new Panel();
		cardDisplayPanel4.setBounds(293, 417, 140, 210);
		add(cardDisplayPanel4);
		cardDisplayPanel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel playerCardDisplay2 = new JLabel();
		playerCardDisplay2.setForeground(Color.WHITE);
		playerCardDisplay2.setBackground(Color.WHITE);
		cardDisplayPanel4.add(playerCardDisplay2);
		
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
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon dealerCard1 = new ImageIcon("cards/anotherback.png");
				dealerCard1 = scaleImage(dealerCard1, 131 , 200);		
				dealerCardDisplay.setIcon(dealerCard1);
						
				ImageIcon dealerCard2 = new ImageIcon("cards/"+ getCard( )+".png");
				dealerCard2 = scaleImage(dealerCard2, 131 , 200);		
				dealerCardDisplay2.setIcon(dealerCard2);
			
			}
		});
		startButton.setBounds(735, 93, 89, 23);
		add(startButton);
		
		JButton hitButton = new JButton("Hit");
		hitButton.setBounds(92, 651, 89, 23);
		add(hitButton);
		
		JButton stayButton = new JButton("Stay");
		stayButton.setBounds(217, 651, 89, 23);
		add(stayButton);
		
		JLabel totalChipDisplay = new JLabel("Total Chips : " + player.getChips());
		totalChipDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		totalChipDisplay.setBounds(651, 11, 169, 25);
		add(totalChipDisplay);
		
	}
	
	private String getCard() {
		deck.populateDeck();
		
		return deck.getRandomCard();
	}
	
	private ImageIcon scaleImage(ImageIcon icon, int w, int h){
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

