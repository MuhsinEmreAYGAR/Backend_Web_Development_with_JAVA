public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alex", 15, 100, 90, 30);
        Fighter f2 = new Fighter("Mike", 10, 95, 100, 50);

        Match match1 = new Match(f1, f2, 90, 100);
        match1.run();
    }
}