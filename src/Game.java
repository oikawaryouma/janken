package src;

public class Game {
    //返り値

    //-1: p1の負け

    // 0: ひきわけ

    // 1: p1の勝ち

    public int judge(Player p1, Player p2) {

        //TODO:nullチェック

        return p1.getHand().compare(p2.getHand());

    }
}
