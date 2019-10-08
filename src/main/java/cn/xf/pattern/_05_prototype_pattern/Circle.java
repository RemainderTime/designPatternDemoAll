package cn.xf.pattern._05_prototype_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:09 2019/10/8
 * @description :Shape抽象类的Circle实体类
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }
    void draw() {
        System.out.println("Inside Circle::draw() Method");
    }
}
