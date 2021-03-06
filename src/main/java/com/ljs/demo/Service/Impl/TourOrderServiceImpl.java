package com.ljs.demo.Service.Impl;

import com.ljs.demo.Service.TourOrderService;
import com.ljs.demo.pojo.domain.Tourorder;
import com.ljs.demo.pojo.mapper.TourorderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TourOrderServiceImpl implements TourOrderService {

    @Autowired
    TourorderMapper tourorderMapper;

    @Override
    public Tourorder selectByPrimaryKey(Integer id) {
        return tourorderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Tourorder> queryOrderByTourUid(String uuid) {
        return tourorderMapper.queryOrderByTourUid(uuid);
    }

    @Override
    public int passOrder(Integer id) {
        return tourorderMapper.passOrder(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tourorderMapper.deleteByPrimaryKey(id);
    }
}
