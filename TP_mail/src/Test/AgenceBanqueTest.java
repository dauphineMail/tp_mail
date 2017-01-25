package Test;

import junit.framework.TestCase;
import BanqueP.Agence;
import BanqueP.Client;

public class AgenceBanqueTest extends TestCase {
	public void testAjouterClient() {
		Agence agence=new Agence(02,"Agence A","Adresse",null);
		agence.ajouterClient(25);
		assertEquals(1, agence.getListeClient().size());
		
	}
	
	public void supprimerClient() {
		Agence agence=new Agence(02,"Agence A","Adresse",null);
		Client client=new Client (25,100,agence);
		Client client1=new Client (28,100,agence);
		
		agence.getListeClient().add(client);
		agence.getListeClient().add(client1);
		//assertEquals(true, agence.getListeClient().contains(client));
		agence.supprimerClient(client);
		assertEquals(false, agence.getListeClient().contains(client));
		
	}
	public void créditerClient() {
		Agence agence=new Agence(02,"Agence A","Adresse",null);
		Client client=new Client (25,100,agence);
		agence.getListeClient().add(client);
		agence.crediterCompte(client, 25.3);
		assertEquals(125.3, agence.getListeClient().get(0).getSolde());
		
	}

}
