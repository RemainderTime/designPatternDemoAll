package cn.xf.pattern._05_prototype_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:58 2019/10/8
 * @description :实现了Cloneable的抽象类
 */
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
