public class Rectangle {
    int a, b;
    //method to insert length and breadth
    public void inserMethod(int l, int b) {
        a = l;
        this.b = b;
        System.out.println("length of rectangle is " + l + "\n Breadth of rectangle is " + b);
    }
    //method to display area
    public void displayMethod() {
        System.out.println("Area of this rectangle is " + a*b);
    }
    public static void main(String args[]) throws Exception
    {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();
        obj1.inserMethod(10,20);
        obj1.displayMethod();
        obj2.inserMethod(1,2);
        obj2.displayMethod();
    }
}
