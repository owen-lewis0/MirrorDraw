import processing.core.PApplet;

public class Processing extends PApplet{

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        background(90, 97, 110);
        line(0, 400, 800, 400);
        line(0,0, 800, 800);
        line(800, 0, 0, 800);
        line(400, 0, 400, 800);
        stroke(255);
        strokeWeight(10);
    }

    public void draw(){
        line(pmouseX, pmouseY, mouseX, mouseY);
        line(Math.abs(800 - pmouseX), pmouseY, Math.abs(800 - mouseX), mouseY);
        line(pmouseX, Math.abs(800 - pmouseY), mouseX, Math.abs(800 - mouseY));
        line(Math.abs(800 - pmouseX), Math.abs(800 - pmouseY), Math.abs(800 - mouseX), Math.abs(800 - mouseY));

        line(pmouseY, pmouseX, mouseY, mouseX);
        line(Math.abs(800 - pmouseY), pmouseX, Math.abs(800 - mouseY), mouseX);
        line(pmouseY, Math.abs(800 - pmouseX), mouseY, Math.abs(800 - mouseX));
        line(Math.abs(800 - pmouseY), Math.abs(800 - pmouseX), Math.abs(800 - mouseY), Math.abs(800 - mouseX));


        if (keyPressed) {
            if (key == ' ') {
                clearScreen();
            }
        }
    }

    public void clearScreen(){
        clear();
        background(90, 97, 110);
        stroke(0);
        line(0, 400, 800, 400);
        line(0,0, 800, 800);
        line(800, 0, 0, 800);
        line(400, 0, 400, 800);
        stroke(255);
    }
}
