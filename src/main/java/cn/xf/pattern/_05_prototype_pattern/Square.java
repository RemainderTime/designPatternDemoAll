package cn.xf.pattern._05_prototype_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:06 2019/10/8
 * @description :Shape抽象类的Square实体类
 */
public class Square extends Shape{

    public Square(){
        type = "Square";
    }
    void draw() {
        System.out.println("Inside Square::draw() Method");
    }
}
