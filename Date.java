import java.util.Scanner;

public class Date{
  int jour;
  int mois;
  int annee;

  //Fonction pour creer une nouvelle date (les données sont passées en paramètres)
  public void creerDate(int day, int month, int year){
    this.jour=day;
    this.mois=month;
    this.annee=year;
  }

  //Fonction pour rentrer une nouvelle date
  public void creerDate(){
    Scanner sc = new Scanner(System.in);
    //Boucle pour rentrer une date (condition d'arrêt : la fonction vérif date renvoie false, c-à-d que la date est valide)
    do {
      System.out.println("Jour : ");
      this.jour=sc.nextInt();
      System.out.println("Mois : ");
      this.mois=sc.nextInt();
      System.out.println("Année : ");
      this.annee=sc.nextInt();
    } while(verifDate());
  }

  public boolean verifDate(){
    //Année bissextile ?
    boolean bissextile = (this.annee%400==0 || (this.annee%4==0 && this.annee%400!=0));
    //System.out.println("Nous sommes une année bissextile : "+bissextile);
    boolean erreur = false;
    switch (this.mois) {
      //Pour les mois de 31 jours
      case 1 : if (this.jour>0 && this.jour<=31) break;
      case 3 : if (this.jour>0 && this.jour<=31) break;
      case 5 : if (this.jour>0 && this.jour<=31) break;
      case 7 : if (this.jour>0 && this.jour<=31) break;
      case 8 : if (this.jour>0 && this.jour<=31) break;
      case 10 : if (this.jour>0 && this.jour<=31) break;
      case 12 : if (this.jour>0 && this.jour<=31) break;
      //Pour les mois de 30 jours
      case 4 : if (this.jour>0 && this.jour<=30) break;
      case 6 : if (this.jour>0 && this.jour<=30) break;
      case 9 : if (this.jour>0 && this.jour<=30) break;
      case 11 : if (this.jour>0 && this.jour<=30) break;
      //Pour février
      case 2 : if (this.jour>0 && ((this.jour<=28 && (!bissextile)) || (this.jour<=29 && (bissextile)))) break;
      //Si la date n'est pas bonne/n'existe pas
      default:
        erreur=true;
        System.out.println("Date invalide");
    }
    return(erreur);
  }

  public void afficheDate(){
    //Affiche la date au format JJ/MM/AAAA
    System.out.println(this.jour+"/"+this.mois+"/"+this.annee);
  }
}
