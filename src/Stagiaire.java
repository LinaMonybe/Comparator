import java.lang.Comparable;
public class Stagiaire implements Comparable<Stagiaire>{

    String nom;
    String prenom;

    public Stagiaire(String a,String b){
        this.nom=a;
        this.prenom=b;
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }

    @Override
    public String toString(){
        return "name : " + this.nom + " prenom : "+ this.prenom;
    }

    @Override
    public int compareTo(Stagiaire x){
        if((this.getNom().compareTo(x.getNom()))==0)
            return (this.getPrenom().compareTo(x.getPrenom()));
        return (this.getNom().compareTo(x.getNom()));
    }
    
}
