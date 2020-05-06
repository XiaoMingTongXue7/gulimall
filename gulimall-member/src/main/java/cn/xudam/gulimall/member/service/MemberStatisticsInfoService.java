package cn.xudam.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xudam.common.utils.PageUtils;
import cn.xudam.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-22 21:54:22
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

