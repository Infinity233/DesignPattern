import noodies.INoodles;
import noodies.LzNoodles;

public class StaticNoodlesFactory {

    public static <T extends INoodles> T createNoodles(Class<T> clz) {
        T result = null;
        try {
            result = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        INoodles lz = StaticNoodlesFactory.createNoodles(LzNoodles.class);
        lz.desc();
    }
}
