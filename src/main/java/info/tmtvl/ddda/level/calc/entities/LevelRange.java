package info.tmtvl.ddda.level.calc.entities;

import java.util.Arrays;

/**
 * @author tmtvl
 */
public class LevelRange {
    private class VocationLevelCount {
        private Vocation vocation;
        private int levelCount;
        
        public VocationLevelCount (Vocation vocation, int levelCount) {
            this.vocation = vocation;
            this.levelCount = levelCount;
        }
        
        public Vocation getVocation () {
            return vocation;
        }
        
        public void setVocation (Vocation vocation) {
            this.vocation = vocation;
        }
        
        public int getLevelCount () {
            return levelCount;
        }
        
        public void setLevelCount (int levelCount) {
            this.levelCount = levelCount;
        }
        
        public String getName () {
            return vocation.getName();
        }
        
        public int getHp () {
            return vocation.getHp() * levelCount;
        }
        
        public int getStamina () {
            return vocation.getStamina() * levelCount;
        }
        
        public int getAttack () {
            return vocation.getAttack() * levelCount;
        }
        
        public int getDefence () {
            return vocation.getDefence() * levelCount;
        }
        
        public int getMagickAttack () {
            return vocation.getMagickAttack() * levelCount;
        }
        
        public int getMagickDefence () {
            return vocation.getMagickDefence() * levelCount;
        }
        
        public void addLevels (int levels) {
            levelCount += levels;
        }
        
        public void removeLevels (int levels) {
            levelCount -= levels;
        }
        
        @Override
        public String toString () {
            StringBuilder stb = new StringBuilder();
            
            stb.append(levelCount).append(": ");
            
            if (levelCount < 10) {
                stb.append(" ");
            }
            if (levelCount < 100) {
                stb.append(" ");
            }
            
            stb.append(getName());
            
            return stb.toString();
        }
    }
    
    private final VocationLevelCount[] vocationLevelCount;
    
    private int levelRange;
    
    public LevelRange (int vocationCount, int levelRange) {
        vocationLevelCount = new VocationLevelCount[vocationCount];
        this.levelRange = levelRange;
    }
    
    @SuppressWarnings("NonPublicExported")
    public VocationLevelCount[] getVocationLevelCount () {
        return Arrays.copyOf(vocationLevelCount, vocationLevelCount.length);
    }
    
    public int getLevelRange () {
        return levelRange;
    }
    
    public void setLevelRange (int levelRange) {
        this.levelRange = levelRange;
    }
    
    public boolean addLevels (Vocation vocation, int levels) {
        if (levels > levelRange) {
            return false;
        }
        
        boolean added = false;
        int emptyPosition = -1;
        
        for (int counter = 0; counter < vocationLevelCount.length; counter++) {
            if (vocationLevelCount[counter] != null) {
                if (vocationLevelCount[counter].vocation.equals(vocation)) {
                    vocationLevelCount[counter].addLevels(levels);
                    added = true;
                }
            }
            else if (emptyPosition == -1) {
                emptyPosition = counter;
            }
        }
        
        if (!added && emptyPosition != -1) {
            vocationLevelCount[emptyPosition] = new VocationLevelCount(vocation,
                    levels);
            added = true;
        }
        
        if (added) {
            levelRange -= levels;
        }
        
        return added;
    }
    
    public boolean removeLevels (Vocation vocation, int levels) {
        boolean removed = false;
        
        for (VocationLevelCount vlc : vocationLevelCount) {
            if (vlc != null && vlc.getVocation().equals(vocation) 
                    && vlc.getLevelCount() >= levels) {
                vlc.removeLevels(levels);
                removed = true;
            }
        }
        
        if (removed) {
            levelRange += levels;
        }
        
        return removed;
    }
    
    public int getHp () {
        int hp = 0;
        
        for (VocationLevelCount vlc : vocationLevelCount) {
            if (vlc != null) {
                hp += vlc.getHp();
            }
        }
        
        return hp;
    }
    
    public int getStamina () {
        int stamina = 0;
        
        for (VocationLevelCount vlc : vocationLevelCount) {
            if (vlc != null) {
                stamina += vlc.getStamina();
            }
        }
        
        return stamina;
    }
    
    public int getAttack () {
        int attack = 0;
        
        for (VocationLevelCount vlc : vocationLevelCount) {
            if (vlc != null) {
                attack += vlc.getAttack();
            }
        }
        
        return attack;
    }
    
    public int getDefence () {
        int defence = 0;
        
        for (VocationLevelCount vlc : vocationLevelCount) {
            if (vlc != null) {
                defence += vlc.getDefence();
            }
        }
        
        return defence;
    }
    
    public int getMagickAttack () {
        int magickAttack = 0;
        
        for (VocationLevelCount vlc : vocationLevelCount) {
            if (vlc != null) {
                magickAttack += vlc.getMagickAttack();
            }
        }
        
        return magickAttack;
    }
    
    public int getMagickDefence () {
        int magickDefence = 0;
        
        for (VocationLevelCount vlc : vocationLevelCount) {
            if (vlc != null) {
                magickDefence += vlc.getMagickDefence();
            }
        }
        
        return magickDefence;
    }
    
    @Override
    public String toString () {
        StringBuilder stb = new StringBuilder();
        
        boolean subsequent = false;
        
        for (VocationLevelCount vlc : vocationLevelCount) {
            if (vlc != null && vlc.getLevelCount() > 0) {
                if (subsequent) {
                    stb.append('\n');
                }
                
                stb.append(vlc.toString());
                
                subsequent = true;
            }
        }
        
        return stb.toString();
    }
}
