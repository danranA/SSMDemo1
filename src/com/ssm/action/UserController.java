package com.ssm.action;
import com.ssm.domain.Dept;
import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@Controller
@RequestMapping("/action/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUsers")//查找所有数据
    public ModelAndView findUsers() {
        User user=new User();
        List<User> users = userService.findUsersByCondition(1);
        return new ModelAndView("/WEB-INF/manager/user/find.jsp","users", users);
    }

}