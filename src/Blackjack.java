public class Blackjack {
    public static void main(String[] args) {
        int [] deck = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14};
        System.out.println(deck.length);
        int [] shuffledDeck = MethodsPractice.shuffleTest(deck);

    }
    public static void letsPlay(int [] shuffledDeck, int [] deck){
        System.out.println("Blackjack time");
        int yourHand = 0;
        int dealerHand = 0;
        int dealtCards = 0;
        if (dealtCards >= 52){
            shuffledDeck = MethodsPractice.shuffleTest(deck);
            dealtCards = 0;
        }
        System.out.println("Dealing cards");
    }
}
