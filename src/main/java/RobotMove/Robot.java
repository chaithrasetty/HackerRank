package RobotMove;

public class Robot {

    int currentX;
    int currentY;
    int previousX;
    int previousY;

    Robot(int currentX, int currentY) {
        this.currentX = currentX;
        this.currentY = currentY;
    }

    void moveX(int dx) {
        previousX = currentX;
        previousY = currentY;
        currentX = currentX + dx;
    }

    void moveY(int dy) {
        previousX = currentX;
        previousY = currentY;
        currentY = previousY + dy;
    }

    void printCurrentCoordinates() {
        System.out.println(currentX + "  " + currentY);
    }

    void printLastCoordinates() {
        System.out.println(previousX + "  " + previousY);
    }

    void printLastMove() {
        int xValue = currentX - previousX;
        int yValue = currentY - previousY;
        if (xValue > 0)
            System.out.println("x  " + xValue);
        else if (yValue > 0)
            System.out.println("y  " + yValue);
    }

    public static void main(String args[]) {
        Robot firstRobot = new Robot(0, 5);
        firstRobot.printCurrentCoordinates();

        Robot secondRobot = new Robot(2, 1);
        secondRobot.moveX(1);
        secondRobot.printLastMove();
        secondRobot.printCurrentCoordinates();
        secondRobot.moveY(1);
        secondRobot.printLastCoordinates();
        secondRobot.moveX(2);
        secondRobot.printLastMove();
        secondRobot.printCurrentCoordinates();
        secondRobot.moveY(0);
        secondRobot.printLastCoordinates();
    }
}
