package String;

public class Split {
    // 以分隔符分割字符串
    public static void main(String[] args) {
        String s = "g hcvwuy.l.k.h,vk,ci-ufj;oc'b o,i vc-oy";
        String[] a;
        a = s.split(" ");
        System.out.println("以空格间隔:");
        for (String e : a) {
            System.out.println(e);
        }
        a = s.split(" |,");
        System.out.println("以空格,逗号间隔:");
        for (String e : a) {
            System.out.println(e);
        }
        a = s.split(" |,|\\.");
        System.out.println("以空格,逗号,句号间隔:");
        for (String e : a) {
            System.out.println(e);
        }
    }
}