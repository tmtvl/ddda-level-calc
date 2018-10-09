package info.tmtvl.ddda.calc.util.impl;

import info.tmtvl.ddda.calc.entities.Vocation;
import info.tmtvl.ddda.calc.entities.impl.BasicVocation;
import info.tmtvl.ddda.calc.util.VocationFactory;

/**
 * @author tmtvl
 */
public class BasicVocationFactory extends VocationFactory {
    @Override
    public Vocation createVocation () {
        Vocation vocation = new BasicVocation("", 0, 0, 0, 0, 0, 0);
        
        return vocation;
    }
}
