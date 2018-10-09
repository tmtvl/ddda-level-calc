package info.tmtvl.ddda.level.calc.util.impl;

import info.tmtvl.ddda.level.calc.entities.Vocation;
import info.tmtvl.ddda.level.calc.entities.impl.AdvancedVocation;
import info.tmtvl.ddda.level.calc.util.VocationFactory;

/**
 * @author tmtvl
 */
public class AdvancedVocationFactory extends VocationFactory {
    @Override
    public Vocation createVocation () {
        Vocation vocation = new AdvancedVocation("", 0, 0, 0, 0, 0, 0);
        
        return vocation;
    }
}
