public class Game {
    //Felter:
    private int gameId;
    private String title;
    private String genre;
    private double price;

    //Konstruktør(med flere argumenter):
    public Game(int gameId, String title, String genre, double price) {

        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public int getGameId() {
        return gameId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void displayDetails() {
        System.out.println(this);
    }

    public String toString() {
        return "Game ID: " + gameId + "\t" +
                " Price: " + price + "\t" +
                " Genre: " + genre + "\t" +
                " Title: " + title;
    }
}
