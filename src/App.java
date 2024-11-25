import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        List <Stagiaire> Stagiaire = new ArrayList<>();
        // Stagiaire.add(new Stagiaire("Monybe","Lina"));
        // Stagiaire.add(new Stagiaire("Abbahoum","Meriem"));
        // Stagiaire.add(new Stagiaire("Bouzid","Alaa"));
         
        // for(Stagiaire x:Stagiaire){
        //     System.out.println(x);
        // }

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a length");
        int len=scan.nextInt();
        scan.nextLine();

        for(int i=0; i< len;i++){
        System.out.println("Enter a full name for person "+(i+1)+":");
        String lname=scan.nextLine();
        String fname=scan.nextLine();
        Stagiaire.add(new Stagiaire(lname,fname));
    }System.out.println("\n*****************\n");
    System.out.println("Here is the informations");
    for(Stagiaire x:Stagiaire){
        System.out.println(x);
    }


     Stagiaire.sort(null);


    System.out.println("\n*****************\n");
    System.out.println("Here is the informations after sort");
    for(Stagiaire x:Stagiaire){
        System.out.println(x);
    }



    }
}
