package kz.marlen;

public class SingleThread {
    static final int size = 10000000;
    float[] arr = new float[size];

    public void process() {
        for (int i = 0; i < size; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Время выполнения SingleThread: " + (endTime - startTime) + " ms");
    }
}
