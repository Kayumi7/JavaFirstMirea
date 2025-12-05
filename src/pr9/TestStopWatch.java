package pr9;

public class TestStopWatch {
    public static void main(String[] args) {

        StopWatch sw = new StopWatch();

        sw.start();

        long sum = 0;
        for (int i = 0; i < 10_000_000; i++)
            sum += i;

        sw.stop();

        System.out.println("Результат: " + sum);
        System.out.println("Время выполнения: " + sw.getElapsedTime() + " ms");
    }
}
