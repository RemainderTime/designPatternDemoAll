package cn.xf.pattern._06_adapter_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:48 2019/10/8
 * @description :Vlc类型播放器实现类
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {

    }
}
