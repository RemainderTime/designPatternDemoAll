package cn.xf.pattern._04_builder_pattern;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:50 2019/10/8
 * @description : 包装瓶 类
 */
public class BottlePacking implements Packing {
    public String pack() {
        return "Bottle";
    }
}
