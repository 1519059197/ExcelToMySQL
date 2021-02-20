package com.example.demo.service;

import com.example.demo.entity.FileInfo;
import com.example.demo.entity.tTumorData;

import java.util.List;

/**
 * @Classname TestService
 * @Description TODO
 * @Date 2021-02-02 15:12
 * @Author by qgc
 */
public interface TestService {
    List<tTumorData> query();

    void add(List<tTumorData> students);

    void addData(List<FileInfo> fileInfo);
}
