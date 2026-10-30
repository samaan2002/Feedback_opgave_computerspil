public class Player {

    private int playerId;
    private String name;
    private int age;
    private double score;

    //Konstruktør:
    public Player(int playerId, String name, int age, double score) {

        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            System.out.println(getName() + " fik ændrede sin alder.😎");
            this.age = age;
        } else {
            System.out.println("Beklager, men man må ikke have negativ alder.😊");
        }
    }

    public double getScore() {
        return score;
    }

    public void displayDetails() {
        System.out.println(this);
    }

    public String toString() {
        return "Player ID: " + playerId + "\t" +
                " Name: " + name + " \t" +
                " Age: " + age + "\t" +
                " Score: " + score;
    }

    public void updateScore(double newScore) {
        score = newScore;
    }
}
