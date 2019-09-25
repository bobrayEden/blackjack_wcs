import java.util.Random;
import java.util.Scanner;


public class BlackJack{

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

    //Table suits : pour déterminer la couleur d'une carte
    String[] suits = {"Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade"};
    //Table ranks pour déterminer le rang d'une carte
    int[] ranks = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13};

    //Initialiser le score total de Player
    int playerScore = 0;
    int playerCardCount = 0;
    //Initialiser le score total de Dealer
    int dealerScore = 0;
    int dealerCardCount = 0;
    // crée un objet Scanner
    Scanner newDraw = new Scanner(System.in);
    int x = 3;
    do {
      //Phase 1 : Tirer 2 cartes pour le Player et lui indiquer son score
      int draw = drawCard();
      int cardScore = drawScore(draw);
      playerScore = playerScore + cardScore;
      playerCardCount++;
      draw = drawCard();
      cardScore = drawScore(draw);
      playerScore = playerScore + cardScore;
      playerCardCount++;
      System.out.println("Player current score is : " + playerScore);


      //Phase 2 : Tirer 1 carte face visible et une carte face cachée pour le Dealer
      draw = drawCard();
      cardScore = drawScore(draw);
      dealerScore = dealerScore + cardScore;
      dealerCardCount++;
      draw = drawCard();
      cardScore = drawScore(draw);
      dealerScore = dealerScore + cardScore;
      dealerCardCount++;
      System.out.println("Dealer current score is : " + dealerScore);

      //Phase 3 boucle du joueur
      //Demander au Player s'il veut tirer une nouvelle carte
      System.out.println("Player current score is : " + playerScore);
      System.out.println("Do the player wants to draw a new card ? (y to continue, n to stop)");
      String answer = newDraw.next();

        //Boucle while, le joueur tire des cartes tant qu'il veut et que son score reste inférieur à 21
      while (playerScore < 21 && answer.equals("y")){
        draw = drawCard();
        if (draw <= 3 && playerScore >= 11) {
          cardScore = 1;
          System.out.println("what a lucky Ace !!");
        } else if (draw <= 3 && playerScore <= 10) {
          System.out.println("you drew an ace should it count as 1 or 11 ?");
          int aceValue = newDraw.nextInt();
          cardScore = aceValue;
        } else {
          cardScore = drawScore(draw);
        };
        //cardScore = drawScore(draw);
        playerScore = playerScore + cardScore;
        playerCardCount++;
        if (playerScore > 21) {
          System.out.println("Player current score is : " + playerScore);
          System.out.println("You are a great loser, try again mate, the bank always wins...");
        return;
      } else if (playerScore == 21) {
        continue;
      };
        System.out.println("Player current score is : " + playerScore);
        System.out.println("Do the player wants to draw a new card ? (y to continue, n to stop)");
        answer = newDraw.next();
      };
      System.out.println("Player stopped drawing cards with a score of " + playerScore);

      //Phase 4 : Tour du dealer

      //révéler la carte cachée (mais pour l'instant elle ne l'est pas donc...)

      while (dealerScore < 17) {
        draw = drawCard();
        dealerCardCount++;
        if (draw <= 3 && dealerScore >= 6 && dealerScore <=10) {
          cardScore = 11;
          System.out.println("Wow, the Dealer drew a critical Ace !!");
        } else {
          cardScore = drawScore(draw);
        };
        dealerScore = dealerScore + cardScore;
        System.out.println("Dealer current score is : " + dealerScore);
      };

      // Phase de résolution de la partie

      if (dealerScore > 21) {
        System.out.println("Player final score is " + playerScore + " and Dealer final score is " + dealerScore + " !");
        System.out.println("Wow, Player One, so much skill... but don't be cocky, friend.");
      } else {
        if (dealerScore > playerScore) {
          System.out.println("Player final score is " + playerScore + " and Dealer final score is " + dealerScore + " !");
          System.out.println("Good try buddy, but you owe me money..!");
        } else if (playerScore > dealerScore) {
          System.out.println("Player final score is " + playerScore + " and Dealer final score is " + dealerScore + " !");
          System.out.println("Hey, Player won, Joe, have you checked that he did not cheat ??");
        } else if (playerScore == dealerScore && playerScore != 21) {
          System.out.println("Player final score is " + playerScore + " and Dealer final score is " + dealerScore + " !");
          System.out.println("It's a tie, fair for everyone, but please, play again !!");
        } else if (playerScore == dealerScore && playerScore == 21) {
          if (playerCardCount == 2 && dealerCardCount != 2) {
            System.out.println("BlackJack !! Critical hit, the Dealer is on the ground & Player wins");
          } else if (playerCardCount !=2 && dealerCardCount == 2) {
            System.out.println("What ? How can you say the dealer is cheating ? Joe, take this gentleman out of my casino ! (player loses)");
          } else {
            System.out.println("Ultimate tie : both parties scored 21, guess who is cheating...");
          }
        }
      }
    System.out.println("Do you want to play again ? (1 = yes / every other number = no)");
    x = newDraw.nextInt();
    } while (x == 1);
  }
}
