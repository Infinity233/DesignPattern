import noodies.GankouNoodles;
import noodies.INoodles;
import noodies.LzNoodles;
import noodies.PaoNoodles;

// 多方法 模仿Executor
public class MulWayNoodlesFactory {

    public static INoodles createPm() {
        return new PaoNoodles();
    }

    public static INoodles createLz() {
        return new LzNoodles();
    }

    public static INoodles createGk() {
        return new GankouNoodles();
    }

    public static void main(String[] args) {
        INoodles lz2 = MulWayNoodlesFactory.createLz();
        lz2.desc();

        INoodles gk2 = MulWayNoodlesFactory.createGk();
        gk2.desc();
    }
}
