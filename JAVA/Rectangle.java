
class Rectangle {
 public int length;
 public int width;

 public Rectangle() {
     this.length = 1;
     this.width = 1;
 }

 public Rectangle(int a) {
     this.length = a;
     this.width = a;
 }

 public Rectangle(int a, int b) {
     this.length = a;
     this.width = b;
 }
}

public class hi {

 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle();
     System.out.println(rectangle.length + " " + rectangle.width);
     Rectangle rectangle2 = new Rectangle(6);
     System.out.println(rectangle2.length + " " + rectangle2.width);
     Rectangle rectangle3 = new Rectangle(3, 9);
     System.out.println(rectangle3.length + " " + rectangle3.width);
 }

}
