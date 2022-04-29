package example;

public class LogicalOperationSample {
    public static void main(String[] args) {
        // 論理演算子を使ってみる
        int age = 24;
        double height = 168;

        // 年齢が20歳以上で、「かつ」、身長が170cmを超えているか
        System.out.println(age > 20 && height > 170);

        // 年齢が20歳以上、「または」、身長が170cmを超えているか
        System.out.println(age > 20 || height > 170);
    }
}
