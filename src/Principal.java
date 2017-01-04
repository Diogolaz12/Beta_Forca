
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	static String[] listaPalavras = {"Software","Engenharia","Linux", "Processador","RAM","Penacova"};
	String letra;
	static Random gerarpalavra = new Random();
	static String palavraGerada;
	
	
	static int letrasErradas=0;
	static int letrasCertas=0;
	
	
	static ArrayList<String> TodasLetras = new ArrayList<>();
	


	public static void Verificar(JTextField txtLetra,JLabel cabeca,JLabel tronco,JLabel pernas,JLabel lbl_Palavra){

		String word = txtLetra.getText();

		
		if(!(TodasLetras.contains(txtLetra.getText())) && txtLetra.getText()!=""){
			
			//Se for palavra
			if(word.length()>1){
				if(word==palavraGerada){
					lbl_Palavra.setText(palavraGerada);
					System.out.println("Parabens,ganhou!");
					//Palavras iguais, label fica com a palavra completa
					Ganhar(); // Verifica se perde
				}
				else{
					letrasErradas++;
					Vivo(cabeca,tronco,pernas);
					Ganhar(); // Verifica se ganha
				}
			}
			
			// Se for só uma letra
			else{
				StringBuilder sb = new StringBuilder(palavraGerada);
				char letter = txtLetra.getText().charAt(0);
				for (int i=0;i<palavraGerada.length() ;i++){

				if(palavraGerada.charAt(i) ==txtLetra.getText().charAt(0)){
					

					lbl_Palavra.setText(lbl_Palavra.getText().substring(0,i)+ palavraGerada.charAt(i) + lbl_Palavra.getText().substring(i+1));
					/*
					 * 
					 * Mete aqui o codigo, para meter as letras para a label,tudo o resto, está bom I guess - David
					 * 
					 * 
					 * 
					 */
					letrasCertas++;
					Ganhar(); // Verifica se perde
				
				}
				else{
					TodasLetras.add(txtLetra.getText());
					letrasErradas++;
					Vivo(cabeca,tronco,pernas);
					Ganhar(); // Verifica se ganha
				}
			}
		}
		}
	}
	
	
	public static void Vivo(JLabel cabeca,JLabel tronco,JLabel pernas){
		if(letrasErradas==1){
			cabeca.setVisible(true);
		}
		else if(letrasErradas==2){
			tronco.setVisible(true);
		}
		else if(letrasErradas==3){
			pernas.setVisible(true);
		}
		/*
		 * Vai fazendo o corpo do boneco conforme os erros - David
		 * 
		 */
	}
	
	public static String changeCharInPosition(int position, char ch, String str){
	    char[] charArray = str.toCharArray();
	    charArray[position] = ch;
	    return new String(charArray);
	}
	
	
	public static void Ganhar(){
		
		//Para o Sérgio
		
		
		
		
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
	
	
	public static void Gerar(JLabel lbl_Palavra){
				
		//Vai gerar uma palavra do array.
		int palavragerada= gerarpalavra.nextInt(listaPalavras.length);
		palavraGerada=listaPalavras[palavragerada];
		System.out.println(palavraGerada);
		int lenght = palavraGerada.length();
		for (int i=0;i<lenght ;i++){
			
			lbl_Palavra.setText(lbl_Palavra.getText()+"_");
			
		}
		
	}

}
