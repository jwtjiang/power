package com.dtdream.line.service.serviceImpl;

import com.dtdream.line.dao.LineDetailsMapper;
import com.dtdream.line.service.LineDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LineDetailsServiceImpl implements LineDetailsService{
    @Autowired
    LineDetailsMapper lineDetailsMapper;
}
