package gof23.gof23_3.iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用场景：
 * 迭代器模式是与集合共生共死的，一般来说，我们只要实现一个集合，就需要同时提供这个集合的迭代器，就像java中的Collection，List、Set、Map等，这些集合都有自己的迭代器。假如我们要自定义一个这样的新的容器a，为了遍历a里的数据，就需要给我们的容器a准备一个迭代器。这就会用到迭代器模式。
 * <p>
 * 优点：1隐藏内部遍历细节 2 ***
 * 结构角色职责：
 * 迭代器接口。定义了next。hasNext。Remove等方法（容器和迭代器都可以有remove方法）
 * 迭代器实现类
 * 容器接口。定义了add、remove、获取迭代器方法iterater。
 * 容器实现类a：iterater()需要一个容器（数组或list）作为参数给迭代器的构造方法（数据容器就是这样传递给迭代器的）。因此需要在a中组合一个容器对象
 * <p>
 * 流程：
 * 入门案例：学院和部门
 * 缺点：***
 * <p>
 * 应用举例：***
 * 对比：***
 * <p>
 * 备注：
 * 由于集合和迭代是如此重要和如此紧密。以至于所有的语言都天然实现了迭代器模式。我们只需用它们提供的api即可。但为了弄清楚它的原理。下面我们演示自己实现一下迭代器模式。非常简单。注意下jdk实现和自己实现这两种方式，有一个很小的不同。就是jdk中的容器接口角色(即collection接口)的实现类(即arraylist.hashset等)使用的底层容器是数组(其实集合容器建立在数组容器为基础上。即集合的底层就是数组)。而我们自定义演示中的容器接口的实现类使用的底层容器既可以是已经被jdk实现的现成的list等集合，也可以像jdk那样也使用数组。这里我们为了让大家看清楚，故写了两个容器接口的实现类。一个底层用数组，另一个底层用jdk集合。
 * <p>
 * 核心理解。数据存放在容器。那怎么把数据从容器中传送到迭代器里面去遍历呢？需要在容器里组合一个迭代器。
 * 由于容器与迭代器的关系太密切了，所以大多数语言在实现容器的时候都给提供了迭代器，并且这些语言提供的容器和迭代器在绝大多数情况下就可以满足我们的需要，所以现在需要我们自己去实践迭代器模式的场景还是比较少见的，我们只需要使用每种语言中已有的容器和迭代器就可以了。
 */
public class Client {

    @Test
    public void test() {
        // 遍历第一个容器
        ACollege aCollege = new ACollege();
        Iterator iterator = aCollege.iterator();
        System.out.println(String.format(aCollege.getName() + "======"));
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }

        // 遍历第二个容器
        BCollege bCollege = new BCollege();
        Iterator iterator2 = bCollege.iterator();
        System.out.println(String.format(bCollege.getName() + "======"));
        while (iterator2.hasNext()) {
            Department department = (Department) iterator2.next();
            System.out.println(department.getName());
        }


    }
}
