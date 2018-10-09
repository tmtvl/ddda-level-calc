package info.tmtvl.ddda.calc;

import info.tmtvl.ddda.calc.entities.LevelRange;
import info.tmtvl.ddda.calc.entities.Vocation;
import info.tmtvl.ddda.calc.entities.impl.StarterVocation;
import info.tmtvl.ddda.calc.util.LevelRangeStore;
import info.tmtvl.ddda.calc.util.VocationStore;
import info.tmtvl.ddda.calc.util.impl.AdvancedVocationStore;
import info.tmtvl.ddda.calc.util.impl.BasicVocationStore;
import info.tmtvl.ddda.calc.util.impl.EpicVocationStore;
import info.tmtvl.ddda.calc.util.impl.StarterVocationStore;

/**
 * @author tmtvl
 */
public class StatisticsCalculator {
    private Vocation starterVocation;
    
    private final LevelRange basicLevelRange =
            LevelRangeStore.getBASIC_LEVEL_RANGE();
    private final LevelRange advancedLevelRange =
            LevelRangeStore.getADVANCED_LEVEL_RANGE();
    private final LevelRange epicLevelRange =
            LevelRangeStore.getEPIC_LEVEL_RANGE();
    
    private final VocationStore starterVocationStore =
            StarterVocationStore.getInstance();
    private final VocationStore basicVocationStore =
            BasicVocationStore.getInstance();
    private final VocationStore advancedVocationStore =
            AdvancedVocationStore.getInstance();
    private final VocationStore epicVocationStore =
            EpicVocationStore.getInstance();
    
    public StatisticsCalculator () {}
    
    public StatisticsCalculator (StarterVocation starterVocation) {
        this.starterVocation = starterVocation;
    }
    
    public StatisticsCalculator (VocationStore.VocationName vocationName) {
        this.starterVocation = starterVocationStore.getVocation(vocationName);
    }
    
    public Vocation getStarterVocation () {
        return starterVocation;
    }
    
    public void setStarterVocation (StarterVocation starterVocation) {
        this.starterVocation = starterVocation;
    }
    
    public void setStarterVocation (VocationStore.VocationName vocationName) {
        this.starterVocation = starterVocationStore.getVocation(vocationName);
    }
    
    public LevelRange getBasicLevelRange () {
        return basicLevelRange;
    }
    
    public LevelRange getAdvancedLevelRange () {
        return advancedLevelRange;
    }
    
    public LevelRange getEpicLevelRange () {
        return epicLevelRange;
    }
    
    private void addVocationLevels (VocationStore.VocationName vocationName,
            LevelRange levelRange, VocationStore vocationStore, int levels) {
        if (vocationStore.containsVocation(vocationName)) {
            Vocation vocation = vocationStore.getVocation(vocationName);
            
            levelRange.addLevels(vocation, levels);
        }
    }
    
    private void removeVocationLevels (VocationStore.VocationName vocationName,
            LevelRange levelRange, VocationStore vocationStore, int levels) {
        if (vocationStore.containsVocation(vocationName)) {
            Vocation vocation = vocationStore.getVocation(vocationName);
            
            levelRange.removeLevels(vocation, levels);
        }
    }
    
    public void addBasicVocationLevels (VocationStore.VocationName vocationName,
            int levels) {
        addVocationLevels(vocationName, basicLevelRange, basicVocationStore,
                levels);
    }
    
    public void removeBasicVocationLevels (VocationStore.VocationName vocationName,
            int levels) {
        removeVocationLevels(vocationName, basicLevelRange, basicVocationStore,
                levels);
    }
    
    public void addAdvancedVocationLevels (VocationStore.VocationName vocationName,
            int levels) {
        addVocationLevels(vocationName, advancedLevelRange, advancedVocationStore,
                levels);
    }
    
