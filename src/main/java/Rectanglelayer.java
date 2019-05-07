import java.util.Scanner;

public class Rectanglelayer {
     double width,height;
     public Rectanglelayer(){

     }
     public Rectanglelayer(double width,double height){
         this.height = height;
         this.width = width;
     }
     public double getArea(){
         return this.height * this.width ;
     }
     public double getPerimeter(){
         return 2*(this.width +  this.width);
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)  ;
        System.out.println("Enter width and height :");
        System.out.println("Enter width : ");
        double width = scanner.nextDouble();
        System.out.println("Enter height : ");
        double height = scanner.nextDouble();
        Rectanglelayer rectangle = new Rectanglelayer(width,height);
        System.out.println("Perimeter of Rectangle is :" +rectangle.getPerimeter());
        System.out.println("Area of Rectangle is : " + rectangle.getArea());
    }
}
