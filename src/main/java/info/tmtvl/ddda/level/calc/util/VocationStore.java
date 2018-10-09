package info.tmtvl.ddda.calc.util;

import info.tmtvl.ddda.calc.entities.Vocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tmtvl
 */
public abstract class VocationStore {
    public static enum VocationName {
        FIGHTER("Fighter"),
        STRIDER("Strider"),
        MAGE("Mage"),
        WARRIOR("Warrior"),
        RANGER("Ranger"),
        SORCERER("Sorcerer"),
        MYSTIC_KNIGHT("Mystic Knight"),
        ASSASSIN("Assassin"),
        MAGICK_ARCHER("Magick Archer");
        
        private final String name;
        
        private VocationName (final String name) {
            this.name = name;
        }
        
        @Override
        public String toString () {
            return name;
        }
    }
    
    private final Map<VocationName, Vocation> vocations = new HashMap<>();
    
    private VocationFactory vocationFactory;
    
    public VocationFactory getVocationFactory () {
        return vocationFactory;
    }
    
    public void setVocationFactory (VocationFactory vocationFactory) {
        this.vocationFactory = vocationFactory;
    }
    
    public void addVocation (VocationName vocationName, Vocation vocation) {
        vocations.put(vocationName, vocation);
    }
    
    public Vocation getVocation (VocationName vocationName) {
        return vocations.get(vocationName);
    }
    
    public boolean containsVocation (VocationName vocationName) {
        return vocations.containsKey(vocationName);
    }
    
    public int getVocationCount () {
        return vocations.size();
    }
    
    public List<Vocation> getAllVocations () {
        return new ArrayList<>(vocations.values());
    }
}
