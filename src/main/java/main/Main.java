package main;

import main.mapper.RealTimePrice;
import main.mapper.RealTimePriceMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String resource = "main/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            RealTimePriceMapper mapper = session.getMapper(RealTimePriceMapper.class);
            RealTimePrice realTimePrice = mapper.getPriceById(11);
            RealTimePrice realTimePrice1 = mapper.getPriceById(11);

        } finally {
            session.close();
        }
    }
}
