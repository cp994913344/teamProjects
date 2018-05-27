package com.ljs.demo.Service.Impl;

import com.ljs.demo.Service.VisitorServcie;
import com.ljs.demo.common.constant.GetUuid;
import com.ljs.demo.pojo.domain.Visitor;
import com.ljs.demo.pojo.mapper.VisitorMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VisitorServiceImpl implements VisitorServcie {

    @Autowired
    VisitorMapper visitorMapper;

    @Override
    public Visitor selectByPrimaryKey(Integer visitorid) {
        return visitorMapper.selectByPrimaryKey(visitorid);
    }

    @Override
    public Visitor login(String phone, String password) {
        return visitorMapper.login(phone,password);
    }

    @Override
    public int register(Visitor visitor) {
        return visitorMapper.insert(visitor);
    }

    @Override
    public int updateInfo(Visitor visitor,Integer visitorid) {
        return visitorMapper.updateByPrimaryKey(visitor,visitorid);
    }
}
