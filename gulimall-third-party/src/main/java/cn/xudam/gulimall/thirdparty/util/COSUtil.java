package cn.xudam.gulimall.thirdparty.util;

import cn.xudam.gulimall.thirdparty.entity.CosInfo;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.region.Region;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 鸣
 * 2020/5/2 16:47
 */
@Configuration
public class COSUtil {


    CosInfo cosInfo;


    @Bean
    public CosInfo cosInfo(){
        cosInfo = new CosInfo();
        return cosInfo;
    }

    @Bean
    public COSClient getCosClient() {

        // 1 初始化用户身份信息（secretId, secretKey）。
        COSCredentials cred = new BasicCOSCredentials(cosInfo.getSecretId(), cosInfo.getSecretKey());
        // 2 设置 bucket 的区域, COS 地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
        // clientConfig 中包含了设置 region, https(默认 http), 超时, 代理等 set 方法, 使用可参见源码或者常见问题 Java SDK 部分。
        // https://gulimall-1300628930.cos.ap-nanjing.myqcloud.com
        Region r = new Region(cosInfo.getRegion());
        ClientConfig clientConfig = new ClientConfig(r);
        // 3 生成 cos 客户端。
        return new COSClient(cred, clientConfig);
    }
}
