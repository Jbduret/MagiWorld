package com.jb.magiworld;

public class Rodeur extends Personnage
{
    public Rodeur(int idJoueur)
    {
        super();
        basique = "Tir à l'Arc";
        special = "Concentration";
        id = idJoueur;
        System.out.print("Arf, je suis le Rodeur du Joueur " + idJoueur);
        presenterPerso();
    }

    public void sortBasique(Personnage perso)
    {
        super.sortBasique(perso);
        System.out.println( agilite + " dommages.");
        System.out.println( "Joueur " + perso.getId() + " perd " + agilite + " points de vie.");
        perso.setVie( perso.getVie() - agilite );
        if( perso.getVie() <= 0)
            System.out.println( "Joueur " + perso.getId() + " est mort.");
    }

    public void sortSpecial(Personnage perso)
    {
        super.sortSpecial(perso);
        System.out.println( " et gagne " + niveau/2 + " en agilité.");
        agilite += niveau/2;
    }
}
