public class Posicion {
    public double dx;
    public double dy;

    Posicion(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public double moverse(double dx, double dy) {
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    

}
