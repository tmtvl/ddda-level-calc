package info.tmtvl.ddda.level.calc;

import info.tmtvl.ddda.level.calc.util.VocationStore;

/**
 * @author tmtvl
 */
public class Main {
    public static void main(String[] argv) {
        StatisticsCalculator calc = new StatisticsCalculator();
        
        calc.setStarterVocation(VocationStore.VocationName.FIGHTER);
        
        calc.addBasicVocationLevels(VocationStore.VocationName.MAGE, 9);
        
        calc.addAdvancedVocationLevels(VocationStore.VocationName.SORCERER, 90);
        
        calc.addEpicVocationLevels(VocationStore.VocationName.SORCERER, 5);
        calc.addEpicVocationLevels(VocationStore.VocationName.ASSASSIN, 95);
        
        System.out.println(calc.toString());
    }
}
