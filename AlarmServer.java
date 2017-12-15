import java.io.FileInputStream;
import java.io.PrintStream;


public class AlarmServer extends Thread
{
  public static void main(String[] args) throws Exception
  {
    AlarmServer thread1 = new AlarmServer();
    thread1.start();
  }
}
