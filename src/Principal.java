
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	static String[] listaPalavras = {"software","engenharia","linux","ram","penacova","windows","linux","osx"};
	String letra;
	static Random gerarpalavra = new Random();
	static String palavraGerada;
	
	
	static int letrasErradas=0;
	static int letrasCertas=0;
	static boolean continuar=true;
	
	static ArrayList<String> TodasLetras = new ArrayList<>();
	


	
	public static void Verificar(JTextField txtLetra,JLabel cabeca,JLabel tronco,JLabel pernas,JLabel lbl_Palavra, JLabel lbl_Ganhou){

		
		String word = txtLetra.getText();
		
		txtLetra.addKeyListener(new KeyAdapter() {

			  public void keyTyped(KeyEvent e) {
			    char keyChar = e.getKeyChar();
			    if (Character.isUpperCase(keyChar)) {
			      e.setKeyChar(Character.toLowerCase(keyChar));
			    }
			  }

			});

		

		
		if(!(TodasLetras.contains(txtLetra.getText())) && !(txtLetra.getText().equals(""))){
			
			//Se for palavra
			if(word.length()>1){
				if(word.equals(palavraGerada)){
					lbl_Palavra.setText(palavraGerada);
					//Palavras iguais, label fica com a palavra completa
					Ganhar(txtLetra,cabeca,tronco,pernas,lbl_Palavra,lbl_Ganhou); // Verifica se perde
				}
				else{
					letrasErradas++;
					Vivo(cabeca,tronco,pernas);
					Ganhar(txtLetra,cabeca,tronco,pernas,lbl_Palavra,lbl_Ganhou); // Verifica se ganha
				}
			}
			
			// Se for s� uma letra
			else{
				//StringBuilder sb = new StringBuilder(palavraGerada);
				//char letter = txtLetra.getText().charAt(0);
				for (int i=0;i<palavraGerada.length() ;i++)
				{
					if(palavraGerada.charAt(i) ==txtLetra.getText().charAt(0)){
						lbl_Palavra.setText(lbl_Palavra.getText().substring(0,i)+ palavraGerada.charAt(i) + lbl_Palavra.getText().substring(i+1));
						
					}
				}
				if(palavraGerada.contains(txtLetra.getText()))
				{
					txtLetra.setText("");
					letrasCertas++;
					Ganhar(txtLetra,cabeca,tronco,pernas,lbl_Palavra,lbl_Ganhou); // Verifica se perde
				}
				else{
					TodasLetras.add(txtLetra.getText());
					letrasErradas++;
					System.out.println();
					Vivo(cabeca,tronco,pernas);
					Ganhar(txtLetra,cabeca,tronco,pernas,lbl_Palavra,lbl_Ganhou); // Verifica se ganha
				}
		}
		}
	}
	
	
	public static void Vivo(JLabel cabeca,JLabel tronco,JLabel pernas){
		if(letrasErradas==3){
			cabeca.setVisible(true);
		}
		else if(letrasErradas==2){
			tronco.setVisible(true);
		}
		else if(letrasErradas==1){
			pernas.setVisible(true);
		}
		/*
		 * Vai fazendo o corpo do boneco conforme os erros - David
		 * 
		 */
	}
	
	/*public static String changeCharInPosition(int position, char ch, String str){
	    char[] charArray = str.toCharArray();
	    charArray[position] = ch;
	    return new String(charArray);
	} //posicao das letras no array    -  Experiencia*/
	
	
	public static void Ganhar(JTextField txtLetra,JLabel cabeca,JLabel tronco,JLabel pernas,JLabel lbl_Palavra, JLabel lbl_Ganhou){
		
		if(letrasErradas==3){
			lbl_Ganhou.setText("Perdeu estuda-se Medicina!");
			lbl_Palavra.setText("A palavra era "+palavraGerada);
			n = JOptionPane.showConfirmDialog(null, "Acabou!", "Gostaria de tentar novamente?",JOptionPane.YES_NO_OPTION);
			Continuar(txtLetra,cabeca,tronco,pernas,lbl_Palavra,lbl_Ganhou);
		}
		
		else if (palavraGerada.equals(lbl_Palavra.getText()))
				{
			lbl_Ganhou.setText("Ganhou Parab�ns!");
			 n = JOptionPane.showConfirmDialog(null, "Acabou!", "Gostaria de Continuar?",JOptionPane.YES_NO_OPTION);
			Continuar(txtLetra,cabeca,tronco,pernas,lbl_Palavra,lbl_Ganhou);
		}
		
	}
	
	
	/*public static void Preencher(JTextField txtLetra, JLabel lbl_Palavra)
	
	{
		char letter = 0;
		int i = 0;
		while(palavraGerada.indexOf(i, letter) != -1) {
		   i = palavraGerada.indexOf(i, letter) + 1;
		   //Do whatever
		}
		if(txtLetra.getText().charAt(0) == letter)
		{
			
		}
		if(i == 0) {
		   //Handle missed letter 
		}
	}*/
	
	static int n;
	
	
	public static void Continuar(JTextField txtLetra,JLabel cabeca,JLabel tronco,JLabel pernas,JLabel lbl_Palavra, JLabel lbl_Ganhou){
		if (n == JOptionPane.YES_OPTION) 
		{
			letrasErradas=0;
			txtLetra.setText("");
			cabeca.setVisible(false);
			tronco.setVisible(false);
			pernas.setVisible(false);
			lbl_Palavra.setText("");
			lbl_Ganhou.setText("");
			Gerar(lbl_Palavra);
			
			// Come�ar de novo

		} 
		else if (n == JOptionPane.NO_OPTION) 
		{
			System.exit(0);//Fechar
		} else 
		{
			System.exit(0);//Fechar
		}
	}
	
	
	public static void Gerar(JLabel lbl_Palavra){
				
		//Vai gerar uma palavra do array.
		int palavragerada= gerarpalavra.nextInt(listaPalavras.length);
		palavraGerada=listaPalavras[palavragerada];
		int lenght = palavraGerada.length();
		for (int i=0;i<lenght ;i++){
			
			lbl_Palavra.setText(lbl_Palavra.getText()+"_");
			
		}
		
	}
	
	
	
	

}
