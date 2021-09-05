package gof23.gof23_3.template;

import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test(){
        Template template = new ConcteteTemplate();
        template.templateMethod();
    }
}
