/*
package org.seckill.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;
import org.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
    "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"
        })
public class SeckillServiceImplTest {

    private final Logger logger=LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;

    @Test
    public void getSeckillList() {
        List<Seckill> list=seckillService.getSeckillList();
        logger.info("list={}",list);
    }

    @Test
    public void getById() {
        long id=1000;
        Seckill seckill=seckillService.getById(id);
        logger.info("seckill={}",seckill);

    }

    @Test
    //测试代码完整逻辑,注意课重复执行
    public void testSeckillLogic() {
        long id=1000;
        Exposer exposer=seckillService.exportSeckillUrl(id);
        if(exposer.isExposed()){
            logger.info("exposer={}",exposer);
            long phone=15651735029L;
            String md5=exposer.getMd5();
            try{
                SeckillExecution execution = seckillService.executeSeckill(id, phone, md5);
                logger.info("result={}",execution);
            }catch (RepeatKillException e){
                logger.error(e.getMessage(),e);
            }catch(SeckillException e1){
                logger.error(e1.getMessage(),e1);
            }
        }else{
            //秒杀未开启
            logger.warn("exposer:{}",exposer);
        }

        exposer=Exposer{
        exposed=true,
        md5='e3fe57ef26b2bde8bcbdbaf2e22d0b45',
         seckillId=1000,
          now=0,
          start=0,
           end=0}


    }

  @Test
    public void executeSeckill() {
        long id=1000;
        long phone=15651735027L;
        String md5="e3fe57ef26b2bde8bcbdbaf2e22d0b45";
        try{
            SeckillExecution execution = seckillService.executeSeckill(id, phone, md5);
            logger.info("result={}",execution);
        }catch (RepeatKillException e){
            logger.error(e.getMessage(),e);
        }catch(SeckillException e1){
            logger.error(e1.getMessage(),e1);
        }


        //org.seckill.exception.SeckillException: seckill data rewrite
        //result=SeckillExecution{seckillId=1000,
        // state=1, stateInfo='秒杀成功',
        // successKilled=SuccessKilled{seckillId=1000,

        // userPhone=15651735027, state=0,
        // createTime=Wed May 16 17:50:51 CST 2018}}


        //org.seckill.exception.RepeatKillException: seckill repeated
   // }
}
*/
