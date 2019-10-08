package cn.xf.pattern._06_adapter_pattern;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:58 2019/10/8
 * @description :
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
