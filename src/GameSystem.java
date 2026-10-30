public class GameSystem {

    private Game[] games;
    private Player[] players;

    private int gameCount;
    private int playerCount;

    public GameSystem(int maxGames, int maxPlayers) {

        games = new Game[maxGames];
        players = new Player[maxPlayers];

        gameCount = 0;
        playerCount = 0;
    }

    public void addGame(Game game) {

        if (gameCount < games.length) {

            games[gameCount] = game;
            gameCount++;
        } else {
            System.out.println("\nDer er ikke plads til flere spil, der er kun 5 pladser. ");
        }
    }

    public void addPlayer(Player player) {

        if (playerCount < players.length) {

            players[playerCount] = player;
            playerCount++;
        } else {
            System.out.println("\nDer er ikke plads til flere spiller, der er kun 5 pladser. ");
        }
    }

    public void displayAllGames() {
        for (int i = 0; i < gameCount; i++) {
            games[i].displayDetails();
        }
    }

    public void displayAllPlayer() {
        for (int i = 0; i < playerCount; i++) {
            players[i].displayDetails();
        }
    }

    public void updatePlayerScore(int playerId, double newScore) {

        Player player = findPlayerById(playerId);

        if (player != null) {

            player.updateScore(newScore);
            System.out.println("Den nye version efter update: ");
        }

    }

    public Game findGameById(int gameid) {

        for (int i = 0; i < gameCount; i++) {
            if (games[i].getGameId() == gameid) {
                return games[i];
            }
        }
        return null;
    }

    public Player findPlayerById(int playerid) {

        for (int i = 0; i < playerCount; i++) {

            if (players[i].getPlayerId() == playerid) {
                return players[i];
            }
        }
        return null;
    }

    public Player findTopScoringPlayer() {

        //Hvis der slet ikke noget indhold, så spring over:
        if (playerCount == 0) {
            return null;
        }
        //Den bedste spiller er indtil videre den, som står på 1.plads.
        Player topScore = players[0];

        for (int i = 0; i < playerCount; i++) {
            if (players[i].getScore() > topScore.getScore()) {
                topScore = players[i];
            }
        }
        return topScore;
    }

    public double calculateTotalRevenue() {

        double totalRevenue = 0;

        for (int i = 0; i < gameCount; i++) {
            totalRevenue += games[i].getPrice();
        }

        return totalRevenue;
    }
}
