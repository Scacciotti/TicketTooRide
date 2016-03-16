package tickets.scacciot17.tickettooride.ttr;

import tickets.scacciot17.tickettooride.Game.infoMsg.GameState;

/**
 * Created by Nicka on 3/14/2016.
 */
public class TTRState extends GameState {

    private FaceDownDeck allDown;
    private FaceUpDeck fiveUp;
    private DestDeck destinations;
    private Deck discard;
    private int playerID; //ID of the player whose turn it is
    private int numPlayers; //number of players for this game
    private int[] scores; //scores of all players
    private Boolean trackSelect; //if player is placing train
    private Boolean cardSelect; //if player is drawing cards
    private Boolean destinationSelect; //If players needs to select 1-3 destination cards
    //private Tracks tracks; //all tracks in game

    public TTRState(){
        allDown = new FaceDownDeck();
        allDown.startDeck();
        allDown.shuffle();
        fiveUp = new FaceUpDeck();
        fiveUp.firstFive(allDown);
        destinations = new DestDeck();
        destinations.firstDeck();
        destinations.shuffle();
        discard = new Deck();
        scores = new int[4];
        playerID = 0;
        //tracks = new Tracks();
    }
    
      //TODO
      /**
     * Copy constructor to create an identical version of the given game state
     * @param copyState gamestate to copy
     */
    public TTRState(TTRState copyState){
        allDown = new FaceDownDeck(copyState.allDown);
        fiveUp = new FaceUpDeck(copyState.fiveUp);
        destinations = new DestDeck(copyState.destinations);
        playerID = copyState.getPlayerID();
    }


   public FaceDownDeck getAllDown() {
        return allDown;
    }

    public void setAllDown(FaceDownDeck allDown) {
        this.allDown = allDown;
    }

    public FaceUpDeck getFiveUp() {
        return fiveUp;
    }

    public void setFiveUp(FaceUpDeck fiveUp) {
        this.fiveUp = fiveUp;
    }

    public DestDeck getDestinations() {
        return destinations;
    }

    public void setDestinations(DestDeck destinations) {
        this.destinations = destinations;
    }

    public Deck getDiscard() {
        return discard;
    }

    public void setDiscard(Deck discard) {
        this.discard = discard;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public Boolean getTrackSelect() {
        return trackSelect;
    }

    public void setTrackSelect(Boolean trackSelect) {
        this.trackSelect = trackSelect;
    }

    public Boolean getCardSelect() {
        return cardSelect;
    }

    public void setCardSelect(Boolean cardSelect) {
        this.cardSelect = cardSelect;
    }

    public Boolean getDestinationSelect() {
        return destinationSelect;
    }

    public void setDestinationSelect(Boolean destinationSelect) {
        this.destinationSelect = destinationSelect;
    }

}