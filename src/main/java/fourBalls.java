import processing.core.PApplet;


public class fourBalls extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    Ball B1 = new Ball(this,1,1);
    Ball B2 = new Ball(this,2,2);
    Ball B3 = new Ball(this,3,3);
    Ball B4 = new Ball(this,4,4);

    public static void main(String args[]){

        PApplet.main("fourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        B1.drawCircle();
        B2.drawCircle();
        B3.drawCircle();
        B4.drawCircle();
    }
}
