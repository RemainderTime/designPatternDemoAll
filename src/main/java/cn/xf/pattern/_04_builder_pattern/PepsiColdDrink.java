package cn.xf.pattern._04_builder_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:02 2019/10/8
 * @description :PepsiColdDrink 类
 */
public class PepsiColdDrink extends ColdDrink {
    public String name() {
        return "Pepsi ColdDrink";
    }

    public float price() {
        return 2.3f;
    }
}
