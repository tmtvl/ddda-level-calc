package info.tmtvl.ddda.calc.util.impl;

import info.tmtvl.ddda.calc.entities.Vocation;
import info.tmtvl.ddda.calc.util.VocationFactory;
import info.tmtvl.ddda.calc.util.VocationStore;

/**
 * @author tmtvl
 */
public class StarterVocationStore extends VocationStore {
    private StarterVocationStore () {}
    
    public static VocationStore getInstance () {
        VocationStore vocationStore = new StarterVocationStore();
        
        VocationFactory vocationFactory = new StarterVocationFactory();
        vocationStore.setVocationFactory(vocationFactory);
        
        Vocation fighter, strider, mage;
        
        fighter = vocationFactory.createVocation(VocationName.FIGHTER.toString(), 
                450, 540, 80, 80, 60, 60);
        strider = vocationFactory.createVocation(VocationName.STRIDER.toString(), 
                430, 540, 70, 70, 70, 70);
        mage = vocationFactory.createVocation(VocationName.MAGE.toString(), 
                410, 540, 60, 60, 80, 80);
        
        vocationStore.addVocation(VocationName.FIGHTER, fighter);
        vocationStore.addVocation(VocationName.STRIDER, strider);
        vocationStore.addVocation(VocationName.MAGE, mage);
        
        return vocationStore;
    }
}
