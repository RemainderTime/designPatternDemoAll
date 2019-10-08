package cn.xf.pattern._04_builder_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:59 2019/10/8
 * @description :ChickenBurger 类
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "ChickenBurger";
    }

    public float price() {
        return 5.0f;
    }
}
