public class dimentnsOfGeoShapes {
    /*Declare two integer variables as length and breadth and one double variable as height for storing the dimensions of
     the figures. Declare three double variables as sq_area, rec_area, tri_area for calculating the area of three figures
     (only if you want to return the value of area).
     Create three different methods as follow:
     area(int length)-- for area of square,
     area(int length, int breadth)-- for area of rectangle ,
     area(int breadth, double height)-- for area of triangle */
    public static void main(String[] args){
        int length = 10;
        int breadth = 5;
        double height = 5.75;  
        area(length);
        area(length, breadth);    
        area(breadth, height);
    }
    public static void area(int length){
        double area = length*length;
        System.out.println("The area of square is : "+area);
    }
    public static void area(int length,int breadth){
        double area = length*breadth;
        System.out.println("The area of rectangle is : "+area);
    }
    public static void area(int breadth,double height){
        double area = 0.5*breadth*height;
        System.out.println("The area of triangle is : "+area);
    }
}
