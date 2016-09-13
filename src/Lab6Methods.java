

public class Lab6Methods {
	
	public static  StringBuffer makeLowerCase(StringBuffer strBuff) { //lower case method	
		
		for(int i = 0; i < strBuff.length(); i ++){
			char c = strBuff.charAt(i);
			strBuff.setCharAt(i, Character.toLowerCase(c));
			
		}
		return strBuff;
	}//end make lower case method
}
