package String;

public class Split {
    // �Էָ����ָ��ַ���
    public static void main(String[] args) {
        String s = "g hcvwuy.l.k.h,vk,ci-ufj;oc'b o,i vc-oy";
        String[] a;
        a = s.split(" ");
        System.out.println("�Կո���:");
        for (String e : a) {
            System.out.println(e);
        }
        a = s.split(" |,");
        System.out.println("�Կո�,���ż��:");
        for (String e : a) {
            System.out.println(e);
        }
        a = s.split(" |,|\\.");
        System.out.println("�Կո�,����,��ż��:");
        for (String e : a) {
            System.out.println(e);
        }
    }
}