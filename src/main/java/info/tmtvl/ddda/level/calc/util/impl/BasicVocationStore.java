package info.tmtvl.ddda.calc.util.impl;

import info.tmtvl.ddda.calc.entities.Vocation;
import info.tmtvl.ddda.calc.util.VocationFactory;
import info.tmtvl.ddda.calc.util.VocationStore;

/**
 * @author tmtvl
 */
public class BasicVocationStore extends VocationStore {
    private BasicVocationStore () {}
    
    public static VocationStore getInstance () {
        VocationStore vocationStore = new BasicVocationStore();
        
        VocationFactory vocationFactory = new BasicVocationFactory();
        vocationStore.setVocationFactory(vocationFactory);
        
        Vocation fighter, strider, mage;
        
        fighter = vocationFactory.createVocation(VocationName.FIGHTER.toString(), 
                30, 20, 4, 3, 2, 2);
        strider = vocationFactory.createVocation(VocationName.STRIDER.toString(), 
                25, 25, 3, 3, 3, 2);
        mage = vocationFactory.createVocation(VocationName.MAGE.toString(), 
                22, 20, 2, 3, 4, 3);
        
        vocationStore.addVocation(VocationName.FIGHTER, fighter);
        vocationStore.addVocation(VocationName.STRIDER, strider);
        vocationStore.addVocation(VocationName.MAGE, mage);
        
        return vocationStore;
    }
}
