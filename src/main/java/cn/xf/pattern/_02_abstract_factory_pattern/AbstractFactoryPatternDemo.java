package cn.xf.pattern._02_abstract_factory_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 11:01 2019/10/8
 * @description :抽象工厂类
 *
 * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * 缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 * 使用场景： 1、QQ 换皮肤，一整套一起换。 2、生成不同操作系统的程序。
 * 注意事项：产品族难扩展，产品等级易扩展。
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape1= shapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2= shapeFactory.getShape("Square");
        shape2.draw();
        Shape shape3= shapeFactory.getShape("Circle");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color1= colorFactory.getColor("Red");
        color1.fill();
        Color color2= colorFactory.getColor("Yellow");
        color2.fill();
        Color color3= colorFactory.getColor("Blue");
        color3.fill();
    }
}
