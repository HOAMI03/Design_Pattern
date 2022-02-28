public class Main {
    public static void main(String[] args) {
        HTLList h1 = new HTLList();

        h1.add(3);
        h1.add(8);
        h1.add(13);
        h1.peek();
        System.out.println(h1.get(0));

        h1.get(1);
        h1.removeAt(1);
        h1.peek();

    }
}
