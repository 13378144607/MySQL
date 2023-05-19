package task01.practice1;
//0434220117
//李睿轩
public class A {
	public static void main(String[] args) {
        // 测试Lader类
        Lader lader = new Lader(2, 4, 3);
        System.out.println("梯形的面积为：" + lader.getArea());

        // 测试Circle类
        Circle circle = new Circle(5);
        System.out.println("圆的周长为：" + circle.getPerimeter());
        System.out.println("圆的面积为：" + circle.getArea());
    }
}
