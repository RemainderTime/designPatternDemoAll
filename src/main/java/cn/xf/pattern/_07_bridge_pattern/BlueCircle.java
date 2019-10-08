package cn.xf.pattern._07_bridge_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:48 2019/10/8
 * @description :BlueCircle实现类
 */
public class BlueCircle implements DrawAPI{
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: blue, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
