public class Match {
    Fighter f1;
    Fighter f2;
    Fighter firstPlayer;
    Fighter secondPlayer;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (checkWeight()) {
            whoIsFirst(f1, f2);
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("\n====== Yeni Round ======");

                secondPlayer.health = firstPlayer.hit(secondPlayer);
                if (isWin()) break;

                firstPlayer.health = secondPlayer.hit(firstPlayer);
                if (isWin()) break;

                printScore();
            }
        } else {
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }
    }

    boolean checkWeight() {
        return ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight));
    }

    void whoIsFirst(Fighter f1, Fighter f2) {
        int number = (int) (Math.random() * (3 - 1)) + 1;
        System.out.println(number);
        if (number == 1) {
            this.firstPlayer = f1;
            this.secondPlayer = f2;
        } else {
            this.firstPlayer = f2;
            this.secondPlayer = f1;
        }
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı kazanan : " + f2.name);
            return true;
        }
        if (f2.health == 0) {
            System.out.println("Maçı kazanan : " + f1.name);
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("\n---------------------------");
        System.out.println(f1.name + " Kalan Can : " + f1.health);
        System.out.println(f2.name + " Kalan Can : " + f2.health);
    }
}