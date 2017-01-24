
/**
 * Write a description of class Banque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Agence
{
    private int idAgence;
    private String nomBanque;
    private String adresseBanque;
    private Banque banque;
    ArrayList<Client> listeClient;
    
    
    /**
     * Constructor for objects of class Banque
     */
    public Agence(int id,String nomBanque,String adresseBanque,Banque banque)
    {
        // initialise instance variables
        this.setIdAgence(id);
        this.nomBanque=nomBanque;
        this.adresseBanque=adresseBanque;
        listeClient=new ArrayList<>();
        this.banque=banque;     
    }
    
    public String getNomBanque(){
        return this.nomBanque;
    }
    public String getAdresseBanque(){
        return this.adresseBanque;
    }
    public void setNomBanque(String nomBanque){
        this.nomBanque=nomBanque;
    }
    public void setAdresseBanque(String adresseBanque){
        this.adresseBanque=adresseBanque;
    }
    
    public void changerNomBanque(String nom){
        this.nomBanque=nom;
    }

	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}
