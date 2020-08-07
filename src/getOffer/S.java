package src.getOffer;

public class S extends F{
    static {
        System.out.println("S----static");
    }
    public S() {
        System.out.println("S---cons");
    }

    private void p() {
        System.out.println();
    }

    public static void main(String[] args) {
        S s = new S();
//        S ss = (S)null.p();
    }
}
