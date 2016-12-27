package com.ssm.action;
import com.ssm.domain.Dept;
import com.ssm.domain.Emp;
import com.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/action/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/showAllDepts")//用户登录显示所有数据
    public ModelAndView showAllDepts(){
        List<Dept> depts = deptService.findDeptsByCondition(null);
        return  new ModelAndView("/deptShow.jsp","depts",depts);
    }
    @RequestMapping("/findDepts")//查找所有数据
    public ModelAndView findDepts() {
        List<Dept> depts = deptService.findDeptsByCondition(null);
                return new ModelAndView("/WEB-INF/manager/goods/find.jsp","depts", depts);
            }

    @RequestMapping(value = "/findDeptsBy",method = {RequestMethod.POST,RequestMethod.GET})//根据条件查找
    public ModelAndView findDeptsBy(Integer id){
     Dept dept =deptService.findDeptById(id);
        if(dept!=null){
            return new ModelAndView("/WEB-INF/manager/goods/find.jsp","dept",dept);
        }else
      return  null;
    }

    @RequestMapping("/addDepts")//添加数据
    public ModelAndView addDepts(@Validated Dept dept, BindingResult bindingResult) {
        List<Dept> depts = deptService.findDeptsByCondition(null);
        deptService.add(dept);
        ModelAndView mav=new ModelAndView("/WEB-INF/manager/goods/find.jsp","depts",depts);
        if(bindingResult.hasErrors()){
            String defaultMessage = bindingResult.getAllErrors().get(0).getDefaultMessage();
            System.out.println(defaultMessage);
            mav.addObject("error33",defaultMessage);

        }
        return mav;
    }


    @RequestMapping(value = "/editDept", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView editDept( @Validated Dept dept,int deptno,BindingResult bindingResult) throws Exception {
        List<Dept> depts = deptService.findDeptsByCondition(null);
         deptService.update(deptno,dept);
        ModelAndView mav=new ModelAndView("/WEB-INF/manager/goods/find.jsp","depts",depts);
        if(bindingResult.hasErrors()){
            String defaultMessage = bindingResult.getAllErrors().get(0).getDefaultMessage();
            System.out.println(defaultMessage);
            mav.addObject("error33",defaultMessage);

        }
        return mav;
    }


    @RequestMapping(value = "/deleteDept" ,method = {RequestMethod.POST})//根据Id删除数据
    public ModelAndView deleteDept(Integer id){
                deptService.deleteBy(id);
        return  new ModelAndView("/WEB-INF/manager/goods/find.jsp");
    }


}
