public class Circle {
    int radius;
    String color;
     
    Circle(){
        radius=8;
        color="Green";
    }
    Circle(int radius,String color){
        this.radius=radius;
        this.color = color != null ? color : "Green";
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }


    public static void main(String[] args) throws Exception {

      Circle circle1 = new Circle();
      Circle circle2 = new Circle(0, null);

      System.out.println("Circle 1 -> Radius: " + circle1.radius + ", Color: " + circle1.color + ", Area: " + circle1.calculateArea());
        System.out.println("Circle 2 -> Radius: " + circle2.radius + ", Color: " + circle2.color + ", Area: " + circle2.calculateArea());

    }
}