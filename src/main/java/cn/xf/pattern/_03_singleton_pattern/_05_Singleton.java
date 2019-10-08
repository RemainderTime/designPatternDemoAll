package cn.xf.pattern._03_singleton_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:15 2019/10/8
 * @description :静态内部类 单例模式
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。
 * 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 */
public class _05_Singleton {

    private static class SingletonHolder{
        private static final _05_Singleton INSTANCE = new _05_Singleton();
    }
    private _05_Singleton(){};

    private static final  _05_Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
