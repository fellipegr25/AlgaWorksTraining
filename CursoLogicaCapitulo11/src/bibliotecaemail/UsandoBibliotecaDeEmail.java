package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("disturbedfgr22", "munique1"));
		email.setSSLOnConnect(true);
		email.setFrom("disturbedfgr22@gmail.com");
		email.setSubject("Aula sobre uso de biblioteca de terceiros.");
		email.setMsg("Se estiver vendo este e-mail é porque o nosso envio funcionou!");
		email.addTo("gfellipe@hotmail.com");
		email.send();
		
		System.out.println("Fim...");
	}

}
