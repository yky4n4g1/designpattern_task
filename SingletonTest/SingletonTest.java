public class SingletonTest {
    public static void main(String[] args) {
        Renban renbanA = Renban.getInstance();
        Renban renbanB = Renban.getInstance();

        System.out.println(renbanA.getNumber());
        System.out.println(renbanB.getNumber());
        System.out.println(renbanB.getNumber());
        System.out.println(renbanA.getNumber());
        System.out.println(renbanB.getNumber());
    }
}

class Renban {
    private static Renban renban = new Renban();
    private static int num;

    private Renban() {
        num = 0;
    }

    public static Renban getInstance() {
        return renban;
    }

    public String getNumber() {
        num++;
        return String.format("%04d", num);
    }
}