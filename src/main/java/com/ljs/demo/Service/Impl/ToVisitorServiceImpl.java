package com.ljs.demo.Service.Impl;

import com.ljs.demo.Service.ToVisitorService;
import com.ljs.demo.pojo.domain.ToVisitor;
import com.ljs.demo.pojo.mapper.ToVisitorMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ToVisitorServiceImpl implements ToVisitorService {

    @Autowired
    ToVisitorMapper toVisitorMapper;

    @Override
    public ToVisitor selectByPrimaryKey(Integer id) {
        return toVisitorMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ToVisitor> selectList() {
        return toVisitorMapper.selectList();
    }
}
