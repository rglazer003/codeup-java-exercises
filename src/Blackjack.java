import util.Input;

public class Blackjack {
    public static void main(String[] args) {
        int[] deck = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14};
        int[] shuffledDeck = MethodsPractice.shuffleTest(deck);
        letsPlay(shuffledDeck, deck);

    }

    public static void letsPlay(int[] shuffledDeck, int[] deck) {
        System.out.println("Blackjack time");
        // unused, finalResult, Aces, dealtCards
        int [] current = new int[] {0,0,0,0};
        int yourHand = 0;
        int dealerHand = 0;
        int showing = 0;
        int dealtCards = current[3];
        int currentCard = 0;
        int finalResult = current[1];
        int yourAces = 0;
        int dealerAces = 0;
        // Implement betting once game is working
        int money = 100;
        int bet = 0;
        boolean loop = true;
        boolean blackjack = true;
        do {
            if (deckCheck(dealtCards)) {
                shuffledDeck = shuffleDeck(deck);
                dealtCards = 0;
            }
            System.out.println("Dealing cards");
            work(yourAces,dealtCards,shuffledDeck,yourHand,current);
            yourAces = current[2];
            yourHand += finalResult;
            System.out.println("Your current total is " + yourHand);
            if (deckCheck(dealtCards)) {
                shuffledDeck = shuffleDeck(deck);
                dealtCards = 0;
            }
            nextDraw();
            work(dealerAces,dealtCards,shuffledDeck,dealerHand,current);
            dealerAces = current[2];
            dealerHand += finalResult;
            showing += finalResult;
            System.out.println("Dealer is showing "+dealerHand);
            if (deckCheck(dealtCards)) {
                shuffledDeck = shuffleDeck(deck);
                dealtCards = 0;
            }
            nextDraw();
            work(yourAces,dealtCards,shuffledDeck,yourHand,current);
            yourAces = current[2];
            yourHand += finalResult;
            if (yourHand == 21){
                System.out.println("Blackjack!");
                blackjack = false;
            }
            if (blackjack){
                if (deckCheck(dealtCards)) {
                    shuffledDeck = shuffleDeck(deck);
                    dealtCards = 0;
                }
                nextDraw();
                work(dealerAces,dealtCards,shuffledDeck,dealerHand,current);
                dealerAces = current[2];
                dealerHand += finalResult;
                System.out.println("Dealer is showing "+ showing);
                System.out.println("TEST Dealer has"+ dealerHand);
                Input.waitForEnter();

            }
            System.out.println("End of test");
            break;



        } while (loop);

    }

    public static int dealCard(int[] deck, int dealtCards) {
        return deck[dealtCards];
    }

    public static int interpretCard(int card, int hand) {
        int interpretedCard = 0;
        if (card == 2) {
            System.out.println("2");
            interpretedCard = 2;
        }
        if (card == 3) {
            System.out.println("3");
            interpretedCard = 3;
        }
        if (card == 4) {
            System.out.println("4");
            interpretedCard = 4;
        }
        if (card == 5) {
            System.out.println("5");
            interpretedCard = 5;
        }
        if (card == 6) {
            System.out.println("6");
            interpretedCard = 6;
        }
        if (card == 7) {
            System.out.println("7");
            interpretedCard = 7;
        }
        if (card == 8) {
            System.out.println("8");
            interpretedCard = 8;
        }
        if (card == 9) {
            System.out.println("9");
            interpretedCard = 9;
        }
        if (card == 10) {
            System.out.println("10");
            interpretedCard = 10;
        }
        if (card == 11) {
            System.out.println("Jack");
            interpretedCard = 10;
        }
        if (card == 12) {
            System.out.println("Queen");
            interpretedCard = 10;
        }
        if (card == 13) {
            System.out.println("King");
            interpretedCard = 10;
        }
        if (card == 14) {
            System.out.println("Ace");
            if (hand > 10) {
                interpretedCard = 1;
            } else {
                interpretedCard = 11;
            }
        }
        return interpretedCard;
    }

    public static boolean deckCheck(int dealtCards) {
        return dealtCards >= 52;
    }

    public static int[] shuffleDeck(int[] deck) {
        System.out.println("Shuffling deck");
        return MethodsPractice.shuffleTest(deck);
    }
    public static int aceTrack (int finalResult, int aceCount){
        if (finalResult==11){
            aceCount++;
        }
        return aceCount;
    }
    public static int [] work (int aceCounter, int dealtCards, int [] shuffledDeck, int hand, int [] current){
        int currentCard = dealCard(shuffledDeck,dealtCards);
        int finalResult = interpretCard(currentCard, hand);
        dealtCards++;
        aceCounter = aceTrack(finalResult,aceCounter);
        current[0] = currentCard;
        current[1] = finalResult;
        current[2] = aceCounter;
        current[3] = dealtCards;
        return current;
    }
    public static void nextDraw(){
        System.out.println("Press enter for next draw");
        Input.waitForEnter();
    }
}
