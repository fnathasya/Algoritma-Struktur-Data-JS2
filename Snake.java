public class Snake {
    int x;
    int y;

    public Snake(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moveLeft(){
        x -= 1;
    }
    public void moveRight(){
        x += 1;
    }
    public void moveUp(){
        y += 1;
    }
    public void moveDown(){
        y -= 1;
    }

    public void position(){
        System.out.println("Snake Position - X: " + x + ", Y: " + y);
    }
}
