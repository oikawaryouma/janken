package src;

public class Gu2 extends Hand {
    private String HAND_NAME = "グー";



    /**

     手の強弱を比較する。

     返り値 -1 : 自身が引数で指定した手より弱い

     　　　　0 : 自身が引数で指定した手と同じ

     　　　　1 : 自身が引数で指定した手より強い

     */

    public int compare(Hand hand) {

        //TODO:例外の処理

        return 0; //TODO 仮の返り値

    }



    public String getHandName() {

        return this.HAND_NAME;

    }

}
