package info.tmtvl.ddda.calc.util.impl;

import info.tmtvl.ddda.calc.entities.Vocation;
import info.tmtvl.ddda.calc.util.VocationFactory;
import info.tmtvl.ddda.calc.util.VocationStore;

/**
 * @author tmtvl
 */
public class AdvancedVocationStore extends VocationStore {
    private AdvancedVocationStore () {}
    
    public static VocationStore getInstance () {
        VocationStore vocationStore = new AdvancedVocationStore();
        
        VocationFactory vocationFactory = new AdvancedVocationFactory();
        vocationStore.setVocationFactory(vocationFactory);
        
        Vocation fighter, strider, mage, warrior, ranger, sorcerer, mysticKnight, 
                assassin, magickArcher;
        
        fighter = vocationFactory.createVocation(VocationName.FIGHTER.toString(), 
                37, 15, 4, 4, 2, 1);
        strider = vocationFactory.createVocation(VocationName.STRIDER.toString(), 
                25, 25, 3, 3, 3, 2);
        mage = vocationFactory.createVocation(VocationName.MAGE.toString(), 
                21, 10, 2, 1, 4, 4);
        warrior = vocationFactory.createVocation(VocationName.WARRIOR.toString(), 
                40, 10, 5, 3, 2, 1);
        ranger = vocationFactory.createVocation(VocationName.RANGER.toString(), 
                21, 30, 4, 2, 3, 2);
        sorcerer = vocationFactory.createVocation(VocationName.SORCERER.toString(), 
                16, 15, 2, 1, 5, 5);
        mysticKnight = vocationFactory.createVocation(VocationName.MYSTIC_KNIGHT.toString(), 
                30, 20, 2, 3, 3, 3);
        assassin = vocationFactory.createVocation(VocationName.ASSASSIN.toString(), 
                22, 27, 6, 2, 2, 1);
        magickArcher = vocationFactory.createVocation(VocationName.MAGICK_ARCHER.toString(), 
                21, 20, 2, 3, 3, 4);
        
        vocationStore.addVocation(VocationName.FIGHTER, fighter);
        vocationStore.addVocation(VocationName.STRIDER, strider);
        vocationStore.addVocation(VocationName.MAGE, mage);
        vocationStore.addVocation(VocationName.WARRIOR, warrior);
        vocationStore.addVocation(VocationName.RANGER, ranger);
        vocationStore.addVocation(VocationName.SORCERER, sorcerer);
        vocationStore.addVocation(VocationName.MYSTIC_KNIGHT, mysticKnight);
        vocationStore.addVocation(VocationName.ASSASSIN, assassin);
        vocationStore.addVocation(VocationName.MAGICK_ARCHER, magickArcher);
        
        return vocationStore;
    }
}
