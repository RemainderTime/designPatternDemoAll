package cn.xf.pattern._07_bridge_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:50 2019/10/8
 * @description :Shape抽象类
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }

    public abstract void draw();

}
