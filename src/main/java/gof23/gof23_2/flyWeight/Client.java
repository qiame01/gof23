package gof23.gof23_2.flyWeight;

import org.junit.Test;

/**
 * 享元模式 FlyWeight (故也叫苍蝇量模式)
 * 使用场景：String常量池、Integer源码、各种池技术，如数据库连接池、线程池
 * 优点：实现相同对象的复用，极大节省内存
 * 结构角色流程：客户端、享元工厂、享元接口/抽象类、内部状态类（即享元类，存储内部状态，如棋子颜色）、外部状态类（存储外部状态，如棋子坐标）
 * 入门案例：1不同位置上（外部状态）的不同颜色（内部状态）的棋子。2不同用户（外部状态）访问不同类型（内部状态）的网站
 * 缺点：为了读取分离出的外部状态，运行时间变长，以时间换了空间
 * 备注：
 * 掌握享元模式的关键，是能够抽象出事物的内外两种状态
 * 内部状态：可以共享，不随环境变化，即系统中享元类的属性，如棋子颜色等属性，所有内部状态单独成类
 * 外部状态：不可以共享，不随环境变化，即系统中非享元类的属性，如棋子的坐标，所有外部状态单独成类
 * 创建享元类对象后，不可再次进行修改
 * 外部状态是善变的，故必须独立于内部状态，单独设置
 */
public class Client {
    @Test
    public void test() {
        // 创建享元类对象后，不可再次进行修改。下面虽然又试图创建新的白色，但实际只创建了一个，达到了节省内存的目的
        GoPiece goPiece1 = FlyWeightFactory.getGoPiece("黑色");
        GoPiece goPiece2 = FlyWeightFactory.getGoPiece("白色");
        GoPiece goPiece3 = FlyWeightFactory.getGoPiece("白色");

        System.out.println("goPiece2 与 goPiece3是同一个对象吗？" + (goPiece2 == goPiece3));
        System.out.println("池中的棋子数量为：" + FlyWeightFactory.getCount());

        // 外部状态是善变的，故必须独立于内部状态，单独设置
        goPiece1.display(new Coordinate(10, 20));
        goPiece2.display(new Coordinate(30, 40));
        goPiece3.display(new Coordinate(50, 60));
        /*
            池中的棋子数量为：2
            棋子颜色：黑色，坐标：(10,20)
            棋子颜色：白色，坐标：(30,40)
            棋子颜色：白色，坐标：(50,60)
         */
    }
}
