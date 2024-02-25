public class Dragon {
    int x,y;
    int direction;

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void changeDirection(int newDirection){
        if (newDirection >= 1 && newDirection <= 4) {
            this.direction = newDirection;
        } else {
            System.out.println("Direction not valid. Please use 1 for up, 2 for right, 3 for down, or 4 for left.");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: // Atas
                this.y += steps;
                break;
            case 2: // Kanan
                this.x += steps;
                break;
            case 3: // Bawah
                this.y -= steps;
                break;
            case 4: // Kiri
                this.x -= steps;
                break;
            default:
                System.out.println("Invalid direction");
                break;
        }
    }

    public void printStatus() {
        System.out.println("Dragon Position: (X: " + this.x + ", Y: " + this.y + ") Direction: " + this.direction);
    }
}
