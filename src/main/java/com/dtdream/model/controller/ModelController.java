package com.dtdream.model.controller;

import com.dtdream.model.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模型controller
 */
@RestController
public class ModelController {
    @Autowired
    ModelService modelService;
}
