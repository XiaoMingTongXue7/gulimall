package cn.xudam.gulimall.member.dao;

import cn.xudam.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-22 21:54:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
