public class Container {
    // data
    private static final int MAX = 100;
    private int liters;

    // methods

    public int getLiters() {
        return this.liters;
    }

    public void addLiters(int liters) {
        this.liters = this.liters + liters;
        if (this.liters > 500) {
            this.liters = 500;
        }
    }


    public void removeLiters(int liters) {
        this.liters = this.liters - liters;
        if (this.liters < 0) {
            this.liters = 0;
        }
    }
}
