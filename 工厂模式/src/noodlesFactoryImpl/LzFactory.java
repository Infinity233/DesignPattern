package noodlesFactoryImpl;

import noodies.INoodles;
import noodies.LzNoodles;

public class LzFactory extends NoodlesFactory {

    @Override
    public INoodles create() {
        return new LzNoodles();
    }
}
