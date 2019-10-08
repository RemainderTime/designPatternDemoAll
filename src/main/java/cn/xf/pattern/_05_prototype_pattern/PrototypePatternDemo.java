package cn.xf.pattern._05_prototype_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:19 2019/10/8
 * @description :原型模式（创建型模式）
 * 优点：
 * 1、性能提高。
 * 2、逃避构造函数的约束。
 *
 * 缺点：
 * 1、配备克隆方法需要对类的功能进行通盘考虑，
 * 这对于全新的类不是很难，但对于已有的类不一定很容易，
 * 特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
 * 2、必须实现 Cloneable 接口。
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape=ShapeCache.getShape("1");
        System.out.println("Shape:"+shape.getType());

        Shape shape2=ShapeCache.getShape("2");
        System.out.println("Shape:"+shape2.getType());

        Shape shape3=ShapeCache.getShape("3");
        System.out.println("Shape:"+shape3.getType());
    }
}
