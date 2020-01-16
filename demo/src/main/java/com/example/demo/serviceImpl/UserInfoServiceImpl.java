package com.example.demo.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserInfoDao;
import com.example.demo.entity.UserInfoEntity;
import com.example.demo.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional //开启事务
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao , UserInfoEntity> implements UserInfoService {
}
