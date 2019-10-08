package cn.xf.pattern._01_factory_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:01 2019/9/30
 * @description : animal工厂类
 *
 */
public class AnimalFactory {

    Animal animal = null;

    public Animal getCall(String type) {

        if (type.equalsIgnoreCase("dog")) {
            animal = new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            animal = new Cat();
        } else if (type.equalsIgnoreCase("pig")) {
            animal = new Pig();
        }
        return animal;
    }

}
