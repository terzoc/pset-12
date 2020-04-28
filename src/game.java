import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JPanel panel = new JPanel();
		frmCards.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		CardLayout cardLayout = (CardLayout) panel.getLayout();
		
		JPanel poker = new poker();
		panel.add(poker, "pokerPanel");
		
//		main menu for poker
		JButton btnNewButton_2 = new JButton("Main Menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panel, "mainMenu");
			}
		});
		btnNewButton_2.setBounds(316, 339, 115, 30);
		poker.add(btnNewButton_2);
		
		blackJack BJPanel = new blackJack();
		panel.add(BJPanel, "BJPanel");
		
//		main menu for black jack
		JButton button = new JButton("Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BJPanel.getIsGameStarted()) {
					int dialogResult = JOptionPane.showConfirmDialog (null, "You have started a game and are leaving to the main menu. \n\n This will reset your progress. \n\n Are You sure you want to leave?","Warning",JOptionPane.YES_NO_OPTION);
			    	  if(dialogResult == JOptionPane.YES_OPTION){
			    		  cardLayout.show(panel, "mainMenu");
			    	  }

				}else {
					cardLayout.show(panel, "mainMenu");
				}				
			}
		});
		button.setBounds(829, 650, 115, 30);
		BJPanel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1, "mainMenu");
		panel_1.setLayout(null);
		cardLayout.show(panel, "mainMenu");
		
		JLabel lblNewLabel = new JLabel("Welcome to Card Games");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 32));
		lblNewLabel.setBounds(294, 57, 365, 84);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Blackjack");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BJPanel.resetGame();
				cardLayout.show(panel, "BJPanel");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(389, 245, 166, 47);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Poker");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panel, "pokerPanel");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(389, 313, 166, 47);
		panel_1.add(btnNewButton_1);
		
		JButton btnResetChips = new JButton("Reset Chips");
		btnResetChips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player.setChips(500);
			}
		});
		btnResetChips.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnResetChips.setBounds(389, 384, 166, 47);
		panel_1.add(btnResetChips);
	}
}
