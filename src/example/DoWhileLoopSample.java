package example;

public class DoWhileLoopSample {
    public static void main(String[] args) {
        int num = 0;    // 足していく数を入れる変数
        int sum = 0;    // 足した和を入れる変数

        do {
            num = num + 1;
            sum = sum + num;
        } while (sum  < 100);
        System.out.println("1から" + num + "までの数の和は" + sum + "です。");
    }
}
