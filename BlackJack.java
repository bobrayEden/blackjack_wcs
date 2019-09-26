import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
    if (card < 4) {
      System.out.println("You drew an Ace of " + suits[card] + "!!");
    } else if (card >= 40 && card <= 43) {
      System.out.println("You drew a Jack of " + suits[card] + "!!");
    } else if (card >= 44 && card <= 47) {
      System.out.println("You drew a Queen of " + suits[card] + "!!");
    } else if (card > 47) {
      System.out.println("You drew a King of " + suits[card] + "!!");
    } else {
      System.out.println("You drew " + ranks[card] + " of " + suits[card] + "!!");
    }
      return card;
    };

  public static int drawCardDealer() {
    //Table suits : pour déterminer la couleur d'une carte
    String[] suits = {"Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade"};
    //Table ranks pour déterminer le rang d'une carte
    int[] ranks = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13};
    //Tirer un index au hasard
    Random rand = new Random();
    int cardDealer = rand.nextInt(52);
    //Checker l'index pour vérification
    if (cardDealer < 4) {
      System.out.println("The Dealer drew an Ace of " + suits[cardDealer] + "!!");
    } else if (cardDealer >= 40 && cardDealer <= 43) {
      System.out.println("The Dealer drew a Jack of " + suits[cardDealer] + "!!");
    } else if (cardDealer >= 44 && cardDealer <= 47) {
      System.out.println("The Dealer drew a Queen of " + suits[cardDealer] + "!!");
    } else if (cardDealer > 47) {
      System.out.println("The Dealer drew a King of " + suits[cardDealer] + "!!");
    } else {
    System.out.println("The Dealer drew " + ranks[cardDealer] + " of " + suits[cardDealer] + "!!");
    }
    return cardDealer;
  };

  public static int drawHiddenCard() {
    //Table suits : pour déterminer la couleur d'une carte
    String[] suits = {"Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade"};
    //Table ranks pour déterminer le rang d'une carte
    int[] ranks = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13};
    //Tirer un index au hasard
    Random rand = new Random();
    int hiddenCard = rand.nextInt(52);
    //Checker l'index pour vérification
    System.out.println("The Dealer drew a hidden card");
    return hiddenCard;
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
  return score;
  }

  public static void main(String[] args) {

    //Table suits : pour déterminer la couleur d'une carte
    String[] suits = {"Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade", "Club", "Diamond", "Heart", "Spade"};
    //Table ranks pour déterminer le rang d'une carte
    int[] ranks = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13};

    int x = 3;
    do {
    //Initialiser le score total de Player
    int playerScore = 0;
    int playerCardCount = 0;
    //Initialiser le score total de Dealer
    int dealerScore = 0;
    int dealerCardCount = 0;
    // crée un objet Scanner
    Scanner newDraw = new Scanner(System.in);
      System.out.println("Hey Gentle(Wo)man, welcome to BobRay and Atef's Casino !");
      System.out.println("Here we play the finest game of all time, famously known as BlackJack...");
      System.out.println("Do you want to learn some things about the rules of this (un)fair game ? (type y to learn the rules & n to skip)");
      String answer = newDraw.next();
      while (!answer.equalsIgnoreCase("y")) {
        if (answer.equalsIgnoreCase("n")) {
          break;
        }
       System.out.println("Do you want to learn some things about the rules of this (un)fair game ? (type y to learn the rules & n to skip)");
       answer = newDraw.next();
      }
      if (answer.equalsIgnoreCase("y")) {
        System.out.println("Are you serious ? Anyway, you have to reach 21 with card values, but you'll learn quickly I guess...");
      }

      System.out.println("So you're ready ? Then... Let the game begin ! whispering to Joe (Joe, grab the mighty Shotgun, this guy seems unlegit...)");

      //Phase 1 : Tirer 2 cartes pour le Player et lui indiquer son score
      int draw = drawCard();
      int cardScore = drawScore(draw);
      if (draw <= 3 && playerScore >= 11) {
        cardScore = 1;
        System.out.println("What a lucky Ace !!");
      } else if (draw <= 3 && playerScore <= 10) {
        System.out.println("You drew an Ace should it count as 1 or 11 ?");
        int aceValue = newDraw.nextInt();
        cardScore = aceValue;
      } else {
        cardScore = drawScore(draw);
      };
      playerScore = playerScore + cardScore;
      playerCardCount++;
      draw = drawCard();
      if (draw <= 3 && playerScore >= 11) {
        cardScore = 1;
        System.out.println("What a lucky Ace !!");
      } else if (draw <= 3 && playerScore <= 10) {
        System.out.println("You drew an Ace should it count as 1 or 11 ?");
        int aceValue = newDraw.nextInt();
        cardScore = aceValue;
      } else {
        cardScore = drawScore(draw);
      };
      playerScore = playerScore + cardScore;
      playerCardCount++;
      System.out.println("Your current score is : " + playerScore);


      //Phase 2 : Tirer 1 carte face visible et une carte face cachée pour le Dealer
      draw = drawCardDealer();
      cardScore = drawScore(draw);
      dealerScore = dealerScore + cardScore;
      dealerCardCount++;
      int hiddenDraw = drawHiddenCard();
      dealerCardCount++;
      System.out.println("Dealer current score is : " + dealerScore);

      //Phase 3 boucle du joueur
      //Demander au Player s'il veut tirer une nouvelle carte
      System.out.println("Your current score is : " + playerScore);
      System.out.println("Do You want to draw a new card ? (y to continue, n to stop)");
      answer = newDraw.next();
      while (!answer.equals("y")) {
        if (answer.equals("n")){
          break;
        }
       System.out.println("Do You want to draw a new card ? (y to continue, n to stop)");
       answer = newDraw.next();
      }
        //Boucle while, le joueur tire des cartes tant qu'il veut et que son score reste inférieur à 21
      while (playerScore < 21 && answer.equals("y")){
        draw = drawCard();
        if (draw <= 3 && playerScore >= 11) {
          cardScore = 1;
          System.out.println("What a lucky Ace !!");
        } else if (draw <= 3 && playerScore <= 10) {
          System.out.println("You drew an Ace should it count as 1 or 11 ?");
          int aceValue = newDraw.nextInt();
          cardScore = aceValue;
        } else {
          cardScore = drawScore(draw);
        };
        //cardScore = drawScore(draw);
        playerScore = playerScore + cardScore;
        playerCardCount++;
        if (playerScore > 21) {
          System.out.println("Your current score is : " + playerScore);
          System.out.println("You are a great loser, try again mate, the bank always wins...");
        return;
      } else if (playerScore == 21) {
        continue;
      };
        System.out.println("Your current score is : " + playerScore);
        System.out.println("Do You want to draw a new card ? (y to continue, n to stop)");
        answer = newDraw.next();
        while (!answer.equals("y")) {
          if (answer.equals("n")){
            break;
          }
         System.out.println("Do You want to draw a new card ? (y to continue, n to stop)");
         answer = newDraw.next();
        }
      };
      System.out.println("You stopped drawing cards with a score of " + playerScore);

      //Phase 4 : Tour du dealer

      //révéler la carte cachée (mais pour l'instant elle ne l'est pas donc...)
      cardScore = drawScore(hiddenDraw);
      dealerScore = dealerScore + cardScore;
      if (hiddenDraw < 4) {
        System.out.println("The Dealer reveals his hidden card and it's an Ace of " + suits[hiddenDraw] + "!!");
      } else if (hiddenDraw >= 40 && hiddenDraw <= 43) {
        System.out.println("The Dealer reveals his hidden card and it's a Jack of " + suits[hiddenDraw] + "!!");
      } else if (hiddenDraw >= 44 && hiddenDraw <= 47) {
        System.out.println("The Dealer reveals his hidden card and it's a Queen of " + suits[hiddenDraw] + "!!");
      } else if (hiddenDraw > 47) {
        System.out.println("The Dealer reveals his hidden card and it's a King of " + suits[hiddenDraw] + "!!");
      } else {
      System.out.println("The Dealer reveals his hidden card, and it's a " + ranks[hiddenDraw] + " of " + suits[hiddenDraw] + "!!" );
      }
      System.out.println("The Dealer score is " + dealerScore + "!!");
      while (dealerScore < 17) {
        draw = drawCardDealer();
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
        System.out.println("Your final score is " + playerScore + " and Dealer final score is " + dealerScore + " !");
        System.out.println("Wow, Dude, so much skill... but don't be cocky, Friend.");
      } else {
        if (dealerScore > playerScore) {
          System.out.println("Your final score is " + playerScore + " and Dealer final score is " + dealerScore + " !");
          System.out.println("Good try Buddy, but you owe me money..!");
        } else if (playerScore > dealerScore) {
          System.out.println("Player final score is " + playerScore + " and Dealer final score is " + dealerScore + " !");
          System.out.println("Hey, Player won, Joe, have you checked that he did not cheat ??");
        } else if (playerScore == dealerScore && playerScore != 21) {
          System.out.println("Your final score is " + playerScore + " and Dealer final score is " + dealerScore + " !");
          System.out.println("It's a tie, fair for everyone, but please, play again !!");
        } else if (playerScore == dealerScore && playerScore == 21) {
          if (playerCardCount == 2 && dealerCardCount != 2) {
            System.out.println("BlackJack !! Critical hit, the Dealer is on the ground & You win !!");
          } else if (playerCardCount !=2 && dealerCardCount == 2) {
            System.out.println("What ? How can You say the Dealer is cheating ? Joe, take this gentleman out of my casino ! (player loses)");
          } else {
            System.out.println("Ultimate tie : both parties scored 21, now, guess who is cheating...");
          }
        }
      }
    System.out.println("Do You want to play again ? (1 = yes / every other number = no)");
    x = newDraw.nextInt();
    } while (x == 1);
  }
}
