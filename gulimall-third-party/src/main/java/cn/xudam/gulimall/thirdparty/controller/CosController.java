package cn.xudam.gulimall.thirdparty.controller;

import cn.xudam.common.utils.R;
import cn.xudam.gulimall.thirdparty.entity.CosInfo;
import com.tencent.cloud.CosStsClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 鸣
 * 2020/5/3 10:20
 */
@RestController
public class CosController {


    CosInfo cosInfo;
    @Autowired
    public void setCosInfo(CosInfo cosInfo) {
        this.cosInfo = cosInfo;
    }

    @RequestMapping("/oss/policy")
    public R policy(){
        TreeMap<String, Object> config = new TreeMap<String, Object>();

        try {

            // 云 API 密钥 secretId
            config.put("secretId", cosInfo.getSecretId());
            // 云 API 密钥 secretKey
            config.put("secretKey", cosInfo.getSecretKey());

            // 临时密钥有效时长，单位是秒
            config.put("durationSeconds", 1800);

            // 换成你的 bucket
            config.put("bucket", cosInfo.getBucket());
            // 换成 bucket 所在地区
            config.put("region", cosInfo.getRegion());

            // 这里改成允许的路径前缀，可以根据自己网站的用户登录态判断允许上传的具体路径，
            // 例子： a.jpg 或者 a/* 或者 * (使用通配符*存在重大安全风险, 请谨慎评估使用)
            config.put("allowPrefix", "*");

            // 密钥的权限列表。简单上传和分片需要以下的权限，其他权限列表请看 https://cloud.tencent.com/document/product/436/31923
            String[] allowActions = new String[] {
                    // 简单上传
                    "name/cos:PutObject",
                    // 表单上传
                    "name/cos:PostObject",
                    // 分片上传： 初始化分片
                    "name/cos:InitiateMultipartUpload",
                    // 分片上传： 查询 bucket 中未完成分片上传的UploadId
                    "name/cos:ListMultipartUploads",
                    // 分片上传： 查询已上传的分片
                    "name/cos:ListParts",
                    // 分片上传： 上传分片块
                    "name/cos:UploadPart",
                    // 分片上传： 完成分片上传
                    "name/cos:CompleteMultipartUpload"
            };
            config.put("allowActions", allowActions);
            // 请求临时密钥信息
            return R.ok().put("data", CosStsClient.getCredential(config).toMap());
        } catch (Exception e) {
            // 请求失败，抛出异常
            throw new IllegalArgumentException("no valid secret !");
        }
    }
}
