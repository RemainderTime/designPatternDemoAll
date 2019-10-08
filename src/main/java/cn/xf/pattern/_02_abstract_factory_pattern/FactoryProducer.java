package cn.xf.pattern._02_abstract_factory_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 10:58 2019/10/8
 * @description :工厂生产类
 */
public class FactoryProducer {

    static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }else if (factory.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    }
}
