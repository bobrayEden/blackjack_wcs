import java.util.Random;


public class BlackJacky{

  //Tirer et return un index "card" au hasard, indiquer dans la console la carte tirée
  public static int drawCard() {
    //Table suits : pour déterminer la couleur d'une carte
    String[] suits = {"Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade"};
    //Table ranks pour déterminer le rang d'une carte
    int[] ranks = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13};
    //Tirer un index au hasard
    Random rand = new Random();
    int card = rand.nextInt(52);
    //Checker l'index pour vérification
    System.out.println("You drew " + ranks[card] + " of " + suits[card] + "!!");
    return card;
  };

  //Méthode pour récupérer le score d'une draw
  public static int drawScore(int draw) {
  //Table ranks pour déterminer le rang d'une carte
  int[] ranks = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13};
  int score = 0;
    if (2 <= ranks[draw] && ranks[draw] <= 10) {
      score = ranks[draw];
    } else if (ranks[draw] > 10) {
      score = 10;
    } else if (ranks[draw] <= 1) {
      score = 1;
    };
  System.out.println("Scores : " + score);
  return score;
  }

  public static void main(String[] args) {

    //Décommenter si nécessaire
    String[] suits = {"Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade"};
    int[] ranks = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13};


    // Appel d'un index pour tirer une carte
    int draw = drawCard();
    // Indiquer dans la console la carte tirée
    System.out.println(ranks[draw] + " of " + suits[draw]);
    int cardScore = drawScore(draw);
    System.out.println("Your score is " + drawScore(draw));
    System.out.println(cardScore);






    //System.out.println(suits.length);
    //System.out.println(ranks.length);
    //System.out.println(ranks[18] + " of " + suits[18]);
    //System.out.println(ranks[1] + " of " + suits[1]);
    //System.out.println(ranks[25] + " of " + suits[25]);
    //System.out.println(ranks[0] + " of " + suits[0]);

  }
}
