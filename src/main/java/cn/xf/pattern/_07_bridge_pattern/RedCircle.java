package cn.xf.pattern._07_bridge_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:47 2019/10/8
 * @description :RedCircle实现类
 */
public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }

}
