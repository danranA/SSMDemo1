package com.ssm.service.impl;

import com.ssm.domain.Dept;
import com.ssm.dao.DeptDao;
import com.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/21.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> findDeptsByCondition(Dept dept) {
        return deptDao.selectByCondition(dept);
    }

    @Override
    public Dept findDeptById(int id) {
        return deptDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public boolean add(Dept dept) {

        return deptDao.insert(dept )==1?true:false;
    }

    @Override
    public boolean update(int id, Dept dept) {
        dept.setDeptno(id);
        return deptDao.updateByPrimaryKeySelective(dept)==1?true:false;
    }

    @Override
    public boolean deleteBy(int id) {
        return deptDao.deleteByPrimaryKey(id)==1?true:false;
    }
}
