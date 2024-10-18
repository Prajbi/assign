public class assignop {

    public static void main(String[] args) {
        int p = 120;
        int q;
        q = p;
        // System.out.println(q += p);
        p += q;
        System.out.println(p);
        p -= q;
        p /= q;
        p %= q;
        System.out.println(p);
        p *= q;
        System.out.println(p);
    }
}