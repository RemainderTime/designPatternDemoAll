package cn.xf.pattern._07_bridge_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:56 2019/10/8
 * @description :Shape类的继承类Circle
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
