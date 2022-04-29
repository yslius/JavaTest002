package example;

public class ForAndIfSample {
    public static void main(String[] args) {
        for (int num = 1; num <= 50; ++num) {
            if (num % 15 == 0) {
                // 数字が3でも5でも割り切れる時は、わん！ にゃ～と表示する
                System.out.println("わん！ にゃ～");
            } else if (num % 3 == 0) {
                // そうではなく、数字が3で割り切れる時は、わん！と表示する
                System.out.println("わん！");
            } else if (num % 5 == 0) {
                // そうではなく、数字が5で割り切れる時は、にゃ～と表示する
                System.out.println("にゃ～");
            } else {
                // どれにも該当しない場合は、数字を表示する
                System.out.println(num);
            }
        }
    }
}
