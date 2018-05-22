package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class )
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() {
        /*
        第一次: insertCount=1
        第二次: insertCount=0
         */
        long id=1001L;
        long phone=15651735029L;
        int insertCount = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println("insertCount="+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() {
        /*
        SuccessKilled{
        seckillId=1000,
        userPhone=15651735029,
        state=-1,
        createTime=Tue May 15 19:09:10 CST 2018}
        Seckill{
        seckillId=1000,
        name='1000元秒杀iPhone6,
         number=100,
         startTime=Mon May 14 00:00:00 CST 2018,
         endTime=Sun May 20 00:00:00 CST 2018,
         createTime=Mon May 14 23:21:23 CST 2018}
         */
        /*
        SuccessKilled{seckillId=1001,
        userPhone=15651735029,
        state=0,
        createTime=Tue May 15 19:24:40 CST 2018}
        Seckill{seckillId=1001,
        name='500元秒杀iPad2,
         number=200,
        startTime=Mon May 14 00:00:00 CST 2018,
         endTime=Sun May 20 00:00:00 CST 2018,
         createTime=Mon May 14 23:21:23 CST 2018}
         */
        long id=1001L;
        long phone=15651735029L;
        SuccessKilled successKilled=successKilledDao.queryByIdWithSeckill(id,phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }
}