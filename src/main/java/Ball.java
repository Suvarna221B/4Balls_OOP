import processing.core.PApplet;

public class Ball {
    public static final int DIAMETER = 10;
    int positionX = 0;
    int positionY = 0;
    int speed;
    PApplet background;

    public Ball(PApplet background,int positionY, int speed) {
        this.positionY = positionY;
        this.speed = speed;
        this.background=background;
    }

    public void drawCircle() {
        background.ellipse(positionX, (positionY * fourBalls.HEIGHT) / 5, DIAMETER, DIAMETER);
        positionX += speed;
    }

}
