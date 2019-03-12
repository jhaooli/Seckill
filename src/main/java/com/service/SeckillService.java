package com.service;

import com.dto.Exposer;
import com.dto.SeckillExecution;
import com.entity.Seckill;

import java.util.List;

/**
* @Description:    秒杀服务接口
* @Author:         jhao
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface SeckillService {
    /**
     * 查询所有秒杀记录
     *
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启时输出秒杀接口地址，否则输出系统时间和秒杀时间
     *
     * @param seckillId
     * @return
     */
    Exposer exportSeckillUrl(long seckillId);



    /**
     * 执行秒杀操作
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return
     */
    SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5)
            throws Exception;
}
