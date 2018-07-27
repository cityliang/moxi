package com.moxi.service;

import com.moxi.model.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminService {

    @Select("SELECT * FROM `moxi`.`admin` where userName = #{userName} and password = #{password} and state = 1;")
    Admin findByNameAndPassword(Admin admin);

    @Insert("INSERT INTO `moxi`.`admin` (`id`, `userName`, `password`, `realName`, `age`, `phoneNumber`, `headPicture`, `addDate`, `updateDate`, `state`) VALUES (null, #{userName}, #{password}, #{realName}, #{age}, #{phoneNumber}, #{headPicture}, now(), now(), 1);")
    int insert(Admin admin);

}
