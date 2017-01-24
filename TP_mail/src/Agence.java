
/**
 * Write a description of class Banque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Agence
{
    private int idBanque;
    private String nomBanque;
    private String adresseBanque;
    ArrayList<Client> listeClient;
    
    
    /**
     * Constructor for objects of class Banque
     */
    public Agence(int id,String nomBanque,String adresseBanque)
    {
        // initialise instance variables
        this.idBanque=id;
        this.nomBanque=nomBanque;
        this.adresseBanque=adresseBanque;
        listeClient=new ArrayList<>();
       
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

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}
