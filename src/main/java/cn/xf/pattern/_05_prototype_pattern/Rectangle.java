package cn.xf.pattern._05_prototype_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:02 2019/10/8
 * @description :Shape抽象类的Rectangle实体类
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }
    void draw() {
        System.out.println("Inside Rectangle::draw() Method.");
    }
}
