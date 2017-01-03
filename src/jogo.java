import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class jogo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private static JLabel lbl_Palavra;
	private JButton btnBtn ;
	private JLabel lblimage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jogo frame = new jogo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jogo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblimage = new JLabel("New label");
		lblimage.setIcon(new ImageIcon(jogo.class.getResource("/images/forca.PNG")));
		lblimage.setBounds(10, 86, 231, 274);
		contentPane.add(lblimage);
		
		btnBtn = new JButton("BTN");
		btnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBtn.setBounds(146, 41, 81, 37);
		contentPane.add(btnBtn);
		
		textField = new JTextField();
		textField.setBounds(94, 46, 40, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lbl_Palavra = new JLabel("cfgbhc");
		lbl_Palavra.setBounds(268, 86, 154, 27);
		contentPane.add(lbl_Palavra);
		
		Principal.Gerar(lbl_Palavra);
	}
	
	
	
}
