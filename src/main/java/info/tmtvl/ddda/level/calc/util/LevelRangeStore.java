package info.tmtvl.ddda.level.calc.util;

import info.tmtvl.ddda.level.calc.entities.LevelRange;
import info.tmtvl.ddda.level.calc.util.impl.AdvancedVocationStore;
import info.tmtvl.ddda.level.calc.util.impl.BasicVocationStore;
import info.tmtvl.ddda.level.calc.util.impl.EpicVocationStore;

/**
 * @author tmtvl
 */
public class LevelRangeStore {
    private static final LevelRange BASIC_LEVEL_RANGE, ADVANCED_LEVEL_RANGE,
            EPIC_LEVEL_RANGE;
    
    private static final int BASIC_LEVELS = 10 - 1;
    private static final int ADVANCED_LEVELS = 100 - 10;
    private static final int EPIC_LEVELS = 200 - 100;
    
    static {
        BASIC_LEVEL_RANGE = createBasicLevelRange();
        ADVANCED_LEVEL_RANGE = createAdvancedLevelRange();
        EPIC_LEVEL_RANGE = createEpicLevelRange();
    }
    
    private static LevelRange createBasicLevelRange () {
        VocationStore vocationStore = BasicVocationStore.getInstance();
        
        LevelRange levelRange = new LevelRange(vocationStore.getVocationCount(),
                BASIC_LEVELS);
        
        vocationStore.getAllVocations().forEach((vocation) -> {
            levelRange.addLevels(vocation, 0);
        });
        
        return levelRange;
    }
    
    private static LevelRange createAdvancedLevelRange () {
        VocationStore vocationStore = AdvancedVocationStore.getInstance();
        
        LevelRange levelRange = new LevelRange(vocationStore.getVocationCount(),
                ADVANCED_LEVELS);
        
        vocationStore.getAllVocations().forEach((vocation) -> {
            levelRange.addLevels(vocation, 0);
        });
        
        return levelRange;
    }
    
    private static LevelRange createEpicLevelRange () {
        VocationStore vocationStore = EpicVocationStore.getInstance();
        
        LevelRange levelRange = new LevelRange(vocationStore.getVocationCount(),
                EPIC_LEVELS);
        
        vocationStore.getAllVocations().forEach((vocation) -> {
            levelRange.addLevels(vocation, 0);
        });
        
        return levelRange;
    }
    
    public static LevelRange getBASIC_LEVEL_RANGE () {
        return BASIC_LEVEL_RANGE;
    }
    
    public static LevelRange getADVANCED_LEVEL_RANGE () {
        return ADVANCED_LEVEL_RANGE;
    }
    
    public static LevelRange getEPIC_LEVEL_RANGE () {
        return EPIC_LEVEL_RANGE;
    }
}
