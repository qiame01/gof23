package gof23.gof23_2.flyWeight;

/**
 * 内部状态类，即享元类，可以共享状态，如这里的棋子
 * 为内部状态提供成员变量进行存储
 */
public class GoPiece implements Go {
    private String color;

    public GoPiece() {
    }

    public GoPiece(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println(String.format("棋子颜色：%s，坐标：(%s,%s)",
                color, coordinate.getX(), coordinate.getY()));
    }
}
