package com.dtdream.model.service.serviceImpl;

import com.dtdream.model.dao.ModelMapper;
import com.dtdream.model.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ModelServiceImpl implements ModelService{
    @Autowired
    ModelMapper modelMapper;
}
