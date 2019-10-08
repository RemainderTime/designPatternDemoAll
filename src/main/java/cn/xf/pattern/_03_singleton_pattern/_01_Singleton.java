package cn.xf.pattern._03_singleton_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 12:57 2019/10/8
 * @description :懒汉式单例模式   线程不安全
 */
public class _01_Singleton {
    private static _01_Singleton instance = null;

    private _01_Singleton(){

    }

    public static _01_Singleton getInstance(){
        if(instance == null){
            new _01_Singleton();
        }
        return instance;
    }
}
