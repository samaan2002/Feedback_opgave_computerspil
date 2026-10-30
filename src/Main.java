//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


void main() {

    //Her oprettes et objekt af klasse GameSystem ved hjælp af konstruktør:
    GameSystem system = new GameSystem(5, 5);

    allGames(system);
    allPlayer(system);
    gameFound(system);
    playerFound(system);
    topScore(system);
    update(system);
    revenue(system);
}

public void allGames(GameSystem system) {

    //For Game class:
    Game spil1 = new Game(1, "FIFA", "Sport", 499.95);
    Game spil2 = new Game(2, "Grand Theft Auto V", "Action", 449.95);
    Game spil3 = new Game(3, "Call of Duty", "Shooter", 349.95);
    Game spil4 = new Game(4, "Formula1", "Racing", 399.95);
    Game spil5 = new Game(5, "Stardew Valley", "Farming", 149.95);

    //Tilføje spil:
    system.addGame(spil1);
    system.addGame(spil2);
    system.addGame(spil3);
    system.addGame(spil4);
    system.addGame(spil5);

    //Prøver at tilføje en ekstra spil:
    Game spil6 = new Game(6,"PES","Sport",499.95);
    system.addGame(spil6);

    //Udskriv alle spil:
    system.displayAllGames();
    System.out.println("\n");

    //Ændre på et spils navn og pris:
    System.out.println("Spillet på nr.5 udskiftet ud med ny spil med ny pris: ");
    spil5.setPrice(249.50);
    spil5.setTitle("FarmingSim");
    system.displayAllGames();
    System.out.println("\n");

    //Ændring på genre spil nr. 2:
    System.out.println("Ændre genre på spil nr. 2");
    system.findGameById(2);
    spil2.setGenre("Thrill.");
    system.displayAllGames();
    System.out.println("\n");

}

public void allPlayer(GameSystem system) {

    //For Player class:
    Player spiller1 = new Player(1, "Emma", 17, 620.00);
    Player spiller2 = new Player(2, "Noah", 23, 760.00);
    Player spiller3 = new Player(3, "Omar", 25, 910.00);
    Player spiller4 = new Player(4, "Adam", 20, 870.00);
    Player spiller5 = new Player(5, "Lena", 24, 540.00);


    system.addPlayer(spiller1);
    system.addPlayer(spiller2);
    system.addPlayer(spiller3);
    system.addPlayer(spiller4);
    system.addPlayer(spiller5);

    //Prøver at tilføje en ekstra spil:
    Player spiller6 = new Player(6,"Atta",29,991);
    system.addPlayer(spiller6);

    //Udskriv alle spiller:
    System.out.println("Den gamle list:");
    system.displayAllPlayer();

    //Ændring på listen:
    //Navn.
    System.out.println("\nÆndring på navn:");
    spiller2.setName("Liwa");
    system.displayAllPlayer();
    //Alder.
    System.out.println("\nÆndring på alder: ");
    spiller1.setAge(19);
    system.displayAllPlayer();
}

public void gameFound(GameSystem system) {

    //Find spil:
    Game fundetSpil = system.findGameById(1);

    if (fundetSpil != null) { //if for sikkerhedskontrol:
        System.out.println("\nDen fundet spil er: ");
        fundetSpil.displayDetails();
    } else {
        System.out.println("\nDer blev ikke fundet spil: ");
    }

}

public void playerFound(GameSystem system) {

    //Find spiller:
    Player fundetPlayer = system.findPlayerById(2);

    if (fundetPlayer != null) {
        System.out.println("\nSpilleren er fundet: ");
        System.out.println(fundetPlayer);
    } else {
        System.out.println("\nSpilleren er ikke fundet:");
    }

}

public void topScore(GameSystem system) {

    //Top score:
    Player topscore = system.findTopScoringPlayer();

    if (topscore != null) {
        System.out.println("\nTopscorende spiller er: ");
        topscore.displayDetails();
    }

}

public void update(GameSystem system) {

    //Update spillerens score:
    system.updatePlayerScore(3, 770.50);
    system.displayAllPlayer();

    Player topscore = system.findTopScoringPlayer();

    if (topscore != null) {
        System.out.println("\nTopscorende spiller er: ");
        topscore.displayDetails();
    }
}

public void revenue(GameSystem system) {

    //Den samlede indtjening fra alle solgte spil:
    System.out.println("\nDen registrerede værdi af alle spil: " + system.calculateTotalRevenue());

}
