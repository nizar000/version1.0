package client.project;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import third.project.session.beans.calculatrice;
public class TestCalculette {

	public static void main(String[] args){
		
		calculatrice calcul;
		
		try {	
			Context ctx = new InitialContext();
		    calcul  = (calculatrice) ctx
		    		.lookup("/third.project/CalculatriceImp!third.project.session.beans.calculatrice");
		    		
		System.out.println("résultat add 5 + 2 :"+calcul.add(5,2));
		System.out.println("résultat add 5 + 2 :"+calcul.add(5,2));
		System.out.println("résultat add 5 + 2 :"+calcul.add(5,2));
		
		} catch (NamingException e){
			// TODO auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
