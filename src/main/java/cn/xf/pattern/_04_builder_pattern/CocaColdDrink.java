package cn.xf.pattern._04_builder_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:01 2019/10/8
 * @description :CocaColdDrink 类
 */
public class CocaColdDrink extends ColdDrink {
    public String name() {
        return "Coca ColdDrink";
    }

    public float price() {
        return 2.5f;
    }
}
