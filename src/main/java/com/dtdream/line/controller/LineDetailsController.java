package com.dtdream.line.controller;

import com.dtdream.line.service.LineDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 线路controller
 */
@RestController
public class LineDetailsController {
    @Autowired
    LineDetailsService lineDetailsService;
}
