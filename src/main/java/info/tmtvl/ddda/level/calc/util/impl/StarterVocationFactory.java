package info.tmtvl.ddda.calc.util.impl;

import info.tmtvl.ddda.calc.entities.Vocation;
import info.tmtvl.ddda.calc.entities.impl.StarterVocation;
import info.tmtvl.ddda.calc.util.VocationFactory;

/**
 * @author tmtvl
 */
public class StarterVocationFactory extends VocationFactory {
    @Override
    public Vocation createVocation () {
        Vocation vocation = new StarterVocation("", 0, 0, 0, 0, 0, 0);
        
        return vocation;
    }
}
