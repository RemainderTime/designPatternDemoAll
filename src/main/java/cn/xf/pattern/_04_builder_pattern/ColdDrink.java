package cn.xf.pattern._04_builder_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:55 2019/10/8
 * @description :ColdDrink 抽象接口类
 */
public abstract class ColdDrink implements Item{

    public Packing pack() {
        return new BottlePacking();
    }

    public abstract float price();
}
