package green_banking;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * @author Haseeb khan
 *May 15, 2018
 */
public class Start extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel LOGIN;
	private JTextField Username;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
					frame.setLocation(550, 250);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection conn = null;

	/**
	 * Create the frame.
	 */
	public Start() {
		setTitle("Login");

		conn = sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 590);
		LOGIN = new JPanel();
		LOGIN.setBackground(new Color(51, 102, 255));
		LOGIN.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(LOGIN);
		LOGIN.setLayout(null);

		Username = new JTextField();
		Username.setBackground(new Color(153, 204, 255));
		Username.setBounds(395, 164, 340, 34);
		LOGIN.add(Username);
		Username.setColumns(10);

		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {

				String username = Username.getText();
				String password = Password.getText();

				if(username.equals("Haseeb") && password.equals("banking"))
				{
					Menu m = new Menu();
					m.setVisible(true);
					dispose();
				}

				else
				{
					JOptionPane.showMessageDialog(null,"Username or password incorrect!");

				}
			}
		});
		btnNewButton.setForeground(new Color(255, 153, 102));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(440, 378, 131, 46);
		LOGIN.add(btnNewButton);

		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.activeCaptionBorder);
		separator.setBounds(12, 111, 723, 2);
		LOGIN.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(SystemColor.activeCaptionBorder);
		separator_1.setBounds(12, 103, 723, 2);
		LOGIN.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(SystemColor.activeCaptionBorder);
		separator_2.setBounds(271, 295, 464, 13);
		LOGIN.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(SystemColor.activeCaptionBorder);
		separator_3.setBounds(271, 305, 464, 3);
		LOGIN.add(separator_3);

		Password = new JPasswordField();
		Password.setBackground(new Color(153, 204, 255));
		Password.setBounds(395, 225, 340, 34);
		LOGIN.add(Password);

		JLabel lblPleaseSignIn = new JLabel("Please log in to your account assigned by Green Banking");
		lblPleaseSignIn.setForeground(SystemColor.info);
		lblPleaseSignIn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPleaseSignIn.setBounds(183, 66, 419, 24);
		LOGIN.add(lblPleaseSignIn);

		JLabel lblSignIn = new JLabel("SIGN IN");
		lblSignIn.setBackground(new Color(50, 205, 50));
		lblSignIn.setForeground(SystemColor.info);
		lblSignIn.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 30));
		lblSignIn.setBounds(281, 0, 175, 53);
		LOGIN.add(lblSignIn);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblUserName.setBounds(283, 164, 91, 34);
		LOGIN.add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPassword.setBounds(283, 225, 91, 34);
		LOGIN.add(lblPassword);

		JLabel lblNewLabel = new JLabel("");

		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));

		lblNewLabel.setBounds(12, 126, 247, 298);
		LOGIN.add(lblNewLabel);
	}
}
