package cn.xf.pattern._02_abstract_factory_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 10:44 2019/10/8
 * @description : 公共抽象工厂类
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shape);

    abstract Color getColor(String color);
}
