public class SnakeMain {
   public static void main(String[] args) {
    Snake snake1 = new Snake(5, 5);
    Snake snake2 = new Snake(10, 10);

    snake1.moveRight();
    snake1.moveUp();
    snake2.moveLeft();
    snake2.moveDown();

    snake1.position();
    snake2.position();
   }
}
