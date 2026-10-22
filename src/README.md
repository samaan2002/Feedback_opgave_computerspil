                            -Ahmad -Ayman -Steffan -Magnus

                          Hvad programmet gør og hvordan det køres:
Programmet er udviklet til at administrere computerspil og spillere. Der kan oprettes spil og spillere, 
der kan også opdateres score, søges på bestemte spil eller spiller, man kan også undersøge hvilken spiller, 
der har højeste score og ikke mindste den samlet indtjening.

Programmet er del op til fire klasse:
1. Game = Klassen repræsenterer et computerspil.

2. Player = Klassen repræsenterer en spiller.

3. GameSytem = Klassen bruges til at administrere alle spil og spillere.
  - i den her klasse har vi to Arrays, som skal bruges til at gemme spil og spiller.
  - vi har også addPlayer(), addGame(), displayAllGames() metoder og andre metoder,
    der er med til at styre programmet.

4. Main = Her har vi oprettet 5 Spil og 5 spiller, vi har også
    testede programmet med forskellig ting fx: ændring på navn,
    udskifte spil med en anden, laver ændring på spillets genre.
    Vi har også testede at finde spil og spiller, update score,
    og ikke mindste har vi testede om samlet indtjening.


     Hvordan vi har opdelt programmet i metoder:
 i selve main har vi lavet flere metoder, for eksempel:
- en metode til allGame, der samle alle spil.
- en metode til allPlayer, der samle alle spiller.
- en metode til gameFound, dens opgave er at finde et bestemte spil.
- en metode til playerFound, til at søge efter et bestemte spiller.
- en metode til topScore, den finde ud hvilken spiller har højeste score.
- en metode til update, som bruges til at lave ændring på scoren.
- en metode til revenue, som beregner ud den samlet indtjening på spil.

           Hvorfor denne opdeling:
For at gøre det mere overskuelig, så har man en specifik del til hver dele.

//kode



Løkker i spillet og hvorfor:

vi har for løkker i mange steder, fordi vi arbejde med et array, og dermed er det den bedste 
til at løbe igennem arrayet, fx: den her nede.↓↓↓↓

                    public void displayAllPlayer() {
                    for (int i = 0; i < playerCount; i++) {
                    players[i].displayDetails();
                    }
                    }
                                   Udfordring:
Vi har haft en lille udfordring med at score ikke updater efter man 
laver en nye ændring på score.

                                Hvad vi har lært:
Vi har lært at opdele programmet i klasser og binder klasserne sammen.
