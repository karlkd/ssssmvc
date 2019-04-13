
import com.wlqq.he.controller.commom.ResDate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import com.wlqq.he.controller.commom.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class test {

//    @Autowired
//    Mock mock;
//
    @Autowired
    private etest etest;

    @Autowired
    private server server;
    @Autowired
    private ResDate resDate;

    @Mock
    @Autowired
    private TestMo testMo;

    @Before
    public void setup(){

    }

    @Test
    public void tt2(){
        ResDate resDate = Mockito.mock(ResDate.class);
        Mockito.when(resDate.getCode()).thenReturn("1231313");
        System.out.println(resDate.getCode());
    }

    @Test
    public void tt3(){
        Mockito.when(testMo.t1()).thenReturn("55555");
        System.out.println(testMo.t1());
    }


    @Test
    public void tt(){
        System.out.println(etest.tt1("aa","bb"));
        server.setAa("asd");
        System.out.println(server.getAa());

    }



}
