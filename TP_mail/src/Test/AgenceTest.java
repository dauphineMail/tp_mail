package Test;

import junit.framework.TestCase;
import BanqueP.*;
public class AgenceTest extends TestCase {
	public void testAjouterClient() throws Exception{
		Agence agence=new Agence(02,"Agence A","Adresse",null);
		Client client=new Client (25,100,agence);
		agence.ajouterClient(25);
		assertEquals(1, agence.getListeClient().size());
		
	}
	public void SupprimerClient() throws Exception{
		Agence agence=new Agence(02,"Agence A","Adresse",null);
		Client client=new Client (25,100,agence);
		agence.getListeClient().add(client);
		//assertEquals(true, agence.getListeClient().contains(client));
		agence.supprimerClient(client);
		assertEquals(false, agence.getListeClient().contains(client));
		
	}

}
