import java.awt.*;

public class MouceAutoClicker {

    public static void main(String[] args) {
        int i=0;
        while (i >= 0) {
            try {

                Robot robot = new Robot();

                int mask = InputEvent.BUTTON1_DOWN_MASK;
                robot.mousePress(mask);

                robot.mouseRelease(mask);
                Thread.sleep(10000);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
