package src;
import java.io.*;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Player2 user = new Player2("ユーザ");
        Player2 com = new Player2("CPU");

        // 入力指示表示
        System.out.println("1.グー");
        System.out.println("2.チョキ");
        System.out.println("3.パー");
        System.out.print("あなたの手を選択してください。>");

        // ユーザ入力
        String input = null;
        try {
            BufferedReader inputuser = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            input = inputuser.readLine();
        } catch (IOException e) {
            System.out.print("システムエラー");
            System.exit(0);
            return;
        }

        if (input == null) {
            System.out.print("1-3の値を入力してください。");
            System.exit(0);
            return;
        }

        // ユーザの入力によりジャンケンの手をセットする
        if (input.equals("1")) {
            user.setHand(new Gu());
        } else if (input.equals("2")) {
            user.setHand(new Choki());
        } else if (input.equals("3")) {
            user.setHand(new Pa());
        } else {
            System.out.print("1-3の値を入力してください。");
            System.exit(0);
            return;
        }

        // 以降にテストコードを追加して検証を行う
        System.out.println("テスト結果");
        System.out.println(user.getPlayerName() + "の手: " + user.getHand().getHandName());

        com.createRandomHand();
        System.out.println("ランダムなジャンケンの手をCPUにセットする");
        System.out.println(com.getPlayerName() + "の手: " + com.getHand().getHandName());
    }
}

abstract class Hand {
    public abstract String getHandName();

    public int compare(Hand hand) {
        return 0;
    }
}

class Gu extends Hand {
    @Override
    public String getHandName() {
        return "グー";
    }
}

class Choki extends Hand {
    @Override
    public String getHandName() {
        return "チョキ";
    }
}

class Pa extends Hand {
    @Override
    public String getHandName() {
        return "パー";
    }
}

class Player2 {
    private String playerName;
    private Hand hand;
    private static Random random = new Random();

    public Player2(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void createRandomHand() {
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                this.hand = new Gu();
                break;
            case 1:
                this.hand = new Choki();
                break;
            case 2:
                this.hand = new Pa();
                break;
        }
    }
}
