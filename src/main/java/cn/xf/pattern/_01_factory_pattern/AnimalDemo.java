package cn.xf.pattern._01_factory_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:09 2019/9/30
 * @description : 工厂模式
 *  优点：
 *  1、一个调用者想创建一个对象，只要知道其名称就可以了。
 *  2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 *  3、屏蔽产品的具体实现，调用者只关心产品的接口。
 *
 *  缺点：
 *  每次增加一个产品时，都需要增加一个具体类和对象实现工厂，
 *  使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，
 *  同时也增加了系统具体类的依赖。这并不是什么好事。
 */
public class AnimalDemo {

    public static void main(String[] args) {
        AnimalFactory animalFactory=new AnimalFactory();

        Animal animal01=animalFactory.getCall("dog");
        animal01.call();

        Animal animal02=animalFactory.getCall("cat");
        animal02.call();

        Animal animal03 = animal03=animalFactory.getCall("pig");
        animal03.call();
    }
}
