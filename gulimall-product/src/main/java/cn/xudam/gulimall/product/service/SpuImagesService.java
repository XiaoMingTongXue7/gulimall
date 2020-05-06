package cn.xudam.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xudam.common.utils.PageUtils;
import cn.xudam.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-21 21:42:50
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

