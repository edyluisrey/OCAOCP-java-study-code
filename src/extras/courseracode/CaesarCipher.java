package extras.courseracode;

public class CaesarCipher {	
	public static final String  alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String encrypt(String input, int key){		
		StringBuilder encrypted=  new StringBuilder(input);
		String shiftedAlphabet = alphabet.substring(key)+ alphabet.substring(0, key);
		for(int i=0; i<encrypted.length();i++){			
			char currChar= encrypted.charAt(i);
			if(Character.isAlphabetic(currChar)){
				if(Character.isLowerCase(currChar)){
					int idx = alphabet.indexOf(Character.toUpperCase(currChar));
					char newChar= shiftedAlphabet.charAt(idx);
					encrypted.setCharAt(i, Character.toLowerCase(newChar));				
				}else{
					int idx = alphabet.indexOf(currChar);
					char newChar= shiftedAlphabet.charAt(idx);
					encrypted.setCharAt(i, newChar);	
				}
			}
		}		
		
		return encrypted.toString(); 		
   }	
	
   public String   encrypt2(String input, int key, int key2){		
	    StringBuilder encrypted=  new StringBuilder(input);
		String shiftedAlphabet1 = alphabet.substring(key)+ alphabet.substring(0, key);
		String shiftedAlphabet2 = alphabet.substring(key2)+ alphabet.substring(0, key2);
		int cont=1;
		for(int i=0; i<encrypted.length();i++){
			char currChar= encrypted.charAt(i);
			if(Character.isAlphabetic(currChar)){
			   if(cont%2==0){
				   if(Character.isLowerCase(currChar)){
						int idx = alphabet.indexOf(Character.toUpperCase(currChar));
						char newChar= shiftedAlphabet2.charAt(idx);
						encrypted.setCharAt(i, Character.toLowerCase(newChar));				
					}else{
						int idx = alphabet.indexOf(currChar);
						char newChar= shiftedAlphabet2.charAt(idx);
						encrypted.setCharAt(i, newChar);	
					} 
			   }else{
				   if(Character.isLowerCase(currChar)){
						int idx = alphabet.indexOf(Character.toUpperCase(currChar));
						char newChar= shiftedAlphabet1.charAt(idx);
						encrypted.setCharAt(i, Character.toLowerCase(newChar));				
					}else{
						int idx = alphabet.indexOf(currChar);
						char newChar= shiftedAlphabet1.charAt(idx);
						encrypted.setCharAt(i, newChar);	
					} 
			   }	
			   cont++;	
			}else{
				cont=1;
			}
			
		}				
		return encrypted.toString(); 		  //Czojq Ivdzle  Cfopq Ibdflk”
	}

	public static void main(String[] args) {
		CaesarCipher CaesarCiphertest = new CaesarCipher();
		String message = "“First Legion";
		int key=23, key2=17;
		String encrypted= CaesarCiphertest.encrypt2(message, key, key2);
		System.out.println("encrypted: "+encrypted);  
	}

}
