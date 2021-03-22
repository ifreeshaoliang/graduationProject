package com.allen.dao;

import com.allen.pojo.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsMapper {
    @Insert("insert into goods(goodsName,goodsPrice,goodsRegion," +
                "goodsWeight,goodsCapacity,goodsProductionYear," +
                "goodsStorageMethod,goodsCategory, goodsShelfLife) " +
            "values (#{goodsName},#{goodsPrice},#{goodsRegion}," +
                "#{goodsWeight},#{goodsCapacity},#{goodsProductionYear}," +
                "#{goodsStorageMethod},#{goodsCategory},#{goodsShelfLife})")
    int addGoods(Goods goods);

    @Delete("delete from goods where goodsID = #{goodsID}")
    int deleteGoods(int id);

    @Update("update goods set goodsName=#{goodsName},goodsPrice=#{goodsPrice}," +
            "goodsRegion=#{goodsRegion},goodsWeight=#{goodsWeight}," +
            "goodsCapacity=#{goodsCapacity},goodsProductionYear=#{goodsProductionYear}," +
            "goodsStorageMethod=#{goodsStorageMethod},goodsShelfLife=#{goodsShelfLife} " +
            "where goodsID = #{goodsID}")
    int updateGoods(Goods goods);

    @Select("select * from goods where goodsID = #{goodsID}")
    Goods queryGoodsByID(int id);

    @Select("select * from goods")
    List<Goods> queryAllGoods();
}
