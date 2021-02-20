package com.example.demo.entity;

import com.github.crab2died.annotation.ExcelField;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Classname FileInfo
 * @Description TODO
 * @Date 2021-02-19 14:57
 * @Author by qgc
 */
@Table(name = "t_sys_file_info")
@Data
public class FileInfo {

    @Column
    @ExcelField(title = "originalFileName", order = 1)
    private String originalFileName;
    @Column
    @ExcelField(title = "realFileName", order = 1)
    private String realFileName;

}
