package info.tmtvl.ddda.calc.entities.impl;

import info.tmtvl.ddda.calc.entities.Vocation;

/**
 * @author tmtvl
 */
public class EpicVocation extends Vocation {
    public EpicVocation () {}
    
    public EpicVocation (String name, int hp, int stamina, int attack,
            int defence, int magickAttack, int magickDefence) {
        super(name, hp, stamina, attack, defence, magickAttack, magickDefence);
    }
    
    public EpicVocation (long id, String name, int hp, int stamina, int attack,
            int defence, int magickAttack, int magickDefence) {
        super(id, name, hp, stamina, attack, defence, magickAttack,
                magickDefence);
    }
}