    public void removeAdvancedVocationLevels (VocationStore.VocationName vocationName,
            int levels) {
        removeVocationLevels(vocationName, advancedLevelRange, advancedVocationStore,
                levels);
    }
    
    public void addEpicVocationLevels (VocationStore.VocationName vocationName,
            int levels) {
        addVocationLevels(vocationName, epicLevelRange, epicVocationStore,
                levels);
    }
    
    public void removeEpicVocationLevels (VocationStore.VocationName vocationName,
            int levels) {
        removeVocationLevels(vocationName, epicLevelRange, epicVocationStore,
                levels);
    }
    
    public int getHp () {
        int hp = 0;
        
        if (starterVocation != null) {
            hp += starterVocation.getHp();
        }
        
        hp += basicLevelRange.getHp();
        hp += advancedLevelRange.getHp();
        hp += epicLevelRange.getHp();
        
        return hp;
    }
    
    public int getStamina () {
        int stamina = 0;
        
        if (starterVocation != null) {
            stamina += starterVocation.getStamina();
        }
        
        stamina += basicLevelRange.getStamina();
        stamina += advancedLevelRange.getStamina();
        stamina += epicLevelRange.getStamina();
        
        return stamina;
    }
    
    public int getAttack () {
        int attack = 0;
        
        if (starterVocation != null) {
            attack += starterVocation.getAttack();
        }
        
        attack += basicLevelRange.getAttack();
        attack += advancedLevelRange.getAttack();
        attack += epicLevelRange.getAttack();
        
        return attack;
    }
    
    public int getDefence () {
        int defence = 0;
        
        if (starterVocation != null) {
            defence += starterVocation.getDefence();
        }
        
        defence += basicLevelRange.getDefence();
        defence += advancedLevelRange.getDefence();
        defence += epicLevelRange.getDefence();
        
        return defence;
    }
    
    public int getMagickAttack () {
        int magickAttack = 0;
        
        if (starterVocation != null) {
            magickAttack += starterVocation.getMagickAttack();
        }
        
        magickAttack += basicLevelRange.getMagickAttack();
        magickAttack += advancedLevelRange.getMagickAttack();
        magickAttack += epicLevelRange.getMagickAttack();
        
        return magickAttack;
    }
    
    public int getMagickDefence () {
        int magickDefence = 0;
        
        if (starterVocation != null) {
            magickDefence += starterVocation.getMagickDefence();
        }
        
        magickDefence += basicLevelRange.getMagickDefence();
        magickDefence += advancedLevelRange.getMagickDefence();
        magickDefence += epicLevelRange.getMagickDefence();
        
        return magickDefence;
    }
    
    @Override
    public String toString () {
        StringBuilder stb = new StringBuilder();
        
        stb.append("HP:             ").append(getHp()).append('\n');
        stb.append("Stamina:        ").append(getStamina()).append('\n');
        stb.append("Attack:         ").append(getAttack()).append('\n');
        stb.append("Defence:        ").append(getDefence()).append('\n');
        stb.append("Magick Attack:  ").append(getMagickAttack()).append('\n');
        stb.append("Magick Defence: ").append(getMagickDefence()).append('\n');
        
        if (starterVocation != null) {
            stb.append("\n1:\n").append(starterVocation.getName());
        }
        
        String levelRangeString = basicLevelRange.toString();
        
        if (levelRangeString != null && !levelRangeString.isEmpty()) {
            stb.append("\n2 - 10:\n");
            
            stb.append(levelRangeString);
        }
        
        levelRangeString = advancedLevelRange.toString();
        
        if (levelRangeString != null && !levelRangeString.isEmpty()) {
            stb.append("\n11 - 100:\n");
            
            stb.append(levelRangeString);
        }
        
        levelRangeString = epicLevelRange.toString();
        
        if (levelRangeString != null && !levelRangeString.isEmpty()) {
            stb.append("\n100 - 200:\n");
            
            stb.append(levelRangeString);
        }
        
        return stb.toString();
    }
}
