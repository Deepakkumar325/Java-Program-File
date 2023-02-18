import javax.sound.sampled.SourceDataLine;

public class Deletefirstandlastchar {
    public static void main(String[] args) {
        
        String str = "hello World";
        str = str.substring(1,str.length()-1);
        System.out.println(str);
    }
      
}
