package noodlesFactoryImpl;

import noodies.INoodles;
import noodies.PaoNoodles;

public class PaoFactory extends NoodlesFactory {
    @Override
    public INoodles create() {
        return new PaoNoodles();
    }
}
