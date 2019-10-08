package cn.xf.pattern._07_bridge_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:58 2019/10/8
 * @description :桥接模式（结构型模式）
 *
 * 优点：
 * 1、抽象和实现的分离。
 * 2、优秀的扩展能力。
 * 3、实现细节对客户透明。
 *
 * 缺点：
 * 桥接模式的引入会增加系统的理解与设计难度，
 * 由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new BlueCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
