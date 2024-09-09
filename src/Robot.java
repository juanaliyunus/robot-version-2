class Robot {
    private Direction direction;
    private int x;
    private int y;

    public Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public void executeCommand(char command) {
        switch (command) {
            case 'A':
                moveForward();
                break;
            case 'L':
                turnLeft();
                break;
            case 'R':
                turnRight();
                break;
            default:
                System.out.println("Invalid command");
                break;
        }
        System.out.println(command + " -> (" + x + "," + y + ")");
    }

    private void moveForward() {
        switch (direction) {
            case NORTH:
                y += 1;
                break;
            case EAST:
                x += 1;
                break;
            case SOUTH:
                y -= 1;
                break;
            case WEST:
                x -= 1;
                break;
        }
    }

    private void turnLeft() {
        direction = direction.turnLeft();
    }

    private void turnRight() {
        direction = direction.turnRight();
    }
}