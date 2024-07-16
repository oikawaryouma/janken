package src;

import java.util.Random;



public class Player {

    private String playerName;

    private Hand hand;



    public Player(String playerName) {

        this.playerName = playerName;

    }



    /**

     手の強弱を比較する。

     返り値 -1 : 自身が引数で指定した手より弱い

     　　　　0 : 自身が引数で指定した手と同じ

     　　　　1 : 自身が引数で指定した手より強い

     */

    public void createRandomHand() {



        Random random = new Random();

        int randomValue = random.nextInt(3);



        if(randomValue == 0) {

            this.hand = new Gu();

        } else if(randomValue == 1) {

            this.hand = new Choki();

        } else {

            this.hand = new Pa();

        }

    }



    public String getPlayerName() {

        return this.playerName;

    }



    public void setPlayerName(String name) {

        this.playerName = name;

    }



    public Hand getHand() {

        return this.hand;

    }



    public void setHand(Hand hand) {

        this.hand = hand;

    }

}


