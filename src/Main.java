public class Main {

    public static void main(String[] args) {
	    Circle c1 = new Circle();
	    Circle c2 = new Circle(2);
        c2.setColor("blue");
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());

    }
}
