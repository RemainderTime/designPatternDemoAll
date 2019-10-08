package cn.xf.pattern._06_adapter_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:04 2019/10/8
 * @description :适配器模式（结果型模式）
 *
 * 优点：
 * 1、可以让任何两个没有关联的类一起运行。
 * 2、提高了类的复用。
 * 3、增加了类的透明度。
 * 4、灵活性好。
 *
 * 缺点：
 * 1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。
 * 比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，
 * 一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，
 * 可以不使用适配器，而是直接对系统进行重构。
 * 2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","dd.mp3");
        audioPlayer.play("mp4","ff.mp4");
        audioPlayer.play("vlc","55.vlc");
        audioPlayer.play("avi","ac.avi");
    }
}
