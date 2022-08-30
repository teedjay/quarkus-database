package com.teedjay;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    record Person (Integer id, String name) { }

    @Select("select * from person")
    List<Person> all();

    @Select("select * from person where id = #{id}")
    Person byId(Integer id);

}
