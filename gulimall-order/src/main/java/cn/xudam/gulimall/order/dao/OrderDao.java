package cn.xudam.gulimall.order.dao;

import cn.xudam.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-22 22:07:10
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
