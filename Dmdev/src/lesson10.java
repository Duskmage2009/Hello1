public class lesson10 {
    public static void main(String[] args) {
        long startTime =System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <1000; i++) {
               stringBuilder.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
    }
}
