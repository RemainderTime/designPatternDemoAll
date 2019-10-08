package cn.xf.pattern._04_builder_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:52 2019/10/8
 * @description :Burger抽象接口类
 */
public abstract class Burger implements Item{

    public Packing pack() {
        return new WrapperPacking();
    }

    public abstract float price();
}
