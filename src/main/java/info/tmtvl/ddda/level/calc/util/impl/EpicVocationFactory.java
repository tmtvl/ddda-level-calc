package info.tmtvl.ddda.calc.util.impl;

import info.tmtvl.ddda.calc.entities.Vocation;
import info.tmtvl.ddda.calc.entities.impl.EpicVocation;
import info.tmtvl.ddda.calc.util.VocationFactory;

/**
 * @author tmtvl
 */
public class EpicVocationFactory extends VocationFactory {
    @Override
    public Vocation createVocation () {
        Vocation vocation = new EpicVocation("", 0, 0, 0, 0, 0, 0);
        
        return vocation;
    }
}
