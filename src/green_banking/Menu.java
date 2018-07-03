package green_banking;
/**
 *
 */


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 * @author Haseeb khan
 *May 13, 2018
 */
public class Menu extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					JOptionPane.showMessageDialog(null,"You are not allowed to enter directly! please go to Start.java and then click run...");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Green banking management menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 762);
		Menu = new JPanel();
		Menu.setBackground(new Color(102, 255, 153));
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);

		JButton btnOpenNew = new JButton("OPEN NEW ACCOUNT IN BANK");
		btnOpenNew.setForeground(Color.GRAY);
		btnOpenNew.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOpenNew.setBounds(226, 148, 307, 52);
		btnOpenNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Create_Account ca = new Create_Account();
				ca.setVisible(true);
			}
		});
		Menu.setLayout(null);
		Menu.add(btnOpenNew);

		JLabel lblWelcome = new JLabel("GREEN BANKING APPLICATION SOFTWARE");
		lblWelcome.setBackground(Color.WHITE);
		lblWelcome.setForeground(new Color(0, 102, 51));
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWelcome.setBounds(212, -5, 338, 36);
		Menu.add(lblWelcome);

		JButton btnDepositAmountTo = new JButton("DEPOSIT AMOUNT");
		btnDepositAmountTo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Deposite o = new Deposite();
				o.setVisible(true);
			}
		});
		btnDepositAmountTo.setForeground(Color.GRAY);
		btnDepositAmountTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDepositAmountTo.setBounds(226, 229, 307, 52);
		Menu.add(btnDepositAmountTo);

		JButton btnWithdrawAmount = new JButton("WITHDRAW AMOUNT");
		btnWithdrawAmount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				Withdraw o = new Withdraw();
				o.setVisible(true);
			}
		});
		btnWithdrawAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnWithdrawAmount.setForeground(Color.GRAY);
		btnWithdrawAmount.setBounds(226, 309, 307, 52);
		Menu.add(btnWithdrawAmount);

		JButton btnAllAccounts = new JButton("ALL ACCOUNTS LIST");
		btnAllAccounts.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Accounts o = new Accounts();
				o.setVisible(true);
			}
		});
		btnAllAccounts.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAllAccounts.setForeground(Color.GRAY);
		btnAllAccounts.setBounds(226, 394, 307, 52);
		Menu.add(btnAllAccounts);

		JButton btnDeleteAccount = new JButton("MODIFY ACCOUNT");
		btnDeleteAccount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				Modify o = new Modify();
				o.setVisible(true);

			}
		});
		btnDeleteAccount.setForeground(Color.GRAY);
		btnDeleteAccount.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDeleteAccount.setBounds(226, 474, 307, 52);
		Menu.add(btnDeleteAccount);

		JLabel lblOwnerHaseebKhan = new JLabel("OWNER: HASEEB KHAN");
		lblOwnerHaseebKhan.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOwnerHaseebKhan.setBounds(0, 0, 162, 28);
		Menu.add(lblOwnerHaseebKhan);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 49, 795, 2);
		Menu.add(separator);

		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Start o = new Start();
				o.setVisible(true);
				dispose();
			}
		});
		btnLogout.setBounds(752, 2, 86, 34);
		Menu.add(btnLogout);

		JButton button = new JButton("DELETE ACCOUNT");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				Delete o = new Delete();
				o.setVisible(true);
			}
		});
		button.setForeground(Color.GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(226, 553, 307, 52);
		Menu.add(button);

		JLabel lblWelcomeToGreen = new JLabel("Welcome to Green Bank, Pakistan's first and largest dedicated islamic bank.\r\n");
		lblWelcomeToGreen.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWelcomeToGreen.setBounds(10, 56, 637, 34);
		Menu.add(lblWelcomeToGreen);

		JLabel lblNewLabel = new JLabel("The First Islamic Bank in Pakistan to Electronically Facilitate Devident Payments and Tax Certificates for its Shareholders.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(12, 86, 783, 34);
		Menu.add(lblNewLabel);

		JLabel lblGreenBankAccounts = new JLabel("Green Bank Accounts");
		lblGreenBankAccounts.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGreenBankAccounts.setBounds(624, 148, 188, 28);
		Menu.add(lblGreenBankAccounts);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 133, 838, 2);
		Menu.add(separator_1);

		JTextArea txtrTheLargestRange = new JTextArea();
		txtrTheLargestRange.setLineWrap(true);
		txtrTheLargestRange.setWrapStyleWord(true);
		txtrTheLargestRange.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrTheLargestRange.setText("The Largest Range of Riba-free Accounts for Personal Banking.\r\n     Over 600 Branches nationwide Widest Range of Halal Banking Products Internationally Renowned Shariah Board World's largest Islamic Product Development and Research Team.");
		txtrTheLargestRange.setBackground(new Color(102, 255, 153));
		txtrTheLargestRange.setBounds(624, 173, 202, 202);
		Menu.add(txtrTheLargestRange);

		JLabel lblExploreLatestDiscounts = new JLabel("Explore Latest Discounts");
		lblExploreLatestDiscounts.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblExploreLatestDiscounts.setBounds(624, 372, 188, 22);
		Menu.add(lblExploreLatestDiscounts);

		JTextArea txtrFindTheLatest = new JTextArea();
		txtrFindTheLatest.setWrapStyleWord(true);
		txtrFindTheLatest.setLineWrap(true);
		txtrFindTheLatest.setText("Find the latest Green Bank Card promotions here. Simply select your location to view a list of exciting discounts and privileges on your Green Debit Cards!");
		txtrFindTheLatest.setBackground(new Color(102, 255, 153));
		txtrFindTheLatest.setBounds(624, 396, 202, 130);
		Menu.add(txtrFindTheLatest);

		JLabel lblPayYourBills = new JLabel("Pay your Bills");
		lblPayYourBills.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPayYourBills.setBounds(624, 524, 188, 22);
		Menu.add(lblPayYourBills);

		JTextArea txtrDontStandIn = new JTextArea();
		txtrDontStandIn.setWrapStyleWord(true);
		txtrDontStandIn.setText("Don't Stand in line. Pay your bills from any of your preferred channel- Absolutely free!");
		txtrDontStandIn.setLineWrap(true);
		txtrDontStandIn.setBackground(new Color(102, 255, 153));
		txtrDontStandIn.setBounds(624, 546, 202, 76);
		Menu.add(txtrDontStandIn);

		JLabel lblAvailFreeServices = new JLabel("Avail free Services");
		lblAvailFreeServices.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAvailFreeServices.setBounds(12, 148, 126, 22);
		Menu.add(lblAvailFreeServices);

		JTextArea txtrBankWithUs = new JTextArea();
		txtrBankWithUs.setWrapStyleWord(true);
		txtrBankWithUs.setText("Bank with us to avail a range of free services.");
		txtrBankWithUs.setLineWrap(true);
		txtrBankWithUs.setBackground(new Color(102, 255, 153));
		txtrBankWithUs.setBounds(12, 173, 173, 76);
		Menu.add(txtrBankWithUs);

	}
}
