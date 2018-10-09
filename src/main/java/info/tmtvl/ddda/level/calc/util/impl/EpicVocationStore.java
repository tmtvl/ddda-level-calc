package info.tmtvl.ddda.calc.util.impl;

import info.tmtvl.ddda.calc.entities.Vocation;
import info.tmtvl.ddda.calc.util.VocationFactory;
import info.tmtvl.ddda.calc.util.VocationStore;

/**
 * @author tmtvl
 */
public class EpicVocationStore extends VocationStore {
    private EpicVocationStore () {}
    
    public static VocationStore getInstance () {
        VocationStore vocationStore = new EpicVocationStore();
        
        VocationFactory vocationFactory = new EpicVocationFactory();
        vocationStore.setVocationFactory(vocationFactory);
        
        Vocation fighter, strider, mage, warrior, ranger, sorcerer, mysticKnight, 
                assassin, magickArcher;
        
        fighter = vocationFactory.createVocation(VocationName.FIGHTER.toString(), 
                15, 5, 1, 3, 0, 0);
        strider = vocationFactory.createVocation(VocationName.STRIDER.toString(), 
                5, 15, 1, 1, 1, 1);
        mage = vocationFactory.createVocation(VocationName.MAGE.toString(), 
                10, 10, 0, 0, 2, 2);
        warrior = vocationFactory.createVocation(VocationName.WARRIOR.toString(), 
                5, 15, 2, 2, 0, 0);
        ranger = vocationFactory.createVocation(VocationName.RANGER.toString(), 
                5, 15, 2, 1, 0, 1);
        sorcerer = vocationFactory.createVocation(VocationName.SORCERER.toString(), 
                10, 10, 0, 0, 3, 1);
        mysticKnight = vocationFactory.createVocation(VocationName.MYSTIC_KNIGHT.toString(), 
                15, 5, 1, 1, 1, 1);
        assassin = vocationFactory.createVocation(VocationName.ASSASSIN.toString(), 
                5, 15, 3, 1, 0, 0);
        magickArcher = vocationFactory.createVocation(VocationName.MAGICK_ARCHER.toString(), 
                10, 10, 1, 0, 1, 2);
        
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
