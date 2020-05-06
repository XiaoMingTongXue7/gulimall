package cn.xudam.gulimall.product.entity;

import cn.xudam.common.valid.AddGroup;
import cn.xudam.common.valid.UpdateGroup;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author xudam
 * @email xudam7@163.com
 * @date 2020-04-21 21:42:51
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	@NotNull(message = "修改时品牌id不能为空", groups = {UpdateGroup.class})
	@Null(message = "新增品牌时不能携带Id", groups = {AddGroup.class})
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "新增时品牌名不能为空", groups = {AddGroup.class})
	private String  name;
	/**
	 * 品牌logo地址
	 */
	@NotEmpty(message = "新增时品牌logo地址不能为空", groups = {AddGroup.class})
	@URL(message = "logo必须是一个合法的url地址", groups = {AddGroup.class, UpdateGroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@NotNull(message = "新增时显示状态不能为空", groups = {AddGroup.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@NotEmpty(message = "新增时首字母不能为空", groups = {AddGroup.class})
	@Pattern(regexp = "/^[a-zA-Z]$/", message = "检索首字母必须是一个字母", groups = {AddGroup.class, UpdateGroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull(message = "新增时排序不能为空", groups = {AddGroup.class})
	@Min(value = 0, message = "排序必须大于等于0", groups = {AddGroup.class, UpdateGroup.class})
	private Integer sort;

}
