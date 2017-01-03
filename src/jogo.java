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
		
		JLabel lblimage = new JLabel("New label");
		lblimage.setIcon(new ImageIcon(jogo.class.getResource("/images/forca.PNG")));
		lblimage.setBounds(10, 86, 231, 274);
		contentPane.add(lblimage);
		
		JButton btnBtn = new JButton("BTN");
		btnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GerarGuess();
			}
		});
		btnBtn.setBounds(146, 41, 81, 37);
		contentPane.add(btnBtn);
		
		textField = new JTextField();
		textField.setBounds(94, 46, 40, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lbl_Palavra = new JLabel("");
		lbl_Palavra.setBounds(264, 168, 154, 27);
		contentPane.add(lbl_Palavra);
	}
	
	String[] listaPalavras = {"Software","Engenharia","Linux", "Processador","RAM","Penacova"};
	String letra;
	Random gerarpalavra = new Random();
	String palavra1;
	int lenght = palavra1.length();
	ArrayList<String> Errou = new ArrayList<>();


	/*public void Verificar(ActionEvent e){
		
		
		
		if( palavra1.contains(btnname)){
			//Label recebe a letra
		}
		else{
			//Vai aparecer cabeça e o caraças			
			Errou.add(btnname);
		}
	}*/
	
	
	public String Gerar(){
				
		int palavragerada= gerarpalavra.nextInt(listaPalavras.length);
		palavra1=listaPalavras[palavragerada];
		return palavra1;
	}

	public static void GerarGuess() {
		-gera
		for (int i=0;i<lenght ;i++){
			
			
			lbl_Palavra.setText(lbl_Palavra.getText()+" _ ");
			
		}
		
	}
}
