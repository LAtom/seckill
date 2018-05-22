/*
package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

*/
/*
配置spring和Junit整合,Junit启动时加载springioc容器
spring-test,junit
 *//*

@RunWith(SpringJUnit4ClassRunner.class )
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //实现Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() throws Exception {
        Date killTime=new Date();
        int updateCount=seckillDao.reduceNumber(1000,killTime);
        System.out.println("updateCount="+updateCount);
    }

    @Test
    public void queryById() throws Exception{
        */
/*
        Preparing:
        update
        seckill
        set number=number-1
        where seckill_id = ?
        and start_time <= ?
        and end_time >= ?
        and number >0 ;
         *//*

        long id=1000;
        Seckill seckill=seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void queryAll() throws Exception {
        //Caused by: org.apache.ibatis.binding.BindingException:
        // Parameter 'offet' not found. Available parameters are [1, 0, param1, param2]
        //List<Seckill> queryAll(int offet,int limit);
        //java没有保存形参的记录:queryAll(int offet,int limit)->queryAll(arg0,arg1)

        List<Seckill> seckills=seckillDao.queryAll(0,100);
        for(Seckill seckill:seckills){
            System.out.println(seckill);
        }
    }
}*/
