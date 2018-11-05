package com.jb.magiworld;

public class Guerrier extends Personnage
{
    public Guerrier(int idJoueur)
    {
        super();
        basique = "Coup d'Epée";
        special = "Coup de Rage";
        id = idJoueur;
        System.out.print("Woarg, je suis le Guerrier du Joueur " + idJoueur);
        presenterPerso();
    }

    public void sortBasique(Personnage perso)
    {
        super.sortBasique(perso);
        System.out.println( force + " dommages.");
        System.out.println( "Joueur " + perso.getId() + " perd " + force + " points de vie.");
        perso.setVie( perso.getVie() - force );
        if( perso.getVie() <= 0)
            System.out.println( "Joueur " + perso.getId() + " est mort.");
    }

    public void sortSpecial(Personnage perso)
    {
        super.sortSpecial(perso);
        System.out.println(" et inflige " + 2*force + " dommages.");
        System.out.println( "Joueur " + perso.getId() + " perd " + 2*force + " points de vie.");
        System.out.println( "Joueur " + id + " perd 5 points de vie.");
        perso.setVie( perso.getVie() - 2*force );
        if( perso.getVie() <= 0)
            System.out.println( "Joueur " + perso.getId() + " est mort.");
        vie -= 5;
        if( vie <= 0)
            System.out.println( "Joueur " + id + " est mort.");
    }
}
