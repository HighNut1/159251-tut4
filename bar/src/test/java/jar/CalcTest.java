package jar;

import static org.junit.jupiter.api.Assertions.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalcTest {
    public void testadd(){
        Calc x =new Calc();
        int add1 = x.add(1,2);
assertEquals(3,add1);
    }

}