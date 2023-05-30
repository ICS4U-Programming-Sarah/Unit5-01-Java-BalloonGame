import java.awt.Color;

/**
 * This program contains the spike,
 * class. Referenced from video.
 *
 * @author  Sarah Andrew
 * @version 1.0
 *
 * @since 2023-02-05.
 */

public class Spike {
    // Defining field.
    int xPosition;
    public static final int positionY = 0;

    // Defining method that defines the
    // x position of the spike.
    public Spike(int xPos) {
        xPosition = xPos;
    }

    // Defining method when object,
    // making contact with ballon, it pops.
    public void ballonPopped(Ballon ballon) {
        if (ballon.xPosition == this.xPosition
                && ballon.yPosition == this.positionY) {
            // Balloon gets popped.
            ballon.isPopped = true;
        }
    }

    // Defining method that moves spike, thus
    // allowing for new pos.
    public void moveSpikeHorizontally(int space) {
        this.xPosition = space;
    }
}
