package cn.xf.pattern._03_singleton_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:21 2019/10/8
 * @description :枚举 单例模式
 * 这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 */
public enum  _06_Singleton {
    INSTANCE;

    public void whateverMethod(){}
}
