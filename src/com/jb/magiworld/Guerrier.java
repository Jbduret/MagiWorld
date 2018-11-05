package com.jb.magiworld;

public class Guerrier extends Personnage
{
    public Guerrier(int idJoueur)
    {
        super();
        System.out.print("Woarg, je suis le Guerrier du Joueur " + idJoueur);
        presenterPerso();
    }

    public void utiliserSortBasique(int idJoueur)
    {
        int action = this.basiqueOuSpeciale(idJoueur);
        if(action == 1)
        {
            System.out.printl
        }
        else
        {

        }
    }
}
