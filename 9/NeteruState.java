class NeteruState extends DogState {
    private static NeteruState s = new NeteruState();

    private NeteruState() {
    }

    public static DogState getInstance() {
        return s;
    }

    public void tukareta(Dog moto) {
        // なにもしない
    }

    public void tabeta(Dog moto) {
    }

    public String toString() {
        return "寝てる状態";
    }
}