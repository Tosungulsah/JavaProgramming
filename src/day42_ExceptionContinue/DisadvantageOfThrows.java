package day42_ExceptionContinue;

public class DisadvantageOfThrows {
    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long)(seconds*1000));
    }
}
