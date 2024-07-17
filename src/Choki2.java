package src;

public class Choki2 extends Hand {
    private String HAND_NAME = "チョキ";



    /**

     手の強弱を比較する。

     返り値 -1 : 自身が引数で指定した手より弱い

     　　　　0 : 自身が引数で指定した手と同じ

     　　　　1 : 自身が引数で指定した手より強い

     */

    public int compare(Hand hand) {
        if(hand instanceof Choki) {    //チョキ　vs グー（自分）
            return 0;
        } else if(hand instanceof Pa) {    //パー　vs グー（自分）
            return 1;
        } else {
            return -1;    //グー　vs グー（自分）
        }
    }



    public String getHandName() {

        return this.HAND_NAME;

    }

}

