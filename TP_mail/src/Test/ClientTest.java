package Test;

import junit.framework.TestCase;
import BanqueP.*;

public class ClientTest extends TestCase {
	
	public void testDebiter() throws Exception{
		Client client=new Client(25,25.2,null);
		client.debiter(10);
		assertEquals(15.2, client.getSolde());
		
	}
	public void testCréditer() throws Exception{
		Client client=new Client(25,25.2,null);
		client.crediter(10);
		assertEquals(35.2, client.getSolde());
		
	}

}
