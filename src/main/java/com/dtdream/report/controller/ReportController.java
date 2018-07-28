package com.dtdream.report.controller;


import com.dtdream.pojo.Report;
import com.dtdream.report.service.ReportService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
    /**
     * 报告管理页面的列表显示
     * @return
     */
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
        map.put("conformity","4");
        Integer count = reportService.queryCountByParam(map);
        System.out.println(count);

        List<Report> reportList = reportService.queryListByParam(map);
        System.out.println();

        resultMap.put("count",count);
        resultMap.put("reportList",reportList);
        return resultMap;
    }
}
