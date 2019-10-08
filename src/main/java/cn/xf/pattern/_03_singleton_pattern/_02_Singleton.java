package cn.xf.pattern._03_singleton_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:00 2019/10/8
 * @description :懒汉式单例模式 线程安全
 *
 * 优点：
 * 第一次调用才初始化，避免内存浪费。
 *
 * 缺点：
 * 必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 *
 */
public class _02_Singleton {

    private static _02_Singleton instance =null;

    private _02_Singleton (){};

    public static synchronized _02_Singleton getInstance(){
        if(instance == null){
            new _02_Singleton();
        }
        return instance;
    }
}
