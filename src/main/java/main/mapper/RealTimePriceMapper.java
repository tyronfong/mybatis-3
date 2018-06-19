package main.mapper;

import org.apache.ibatis.annotations.Select;

public interface RealTimePriceMapper {
    @Select("select * from real_time_price where id=#{id}")
    RealTimePrice getPriceById(int id);
}
