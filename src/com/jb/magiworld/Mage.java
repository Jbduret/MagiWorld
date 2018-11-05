package com.jb.magiworld;

public class Mage extends Personnage
{
    private int vie_max;

    public Mage(int idJoueur)
    {
        super();
        basique = "Boule de Feu";
        special = "Soin";
        id = idJoueur;
        System.out.print("Abracadabra, je suis le Mage du Joueur " + idJoueur);
        presenterPerso();
        vie_max = vie;
    }

    public void sortBasique(Personnage perso)
    {
        super.sortBasique(perso);
        System.out.println( intelligence + " dommages.");
        System.out.println( "Joueur " + perso.getId() + " perd " + intelligence + " points de vie.");
        perso.setVie( perso.getVie() - intelligence );
        if( perso.getVie() <= 0)
            System.out.println( "Joueur " + perso.getId() + " est mort.");
    }

    public void sortSpecial(Personnage perso)
    {
        super.sortSpecial(perso);
        System.out.println( " et gagne " + 2*intelligence + " en vitalité.");
        vie += 2*intelligence;
        if( vie > vie_max)
            this.vie = vie_max;
    }
}
