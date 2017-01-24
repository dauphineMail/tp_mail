package BanqueP;
/**
 * Write a description of class Banque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Agence {
	private int idAgence;
	private String nomBanque;
	private String adresseBanque;
	private Banque banque;
	private ArrayList<Client> listeClient;

	/**
	 * Constructor for objects of class Banque
	 */
	public Agence(int id, String nomBanque, String adresseBanque, Banque banque) {
		// initialise instance variables
		this.setIdAgence(id);
		this.nomBanque = nomBanque;
		this.adresseBanque = adresseBanque;
		listeClient = new ArrayList<>();
		this.setBanque(banque);
	}
	public void ajouterClient(double soldeInitial){
		if(soldeInitial>=0){
			listeClient.add(new Client(listeClient.size()+1, soldeInitial, this));
		}
	}
	public void debiterCompte(Client client,double solde){
		if((solde>0)&&(this.listeClient.contains(client))){
			client.debiter(solde);
		}
	}
	public void crediterCompte(Client client,double solde){
		if((solde>0)&&(this.listeClient.contains(client))){
			client.debiter(solde);
		}
	}
	public void supprimerClient(Client client){
		if(this.listeClient.contains(client))
			this.listeClient.remove(client);
	}

	public String getNomBanque() {
		return this.nomBanque;
	}

	public String getAdresseBanque() {
		return this.adresseBanque;
	}

	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}

	public void setAdresseBanque(String adresseBanque) {
		this.adresseBanque = adresseBanque;
	}

	public void changerNomBanque(String nom) {
		this.nomBanque = nom;
	}

	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	public ArrayList<Client> getListeClient() {
		return listeClient;
	}
	public void setListeClient(ArrayList<Client> listeClient) {
		this.listeClient = listeClient;
	}
	

	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param y
	 *            a sample parameter for a method
	 * @return the sum of x and y
	 */

}
