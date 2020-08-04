import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DockerDemo {
    public static void main(String args[]) {
        int i=0;
        while ( i<11){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println("Hello World, current time is :" + dtf.format(now));
            try{Thread.sleep(3000);}
            catch (InterruptedException e){}
            i++;
        }
    }
}
