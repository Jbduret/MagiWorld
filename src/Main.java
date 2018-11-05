import com.jb.magiworld.Guerrier;
import com.jb.magiworld.Mage;
import com.jb.magiworld.Rodeur;
import com.jb.magiworld.Personnage;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Personnage perso1 = new Personnage();
        perso1.setId(1);
        Personnage perso2 = new Personnage();
        perso2.setId(2);

        // Création du personnage du Joueur 1
        System.out.println("Creation du personnage du Joueur 1");
        int classe;
        do
        {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
            classe = sc.nextInt();
            if (classe < 1 || classe > 3)
            {
                System.out.println("Numero de classe invalide ... Veuillez recommencer");
            }
            else if(classe == 1)
            {
                perso1 = new Guerrier(1);
            }
            else if(classe == 2)
            {
                perso1 = new Rodeur(1);
            }
            else if(classe == 3)
            {
                perso1 = new Mage(1);
            }
        }
        while(classe < 1 || classe > 3);

        // Création du personnage du Joueur 2
        System.out.println("Creation du personnage du Joueur 2");
        do
        {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
            classe = sc.nextInt();
            if (classe < 1 || classe > 3)
            {
                System.out.println("Numero de classe invalide ... Veuillez recommencer");
            }
            else if(classe == 1)
            {
                perso2 = new Guerrier(2);
            }
            else if(classe == 2)
            {
                perso2 = new Rodeur(2);
            }
            else if(classe == 3)
            {
                perso2 = new Mage(2);
            }
        }
        while(classe < 1 || classe > 3);

        do
        {
            System.out.println("Joueur 1 (" + perso1.getVie() + " Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            perso1.attaqueBasiqueOuSpeciale()
            classe = sc.nextInt();
        }
        while( perso1.getVie() > 0  &&  perso2.getVie() > 0 );
    }
}
