package gof23.gof23_3.responsibilityChain;

/**
 * 请求类：封装请求信息
 */
public class Request {
    private String name;
    private String reason;
    private String days;
    private int requestLevel;

    public Request() {
    }

    public Request(String name, String reason, String days) {
        this.name = name;
        this.reason = reason;
//        this.days = days;
        setDays(days);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDays() {
        return days;
    }

    // 根据请假天数，确定请求的等级(以匹配相应的等级的处理者)
    public void setDays(String days) {
        this.days = days;
        if (Integer.valueOf(days) <= 3) {
            setRequestLevel(1);
            return;
        }
        if (Integer.valueOf(days) > 3 && Integer.valueOf(days) <= 6) {
            setRequestLevel(2);
            return;
        }
        setRequestLevel(3);
    }

    public int getRequestLevel() {
        return requestLevel;
    }

    public void setRequestLevel(int requestLevel) {
        this.requestLevel = requestLevel;
    }
}
