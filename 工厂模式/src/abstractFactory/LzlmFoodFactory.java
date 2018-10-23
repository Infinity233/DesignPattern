package abstractFactory;

import drinks.IDrinks;
import drinks.WaterDrinks;
import noodies.INoodles;
import noodies.LzNoodles;

public class LzlmFoodFactory extends AbstractFoodFactory {

    @Override
    public INoodles createNoodles() {
        return new LzNoodles();
    }

    @Override
    public IDrinks createDrinks() {
        return new WaterDrinks();
    }
}
