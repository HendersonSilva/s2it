package br.com.s2it.main;

/*
 * @author: Henderson Silva
 * @createDate: 22/11/2018
 * @description: Questão 8 da avaliação técnica
 * @company: S2it
 */

import javax.swing.JOptionPane;

public class Application {
	
	public static void main(String[] args)
	{

		String strA = JOptionPane.showInputDialog("Informe o primeiro número inteiro");
		int A = convert(strA);
		if(A < 0)
		{
			JOptionPane.showMessageDialog(null,"Valor informado é Negativo. Neste caso, o sinal negativo será desconsiderado pois não existe requisito sobre isso.", "Mensagem de Erro", JOptionPane.WARNING_MESSAGE);
			A = -A;
		}
			
		String strB = JOptionPane.showInputDialog("Informe o segundo número inteiro");
		int B = convert(strB);
		if(B < 0)
		{
			JOptionPane.showMessageDialog(null,"Valor informado é Negativo. Neste caso, o sinal negativo será desconsiderado pois não existe requisito sobre isso.", "Mensagem de Erro", JOptionPane.WARNING_MESSAGE);
			B = -B;
		}
	
		String strC = calculateThirdInteger(A, B);
		Long C = Long.parseLong(strC);
		if(C > 1000000)
			JOptionPane.showMessageDialog(null, "Resultado: -1" , "Calculo do número C", JOptionPane.PLAIN_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Resultado: "+ C, "Calculo do número C", JOptionPane.PLAIN_MESSAGE);
				
	}
	
	private static int convert(String numberInStr)
	{

		try
		{
			return Integer.parseInt(numberInStr);

		} 
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null,"Valor Inválido. O valor será 0", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            return 0;
		}
	}
	
	
	private static String calculateThirdInteger(int A, int B)
	{

		String strA = A+"";
		String strB = B+"";
		int sizeNumberA = strA.length();
		int sizeNumberB = strB.length();
		
		
		int sizeNumberC = sizeNumberA + sizeNumberB;
		char[] charC = new char[sizeNumberC];
		
		int posA = 0;
		int posB = 0;
		int posC = 0;
		
		while(posC < sizeNumberC)
		{
			if(posA < sizeNumberA)
			{
				charC[posC] = strA.charAt(posA); 
				posC++;
				posA++;
			}
			
			if(posB < sizeNumberB)
			{
				charC[posC] = strB.charAt(posB); 
				posC++;
				posB++;
			}
		}
		return new String(charC);
		
	}
}
