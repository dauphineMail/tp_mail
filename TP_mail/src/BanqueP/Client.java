package BanqueP;

/**
 * Write a description of class CompteClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    private int numeroCompte;
    private double solde;
	private Agence banqueCompte;
	private String nom;
	private String prenom;

    /**
     * Constructor for objects of class CompteClient
     */
    public Client(int numeroCompte,double solde,Agence banqueCompte)
    {
        // initialise instance variables
        this.setNumeroCompte(numeroCompte);
        this.setSolde(solde);
        this.setBanqueCompte(banqueCompte);
        
    }
    public void debiter(double solde){
    	this.solde-=solde;
    }
    public void crediter(double solde){
    	this.solde+=solde;
    }

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Agence getBanqueCompte() {
		return banqueCompte;
	}

	public void setBanqueCompte(Agence banqueCompte) {
		this.banqueCompte = banqueCompte;
	}

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   
}
