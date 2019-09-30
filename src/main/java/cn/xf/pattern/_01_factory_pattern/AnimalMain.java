package cn.xf.pattern._01_factory_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:09 2019/9/30
 * @description : 工厂模式
 */
public class AnimalMain {

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
