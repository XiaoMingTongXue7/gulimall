package cn.xudam.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xudam.common.utils.PageUtils;
import cn.xudam.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-22 22:07:09
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

