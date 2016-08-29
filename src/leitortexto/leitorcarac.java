package leitortexto;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class leitorcarac {
	public static void main(String[] args) {
		Charset charset = Charset.forName("UTF-8");
		Path addresses_path = Paths.get("dom_casmurro.txt");
		int[] caracteres = new int[26];
		try (BufferedReader reader = Files.newBufferedReader(addresses_path, charset)) {
			int value=0;
	        while((value = reader.read()) != -1){
	        	char c = (char)value;
	        	if(c=='A' || c=='a' || c=='À' || c=='à' || c=='Ã' || c=='ã' || c=='Â' || c=='â' || c=='Á' || c=='á')
	        		caracteres[0]++;
	        	else if(c=='B' || c=='b')
	        		caracteres[1]++;
	        	else if(c=='C' || c=='c' || c=='Ç' || c=='ç')
	        		caracteres[2]++;
	        	else if(c=='D' || c=='d')
	        		caracteres[3]++;
	        	else if(c=='E' || c=='e' || c=='É' || c=='é' || c=='Ê' || c=='ê')
	        		caracteres[4]++;
	        	else if(c=='F' || c=='f')
	        		caracteres[5]++;
	        	else if(c=='G' || c=='g')
	        		caracteres[6]++;
	        	else if(c=='H' || c=='h')
	        		caracteres[7]++;
	        	else if(c=='I' || c=='i' || c=='Í' || c=='í')
	        		caracteres[8]++;
	        	else if(c=='J' || c=='j')
	        		caracteres[9]++;
	        	else if(c=='K' || c=='k')
	        		caracteres[10]++;
	        	else if(c=='L' || c=='l')
	        		caracteres[11]++;
	        	else if(c=='M' || c=='m')
	        		caracteres[12]++;
	        	else if(c=='N' || c=='n')
	        		caracteres[13]++;
	        	else if(c=='O' || c=='o' || c=='Ó' || c=='ó' || c=='Õ' || c=='õ')
	        		caracteres[14]++;
	        	else if(c=='P' || c=='p')
	        		caracteres[15]++;
	        	else if(c=='Q' || c=='q')
	        		caracteres[16]++;
	        	else if(c=='R' || c=='r')
	        		caracteres[17]++;
	        	else if(c=='S' || c=='s')
	        		caracteres[18]++;
	        	else if(c=='T' || c=='t')
	        		caracteres[19]++;
	        	else if(c=='U' || c=='u' || c=='Ú' || c=='ú' || c=='Ü' || c=='ü')
	        		caracteres[20]++;
	        	else if(c=='V' || c=='v')
	        		caracteres[21]++;
	        	else if(c=='W' || c=='w')
	        		caracteres[22]++;
	        	else if(c=='X' || c=='x')
	        		caracteres[23]++;
	        	else if(c=='Y' || c=='y')
	        		caracteres[24]++;
	        	else if(c=='Z' || c=='z')
	        		caracteres[25]++;
	        }
		} catch (IOException x) {
			System.out.println("catch");
		    System.err.format("IOException: %s%n", x);
		}
		for(int i=0; i<26; i++){
			System.out.println(caracteres[i]);
		}
	}
}
