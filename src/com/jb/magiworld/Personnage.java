package com.jb.magiworld;

import java.util.Scanner;

public class Personnage
{
    protected
        int id;

        int niveau;
        int vie;
        int force;
        int agilite;
        int intelligence;

    public Personnage()
    {
        do
        {
            setNiveau();
            setForce();
            setAgilite();
            setIntelligence();
            if( niveau != (force + agilite + intelligence) )
                System.out.println("Attention ! Niveau = Force + Agilité + Intelligence ... Veuillez recommencer !");
        }
        while(niveau != (force + agilite + intelligence));
        this.vie = 5*niveau;
    }

    protected void presenterPerso()
    {
        System.out.print(" niveau " + this.niveau);
        System.out.print(". Je possède "  + this.vie + " de vitalité, " );
        System.out.print(this.force + " de force, ");
        System.out.print(this.agilite + " d'agilité et ");
        System.out.print(this.intelligence + " d'intelligence !\n\n");
    }

    public void attaqueBasiqueOuSpeciale(Personnage perso)
    {
        Scanner sc = new Scanner(System.in);

        int action;
        do
        {
            System.out.println("Joueur " + id + " (" + perso1.getVie() + " Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            action = sc.nextInt();
            if (action == 1 || action == 2)
            {
                System.out.println("Joueur " + id + " utilise ");
                if( action == 1)
                    attaqueBasique(perso);
                else
                    attaqueSpeciale(perso);
            }
            else
                System.out.println("\"Attention ! Action = Basique (1) ou Action = Speciale (2) ... Veuillez recommencer !\"");
        }
        while( (action != 1 || action != 2));
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getVie()
    {
        return vie;
    }

    public int getNiveau()
    {
        return niveau;
    }

    public void setNiveau()
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Niveau du personnage ?");
            niveau = sc.nextInt();
            if (niveau < 0 || niveau > 100)
                System.out.println("Niveau invalide ... Veuillez choisir un niveau entre 0 et 100");
        }
        while( niveau < 0 || niveau > 100 );
    }

    public int getForce()
    {
        return force;
    }

    public void setForce()
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Force du personnage ? (" + niveau + " points disponibles)");
            force = sc.nextInt();
            if (force < 0 || force > niveau)
                System.out.println("Force invalide ... Veuillez choisir une force entre 0 et " + niveau);
        }
        while( force < 0 || force > niveau );
    }

    public int getAgilite()
    {
        return agilite;
    }

    public void setAgilite()
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Agilité du personnage ? (" + (niveau - force) + " points disponibles)");
            agilite = sc.nextInt();
            if (agilite < 0 || agilite > (niveau - force))
                System.out.println("Agilité invalide ... Veuillez choisir une agilité entre 0 et " + (niveau - force));
        }
        while(agilite < 0 || agilite > (niveau - force));
    }

    public int getIntelligence()
    {
        return intelligence;
    }

    public void setIntelligence()
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Intelligence du personnage ? (" + (niveau - force - agilite) + " points disponibles)");
            intelligence = sc.nextInt();
            if (intelligence < 0 || intelligence > 100)
                System.out.println("Intelligence invalide ... Veuillez choisir une intelligence entre 0 et " + (niveau - force - agilite));
        }
        while( intelligence < 0 || intelligence > (niveau - force - agilite) );
    }
}
