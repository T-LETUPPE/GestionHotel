import java.util.Scanner;

public class Client{
	String nom;
	String prenom;
	long tel;
	
	public void creerClient(){
		/* mettre des vérifications => si le client existe déjà par exemple */
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom :");
		this.nom=sc.nextLine();
		System.out.println("Prénom :");
		this.prenom=sc.nextLine();
		System.out.println("Téléphone :");
		this.tel=sc.nextLong();
		System.out.println(this.nom+"\n"+this.prenom+"\n"+this.tel);
		sc.close();
	}
	
	public void modifierClient(String nom, String prenom, long tel){
		if (nom!= this.nom) this.nom = nom;
		if (prenom!= this.prenom) this.prenom = prenom;
		if (tel!= this.tel) this.tel = tel;
	}
	
	public void supprimerClient(){
		/*Ajouter le contenu*/
	}
}
