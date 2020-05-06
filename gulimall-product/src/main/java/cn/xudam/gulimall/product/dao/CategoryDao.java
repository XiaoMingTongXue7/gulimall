package cn.xudam.gulimall.product.dao;

import cn.xudam.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-21 21:42:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
