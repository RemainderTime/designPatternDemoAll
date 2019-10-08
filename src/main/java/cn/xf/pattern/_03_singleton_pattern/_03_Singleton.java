package cn.xf.pattern._03_singleton_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:06 2019/10/8
 * @description :饿汉式单例模式
 *
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */
public class _03_Singleton {
    private static _03_Singleton instance = new _03_Singleton();

    private _03_Singleton(){};

    public static _03_Singleton getInstance(){
        return instance;
    }

}
