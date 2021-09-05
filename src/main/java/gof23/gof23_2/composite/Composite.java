package gof23.gof23_2.composite;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 组合模式
 * 地位：其他设计模式几乎离不开组合模式
 * 三种常见方式
 */
public class Composite {
    User user;

    List<User> list = new ArrayList<>();

    Map<String, User> map = new HashMap<>();


}

class User { }
