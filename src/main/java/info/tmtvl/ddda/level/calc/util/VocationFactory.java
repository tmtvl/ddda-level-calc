package info.tmtvl.ddda.calc.util;

import info.tmtvl.ddda.calc.entities.Vocation;

/**
 * @author tmtvl
 */
public abstract class VocationFactory {
    public Vocation createVocation (String name) {
        Vocation vocation = createVocation();
        
        vocation.setName(name);
        
        return vocation;
    }
    
    public Vocation createVocation (int hp, int stamina, int attack, 
            int defence, int magickAttack, int magickDefence) {
        Vocation vocation = createVocation();
        
        vocation.setHp(hp);
        vocation.setStamina(stamina);
        vocation.setAttack(attack);
        vocation.setDefence(defence);
        vocation.setMagickAttack(magickAttack);
        vocation.setMagickDefence(magickDefence);
        
        return vocation;
    }
    
    public Vocation createVocation (String name, int hp, int stamina, 
            int attack, int defence, int magickAttack, int magickDefence) {
        Vocation vocation = createVocation(hp, stamina, attack, defence, 
                magickAttack, magickDefence);
        
        vocation.setName(name);
        
        return vocation;
    }
    
    public abstract Vocation createVocation ();
}
