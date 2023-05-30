import java.awt.Color;

/**
 * This program contains the main,
 * class. Referenced from video.
 *
 * @author  Sarah Andrew
 * @version 1.0
 *
 * @since 2023-02-05.
 */

/**
 * This is the main method.
 *
* @param args Unused.
*/
public class Main {
    public static void main(String[] args) {
        // Creating balloon & spike.
        Ballon ballonA = new Ballon(61, 45, Color.PINK, 1);
        Ballon ballonB = new Ballon(41, 56, Color.ORANGE, 2);
        Spike spike = new Spike(10);

        // Prints everytime when position is changed,
        // or colour.
        System.out.println(ballonA.color);
        ballonA.changeColour(Color.GREEN);
        System.out.println(ballonA.color);

        // Printing position.
        System.out.print("Balloon A:  " + ballonA.xPosition);
        System.out.println("," + ballonA.yPosition);
        System.out.print("Balloon B: " + ballonB.xPosition);
        System.out.println("," + ballonB.yPosition);
        ballonA.moveBallon(67, 125);

        // Position changing.
        spike.ballonPopped(ballonA);
        System.out.println("The spike has moved.");
        System.out.print("Balloon A: " + ballonA.xPosition);
        System.out.println("," + ballonA.yPosition);
        System.out.print("Balloon B: " + ballonB.xPosition);
        System.out.println("," + ballonB.yPosition);

        // Position changing.
        System.out.print("Balloon A: " + ballonA.xPosition);
        System.out.println("," + ballonA.yPosition);
        System.out.print("Balloon B: " + ballonB.xPosition);
        System.out.println("," + ballonB.yPosition);
        ballonB.moveBallon(12, -87);
        System.out.println("The balloon has been moved!");
        spike.ballonPopped(ballonB);

        // Position changing.
        System.out.print("Balloon A: " + ballonA.xPosition);
        System.out.println("," + ballonA.yPosition);
        System.out.print("Balloon B: " + ballonB.xPosition);
        System.out.println("," + ballonB.yPosition);

        // Moving spike.
        System.out.println(spike.xPosition + "," + Spike.positionY);
        spike.moveSpikeHorizontally(25);
        System.out.println("Spike has been moved!");
        spike.ballonPopped(ballonA);
        spike.ballonPopped(ballonB);
        System.out.println(spike.xPosition + "," + Spike.positionY);

        // When the ballon gets popped.
        if (ballonA.isPopped || ballonB.isPopped) {
            System.out.println("The balloon has been popped.");
        }

    }

}
