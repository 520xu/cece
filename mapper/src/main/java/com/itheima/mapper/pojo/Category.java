package com.itheima.mapper.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 * 商品三级分类
 * 
 * @author luoben
 * @email luoben@gmail.com
 * @date 2020-05-19 14:48:18
 */
@Data
@Table(name = "pms_category")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分类id
	 */
	@Id
	private Long catId;
	/**
	 * 分类名称
	 */
	private String name;
	/**
	 * 父分类id
	 */
	private Long parentCid;
	/**
	 * 层级
	 */
	private Integer catLevel;
	/**
	 * 是否显示[0-不显示，1显示]
	 * @TableLogic(value,delval)
	 * value； 逻辑未删除值
	 * delval： 逻辑删除值
	 */
	private Integer showStatus;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 图标地址
	 */
	private String icon;
	/**
	 * 计量单位
	 */
	private String productUnit;
	/**
	 * 商品数量
	 */
	private Integer productCount;

	//序列化规则：不为空才有该字段

}
