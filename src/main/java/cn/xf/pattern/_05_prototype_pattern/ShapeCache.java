package cn.xf.pattern._05_prototype_pattern;

import java.util.Hashtable;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:13 2019/10/8
 * @description :缓存类
 */
public class ShapeCache {

    private static Hashtable<String,Shape> hashtable = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape shape = hashtable.get(shapeId);

        return (Shape)shape.clone();
    }

    public static void loadCache(){
        Rectangle rectangle=new Rectangle();
        rectangle.setId("1");
        hashtable.put(rectangle.getId(),rectangle);

        Square square=new Square();
        square.setId("2");
        hashtable.put(square.getId(),square);

        Circle circle=new Circle();
        circle.setId("3");
        hashtable.put(circle.getId(),circle);
    }
}
