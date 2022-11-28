package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GCMapper {
    @Select("SELECT id, name FROM public.gc_info")
    public List<GCInfo> getGCInfo();
}
