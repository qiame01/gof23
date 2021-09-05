package gof23.gof23_2.flyWeight;

/**
 * 外部状态类，其状态不可共享，如这里的棋子坐标位置
 * 为外部状态提供成员变量进行存储
 */
public class Coordinate extends GoPiece{
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
