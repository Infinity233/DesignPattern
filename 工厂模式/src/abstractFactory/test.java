package abstractFactory;

public class test {

    public static void main(String[] args) {
        AbstractFoodFactory abstractFoodFactory1 = new KFCFoodFactory();
        abstractFoodFactory1.createDrinks().prices();
        abstractFoodFactory1.createNoodles().desc();

        abstractFoodFactory1= new LzlmFoodFactory();
        abstractFoodFactory1.createDrinks().prices();
        abstractFoodFactory1.createNoodles().desc();
    }
}
