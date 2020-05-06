package cn.xudam.gulimall.coupon.dao;

import cn.xudam.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-22 23:10:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
