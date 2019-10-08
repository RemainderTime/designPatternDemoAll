package cn.xf.pattern._03_singleton_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:10 2019/10/8
 * @description :双检锁 单例模式 安全且在多线程情况下能保持高性能。getInstance() 的性能对应用程序很关键。
 */
public class _04_Singleton {
    private static _04_Singleton instance = null;

    private _04_Singleton(){};

    private static _04_Singleton getInstance(){
        if(instance == null){
            synchronized (_04_Singleton.class){
                if(instance == null){
                    new _04_Singleton();
                }
            }
        }
        return instance;
    }
}
