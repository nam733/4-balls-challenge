import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int width = 648;
    public static final int height = 480;
    public static final int diameter = 10;
    int ball1Speed,ball2Speed,ball3Speed,ball4Speed =0;

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
        drawCircle();
    }

    private void drawCircle() {
        ellipse(ball1Speed++, height/5, diameter, diameter);
        ellipse(ball2Speed+=2, height*2/5, diameter, diameter);
        ellipse(ball3Speed+=3, height*3/5, diameter, diameter);
        ellipse(ball4Speed+=4, height*4/5, diameter, diameter);
    }

}
