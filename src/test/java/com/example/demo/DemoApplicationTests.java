package com.example.demo;

import com.example.demo.entity.FileInfo;
import com.example.demo.entity.tTumorData;
import com.example.demo.service.TestService;
import com.github.crab2died.ExcelUtils;
import com.github.crab2died.exceptions.Excel4JException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    void contextLoads() throws Excel4JException, IOException {
        String path = "C:\\test\\breast_cancer_data.xls";
        List<tTumorData> students = ExcelUtils.getInstance().readExcel2Objects(path, tTumorData.class, 0, 0);
        testService.add(students);
        System.out.println(students);
    }

    @Test
    void test01() throws Excel4JException, IOException {
        String path = "C:\\Users\\Administrator\\Desktop\\a.xls";
        List<FileInfo> fileInfo = ExcelUtils.getInstance().readExcel2Objects(path, FileInfo.class, 0, 0);
        testService.addData(fileInfo);
        System.out.println(fileInfo);
    }

}
