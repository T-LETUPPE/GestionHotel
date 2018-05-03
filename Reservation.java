public class Reservation{
	Client demandeur;
	Date dateDebut;
	Date dateFin;
	
	public void creerReservation(){
		//Booléenne pour la cohérence entre les dates de debut et de fin de séjour (date de début < date de fin)
		boolean datesCorrectes = true;
		System.out.println("Nouvelle Reservation :");
		//Crée un nouveau client
		demandeur = new Client();
		System.out.println("Identité client : ");
		demandeur.creerClient();
		//Date de début du séjour
		dateDebut = new Date();
		System.out.println("Début du séjour : ");
		dateDebut.creerDate();
		//Date de fin du séjour
		dateFin = new Date();
		System.out.println("Fin du séjour : ");
		//Vérifie  la condition date de début < date de fin, et demande une nouvelle date si et tant que cette condition n'est pas remplie
		do{
			dateFin.creerDate();
			datesCorrectes = (dateFin.annee>=dateDebut.annee && ((dateFin.jour>dateDebut.jour && dateFin.mois>=dateDebut.mois) || (dateFin.mois>dateDebut.mois))) || (dateFin.annee>dateDebut.annee);
		}while(!datesCorrectes);
		//Affiche les dates de début et de fin de la réservation
		System.out.println("Résumé réservation :");
		System.out.println("Date de début : ");
		this.dateDebut.afficheDate();
		System.out.println("Date de fin : ");
		this.dateFin.afficheDate();
	}
}
