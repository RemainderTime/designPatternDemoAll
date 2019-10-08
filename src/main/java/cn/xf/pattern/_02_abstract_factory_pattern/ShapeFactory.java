package cn.xf.pattern._02_abstract_factory_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 10:46 2019/10/8
 * @description : 形状工厂类
 */
public class ShapeFactory extends AbstractFactory {
    Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;
    }

    Color getColor(String color) {
        return null;
    }
}
