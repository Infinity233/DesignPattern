package abstractFactory;

import drinks.ColaDrinks;
import drinks.IDrinks;
import noodies.INoodles;
import noodies.PaoNoodles;

public class KFCFoodFactory extends AbstractFoodFactory{

    @Override
    public INoodles createNoodles() {
        return new PaoNoodles();
    }

    @Override
    public IDrinks createDrinks() {
        return new ColaDrinks();
    }
}
