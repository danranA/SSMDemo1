import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.ssm.domain.Dept;
import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class UserServiceImplTest {
    public static void main(String[] args) {
        JSONArray array = new JSONArray();

        Dept dept1 = new Dept();
        dept1.setDeptno(123);
        dept1.setDname("123");
        dept1.setLoc("123");

        List<Dept> list = new ArrayList<>();

        list.add(dept1);

        String jsonString = JSON.toJSONString(list);

        System.out.println(jsonString);

    }


}
