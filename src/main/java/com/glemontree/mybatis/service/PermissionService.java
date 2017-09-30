package com.glemontree.mybatis.service;

import com.glemontree.mybatis.bean.Permission;
import com.glemontree.mybatis.dao.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    public Permission selectById(Integer id) {
        return permissionMapper.selectById(id);
    }
}
