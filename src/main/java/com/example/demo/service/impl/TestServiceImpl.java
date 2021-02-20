package com.example.demo.service.impl;

import com.example.demo.dao.FileInfoMapper;
import com.example.demo.dao.TestMapper;
import com.example.demo.entity.FileInfo;
import com.example.demo.entity.tTumorData;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname TestServiceImpl
 * @Description TODO
 * @Date 2021-02-02 15:12
 * @Author by qgc
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private FileInfoMapper fileInfoMapper;

    @Override
    public List<tTumorData> query() {
        return testMapper.selectAll();
    }

    @Override
    public void add(List<tTumorData> students) {
        testMapper.insertList(students);
    }

    @Override
    public void addData(List<FileInfo> fileInfo) {
        fileInfoMapper.insertList(fileInfo);
    }
}
