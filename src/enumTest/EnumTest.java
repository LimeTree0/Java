package enumTest;

public class EnumTest {
    public void enumRun() {
        FRUIT pear = FRUIT.APPLE;
        FRUIT pear2 = FRUIT.MANGO;
        System.out.println(pear);
        System.out.println(pear.name());
        System.out.println(pear.ordinal());
        System.out.println(pear2.ordinal());
        FRUIT[] fruits = FRUIT.values();
        System.out.println(fruits[0]);
        System.out.println(fruits[2]);
    }
}
