package com.imooc.service;

import com.imooc.pojo.Stu;

import java.util.List;

/**
 * Created by LuoboGan
 * Date:2020/12/8
 */
public interface StuService {

    public Stu getStuInfo(int id);

    public List<Stu> findAll();

    public void saveStu();

    public void updateStu(int id);

    public void deleteStu(int id);

}
