package cn.xf.pattern._04_builder_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:46 2019/10/8
 * @description :数据条目类
 */
public interface Item {

    public String name();

    public Packing pack();

    public float price();
}
