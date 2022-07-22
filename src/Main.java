public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{1, 2, 3, 4, 5});
        System.out.println("max: " + salesManager.max());
    }
}
