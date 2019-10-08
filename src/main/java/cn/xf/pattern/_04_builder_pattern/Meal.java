package cn.xf.pattern._04_builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:04 2019/10/8
 * @description :套餐类
 */
public class Meal {

    List<Item> items =new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getTotal(){
        float total = 0f;
        for(Item item:items){
            total += item.price();
        }
        return total;
    }

    public void showItems(){
        for(Item item:items){
            System.out.print("Item:"+item.name());
            System.out.print(",Packing:"+item.pack().pack());
            System.out.println(",Price:"+item.price());
        }
    }
}
