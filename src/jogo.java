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
	private JTextField txtLetra;
	private static JLabel lbl_Palavra;
	private JButton btnBtn ;
	private JLabel lbl_forca;
	private JLabel lbl_tronco;
	private JLabel lbl_pernas;

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
		
		lbl_forca = new JLabel("");
		lbl_forca.setIcon(new ImageIcon(jogo.class.getResource("/images/forca.PNG")));
		lbl_forca.setBounds(12, 86, 231, 274);
		contentPane.add(lbl_forca);
		
		btnBtn = new JButton("BTN");
		btnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBtn.setBounds(146, 41, 81, 37);
		contentPane.add(btnBtn);
		
		txtLetra = new JTextField();
		txtLetra.setBounds(94, 46, 40, 27);
		contentPane.add(txtLetra);
		txtLetra.setColumns(10);
		
		lbl_Palavra = new JLabel("");
		lbl_Palavra.setBounds(268, 86, 154, 27);
		contentPane.add(lbl_Palavra);
		
		Principal.Gerar(lbl_Palavra);
		
		JLabel lbl_cabeca = new JLabel("");
		lbl_cabeca.setIcon(new ImageIcon(jogo.class.getResource("/images/head.png")));
		lbl_cabeca.setBounds(170, 150, 57, 53);
		contentPane.add(lbl_cabeca);
		
		lbl_tronco = new JLabel("");
		lbl_tronco.setIcon(new ImageIcon(jogo.class.getResource("/images/chest.png")));
		lbl_tronco.setBounds(156, 195, 81, 42);
		contentPane.add(lbl_tronco);
		
		lbl_pernas = new JLabel("");
		lbl_pernas.setIcon(new ImageIcon(jogo.class.getResource("/images/legs.png")));
		lbl_pernas.setBounds(170, 237, 56, 53);
		contentPane.add(lbl_pernas);
	}
}
