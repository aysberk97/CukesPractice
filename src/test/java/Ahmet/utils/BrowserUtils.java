package Ahmet.utils;

public class BrowserUtils extends Driver{
    public static void wait(int second){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
