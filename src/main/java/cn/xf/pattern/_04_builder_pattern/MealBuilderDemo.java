package cn.xf.pattern._04_builder_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:16 2019/10/8
 * @description :创造者模式（创建型模式）
 *
 * 优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
 * 缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
 */
public class MealBuilderDemo {

    public static void main(String[] args) {

        Meal vegMeal = MealBuilder.prepareVegBurger();
        System.out.println("Veg:");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getTotal());

        Meal noneMeal = MealBuilder.prepareNoneBurger();
        System.out.println("\n\nNone:");
        noneMeal.showItems();
        System.out.println("Total Cost: " +noneMeal.getTotal());
    }
}
