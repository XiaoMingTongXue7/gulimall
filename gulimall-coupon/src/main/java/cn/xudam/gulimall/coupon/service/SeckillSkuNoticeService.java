package cn.xudam.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xudam.common.utils.PageUtils;
import cn.xudam.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-22 23:10:06
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

