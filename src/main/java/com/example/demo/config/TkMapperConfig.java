package com.example.demo.config;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Classname TkMapperConfig
 * @Description TODO
 * @Date 2021-02-02 15:04
 * @Author by qgc
 */
public interface TkMapperConfig<T> extends Mapper<T>, InsertListMapper<T> {
}
