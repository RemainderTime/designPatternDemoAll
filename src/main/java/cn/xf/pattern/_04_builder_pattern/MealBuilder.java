package cn.xf.pattern._04_builder_pattern;

import com.sun.deploy.ui.DialogTemplate;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:12 2019/10/8
 * @description : 套餐创建类
 */
public class MealBuilder {

    public static Meal prepareVegBurger(){
        Meal meal =new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new CocaColdDrink());

        return meal;
    }

    public static Meal prepareNoneBurger(){
        Meal meal =new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new PepsiColdDrink());

        return meal;
    }
}
