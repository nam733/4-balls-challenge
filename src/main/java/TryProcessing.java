import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int width = 648;
    public static final int height = 480;
    public static final int diameter = 10;
    float ballOneHeight = (float) (0.2*height);
    float ballTwoHeight = (float) (0.4*height);
    float ballThreeHeight = (float) (0.6*height);
    float ballFourHeight = (float) (0.8*height);
    int ballOneSpeed =0;
    int ballTwoSpeed =0;
    int ballThreeSpeed =0;
    int ballFourSpeed =0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(width, height);
    }


    @Override
    public void setup() {
    }

    @Override
    public void draw() {
//        paintWhite();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(ballOneSpeed, ballOneHeight, diameter, diameter);
        ballOneSpeed++;
        ellipse(ballTwoSpeed, ballTwoHeight, diameter, diameter);
        ballTwoSpeed = ballTwoSpeed +2;
        ellipse(ballThreeSpeed, ballThreeHeight, diameter, diameter);
        ballThreeSpeed = ballThreeSpeed +3;
        ellipse(ballFourSpeed, ballFourHeight, diameter, diameter);
        ballFourSpeed = ballFourSpeed +4;
    }

    private void paintWhite() {
        background(255);
    }

}
