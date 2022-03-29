
public class ShapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape donut = new Circle(10);// 반지름이 10인 원 객체(업캐스팅)
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}

}
