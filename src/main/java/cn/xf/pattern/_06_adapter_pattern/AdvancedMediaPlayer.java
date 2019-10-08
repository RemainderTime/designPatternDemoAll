package cn.xf.pattern._06_adapter_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:46 2019/10/8
 * @description :高级媒体播放器接口
 */
public interface AdvancedMediaPlayer {

    public void playVlc(String fileName);
    public void playMp4(String fileName);

}
