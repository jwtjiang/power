package com.dtdream.report.service.serviceImpl;

import com.dtdream.pojo.Report;
import com.dtdream.report.dao.ReportMapper;
import com.dtdream.report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author lcl
 * @date 2018-07-27
 */
@Service
public class ReportServiceImpl implements ReportService{
    @Autowired
    ReportMapper reportMapper;

    @Override
    public int queryCountByParam(Map<String, Object> paramMap) {
        System.out.println("123456");
        return reportMapper.queryCountByParam(paramMap);
    }

    @Override
    public List<Report> queryListByParam(Map<String, Object> paramMap) {
        return reportMapper.queryListByParam(paramMap);
    }
}
