package cn.xudam.gulimall.thirdparty.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author 鸣
 * 2020/5/3 10:58
 */
public class CosInfo {


    @Value("${spring.cloud.cos.secretId}")
    private  String secretId;
    @Value("${spring.cloud.cos.secretKey}")
    private String secretKey;
    @Value("${spring.cloud.cos.region}")
    private String region;
    @Value("${spring.cloud.cos.bucket}")
    private String bucket;

    public String getSecretId() {
        return secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getRegion() {
        return region;
    }

    public String getBucket() {
        return bucket;
    }
}
