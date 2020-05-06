package cn.xudam.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xudam.common.utils.PageUtils;
import cn.xudam.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-22 22:12:49
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

