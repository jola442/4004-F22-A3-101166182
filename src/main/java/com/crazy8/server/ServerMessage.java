package com.crazy8.server;
import com.crazy8.server.Defs.Action;
import com.crazy8.game.Defs.*;

public class ServerMessage {
    private String name;
    private String cards;
    private String message;
    private String scores;
    private Action action;
    private Direction direction;
    private String turnNumber;
    private String roundNum;
    private String id;
    private String numPlayers;
    private String currentPlayerTurn;
    private String numStackedTwoCards;
    private String numCardsDrawn;


    private String selectSuit;



    public ServerMessage(){
        name = "";
        cards = "";
        message = "";
        scores = "0,0,0,0";
        action = Action.JOIN;
        direction = Direction.RIGHT;
        turnNumber = "0";
        roundNum = "0";
        id = "-1";
        numPlayers = "0";
        currentPlayerTurn = "";
        numStackedTwoCards = "0";
        numCardsDrawn = "0";
        selectSuit = "false";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAction(Defs.Action action) {
        this.action = action;
    }

    public String getCards() {
        return cards;
    }

    public void setCards(String cards) {
        this.cards = cards;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores;
    }

    public Action getAction() {
        return action;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(String turnNumber) {
        this.turnNumber = turnNumber;
    }

    public String getRoundNum() {
        return roundNum;
    }

    public void setRoundNum(String roundNum) {
        this.roundNum = roundNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(String numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void setCurrentPlayerTurn(String currentPlayerTurn) {
        this.currentPlayerTurn = currentPlayerTurn;
    }

    public String getNumCardsDrawn() {
        return numCardsDrawn;
    }

    public void setNumCardsDrawn(String numCardsDrawn) {
        this.numCardsDrawn = numCardsDrawn;
    }

    public String getCurrentPlayerTurn() {
        return currentPlayerTurn;
    }

    public String getNumStackedTwoCards() {
        return numStackedTwoCards;
    }

    public void setNumStackedTwoCards(String numStackedTwoCards) {
        this.numStackedTwoCards = numStackedTwoCards;
    }

    public String getSelectSuit() {
        return selectSuit;
    }

    public void setSelectSuit(String selectSuit) {
        this.selectSuit = selectSuit;
    }


    @Override
    public String toString() {
        return "ServerMessage{" +
                "name='" + name + '\'' +
                ", cards='" + cards + '\'' +
                ", message='" + message + '\'' +
                ", scores='" + scores + '\'' +
                ", action=" + action +
                ", direction=" + direction +
                ", turnNumber='" + turnNumber + '\'' +
                ", roundNum='" + roundNum + '\'' +
                ", id='" + id + '\'' +
                ", numPlayers='" + numPlayers + '\'' +
                ", currentPlayerTurn='" + currentPlayerTurn + '\'' +
                ", numStackedTwoCards='" + numStackedTwoCards + '\'' +
                ", numCardsDrawn='" + numCardsDrawn + '\'' +
                ", selectSuit='" + selectSuit + '\'' +
                '}';
    }
}

