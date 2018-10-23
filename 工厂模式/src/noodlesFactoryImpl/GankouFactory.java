package noodlesFactoryImpl;

import noodies.GankouNoodles;
import noodies.INoodles;

public class GankouFactory extends NoodlesFactory {
    @Override
    public INoodles create() {
        return new GankouNoodles();
    }
}
