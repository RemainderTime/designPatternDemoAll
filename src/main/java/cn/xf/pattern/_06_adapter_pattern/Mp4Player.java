package cn.xf.pattern._06_adapter_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:49 2019/10/8
 * @description :mp4媒体播放器实现类
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
