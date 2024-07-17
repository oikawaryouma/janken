package src;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;



public class TestCode {



    public static void main(String[] args) {

        Player user = new Player("ユーザ");

        Player com = new Player("CPU");

        Game game = new Game();



        user.setHand(new Gu());

        com.setHand(new Gu());

        System.out.println("user:G vs com:G ->"+game.judge(user, com));

//        0が表示されるはず



        user.setHand(new Gu());

        com.setHand(new Choki());

        System.out.println("user:G vs com:C ->"+game.judge(user, com));

//        1が表示されるはず



        user.setHand(new Gu());

        com.setHand(new Pa());

        System.out.println("user:G vs com:P ->"+game.judge(user, com));

//        -1が表示されるはず



    }

}
