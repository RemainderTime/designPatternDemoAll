package cn.xf.pattern._04_builder_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:57 2019/10/8
 * @description :vegBurger 类
 */
public class VegBurger extends Burger {
    public String name() {
        return "VegBurger";
    }

    public float price() {
        return 3.5f;
    }
}
