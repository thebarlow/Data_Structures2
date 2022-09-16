/*Still not yet capable of handling symbol imbalance in multi line comments
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SymbolBalance {
	public static void main(String []args){
		File file = new File((args[0]));  
		FileInputStream fis = null;
		String str="";

		try {
		       fis = new FileInputStream(file);
		       int content;
		       while ((content = fis.read()) != -1) {
		        //System.out.print((char) content);
		    	   str+=(char)content;
		        }
		       } catch (IOException e) {
		        e.printStackTrace();
		        } finally {
		        try {
		            if (fis != null)
		                fis.close();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }		
		check_symbols(str);
	}
	public static boolean check_symbols(String str){
		MyStack<Character> stack=new MyStack<Character>();
		//Tells program whether or not to keep checking due to commenting.
		boolean keepChecking=true;
		
		for(int j=0;j<str.length();j++){
			char c =str.charAt(j);
			
			/*If there exists at least one element after the current index, check both to see
			 * if a multi line comment begins or ends here.
			 */
			if(j<str.length()-1){
				if(c=='/' && str.charAt(j+1)=='*' && keepChecking==true){
					keepChecking=false;
					stack.push(c);
				}
				if(c=='*' && str.charAt(j+1)=='/' && keepChecking==false){
					keepChecking=true;
					if(stack.isEmpty() || stack.pop()!='/'){
						System.out.println("Unblanced! Symbol */ is mismatched.");
						return false;
					}
				}
			}
			if(keepChecking==true){
				if(c=='"'){
					if(stack.peek()=='"'){stack.pop();}
					else{stack.push(c);}
				}
				else if(c=='(' || c=='{' || c=='['){
					stack.push(c);
				}
				else if(c==')'){
					if(stack.isEmpty() || stack.pop()!='('){
						System.out.println("Unbalanced! Symbol ) is mismatched.");
						return false;
					}
				}
				else if(c=='}'){
					if(stack.isEmpty() || stack.pop()!='{'){
						System.out.println("Unbalanced! Symbol } is mismatched.");
						return false;
					}
				}
				else if(c==']'){
					if(stack.isEmpty() ||stack.pop()!='['){
						System.out.println("Unbalanced! Symbol ] is mismatched.");
						return false;
					}
				}
			}
		}
		if(!stack.isEmpty()){
			System.out.println("not enough closing statements!");
			return false;
		}
		System.out.println("Balanced!");
		return stack.isEmpty();
		
	}
}
