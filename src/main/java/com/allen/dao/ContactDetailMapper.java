package com.allen.dao;

import com.allen.pojo.ContactDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface ContactDetailMapper {
    @Insert("insert into contactdetail(userID,address,phone) " +
            "values (#{userID}, #{address}, #{phone})")
    int addContactDetail(ContactDetail contactDetail);

    @Delete("delete from contactdetail where contactID = #{contactID} ")
    int deleteContactDetail(int id);

    @Update("update contactdetail " +
            "set userID=#{userID}, address=#{address}, phone=#{phone} " +
            "where contactID = #{contactID}")
    int updateContactDetail(ContactDetail contactDetail);

    @Select("select * from ContactDetail where contactID = #{contactID}")
    ContactDetail queryContactDetailByID(int id);

    @Select("select * from ContactDetail")
    List<ContactDetail> queryAllContactDetail();
}
