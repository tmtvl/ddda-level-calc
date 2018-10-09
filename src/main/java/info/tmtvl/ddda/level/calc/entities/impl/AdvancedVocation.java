package info.tmtvl.ddda.level.calc.entities.impl;

import info.tmtvl.ddda.level.calc.entities.Vocation;

/**
 * @author tmtvl
 */
public class AdvancedVocation extends Vocation {
    protected AdvancedVocation () {}
    
    public AdvancedVocation (String name, int hp, int stamina, int attack,
            int defence, int magickAttack, int magickDefence) {
        super(name, hp, stamina, attack, defence, magickAttack, magickDefence);
    }
    
    public AdvancedVocation (long id, String name, int hp, int stamina,
            int attack, int defence, int magickAttack, int magickDefence) {
        super(id, name, hp, stamina, attack, defence, magickAttack,
                magickDefence);
    }
}
