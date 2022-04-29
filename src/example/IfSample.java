package example;

public class IfSample {
    public static void main(String[] args) {
        String name = "太郎";
        int age = 24;
        double height = 165;

        // 身長が168cm以上の場合のみ、身長を表示する
        if (height >= 168) {
            System.out.println(name + "の身長は" + height + "cmです。");
        }
        System.out.println(name + "は" + age + "歳です。");
    }
}
