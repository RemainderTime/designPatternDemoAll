package cn.xf.pattern._02_abstract_factory_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 10:52 2019/10/8
 * @description :颜色工厂类
 */
public class ColorFactory extends AbstractFactory {
    Shape getShape(String shape) {
        return null;
    }

    Color getColor(String color) {
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }else if (color.equalsIgnoreCase("yellow")){
            return new Yellow();
        }else  if (color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }
}
