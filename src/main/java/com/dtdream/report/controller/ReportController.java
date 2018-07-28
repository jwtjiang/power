package com.dtdream.report.controller;

import com.dtdream.pojo.Report;
import com.dtdream.report.service.ReportService;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
=======
import com.dtdream.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
>>>>>>> 7942b11a60b5f5a0ecd32a53572d0fd8e9ca9cb2
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lcl
 * @date 2018-07-28
 * @description 报表controller
 */
@RestController
@RequestMapping("/report")
@EnableAutoConfiguration
public class ReportController {
    @Resource
    ReportService reportService;

<<<<<<< HEAD
    /**
     * 报告管理页面的列表显示
     * @return
     */
=======
>>>>>>> 7942b11a60b5f5a0ecd32a53572d0fd8e9ca9cb2
    @RequestMapping("/getReportList")
    @ResponseBody
    public Map<String,Object> getReportList() {
        Map<String,Object> resultMap = new HashMap<>();
//        Map map = CommonUtil.JsonToMap(params);
//        if (StringUtils.isEmpty((String) map.get("pageNum"))) {
//            map.put("pageNum",1);
//        }
//        if (StringUtils.isEmpty((String) map.get("pageSize"))) {
//            map.put("pageSize",20);
//        }
        Map map = new HashMap();
        map.put("title","2");
<<<<<<< HEAD
        map.put("conformity","4");
        Integer count = reportService.queryCountByParam(map);
        System.out.println(count);


        List<Report> reportList = reportService.queryListByParam(map);
        System.out.println();
=======
        Integer count = reportService.queryCountByParam(map);
        System.out.println(count);
        List<Report> reportList = reportService.queryListByParam(map);

>>>>>>> 7942b11a60b5f5a0ecd32a53572d0fd8e9ca9cb2
        resultMap.put("count",count);
        resultMap.put("reportList",reportList);
        return resultMap;
    }
<<<<<<< HEAD


=======
>>>>>>> 7942b11a60b5f5a0ecd32a53572d0fd8e9ca9cb2
}
