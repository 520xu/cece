package com.itheima.mapper.pojo;


import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 * 
 * @author luoben
 * @email luoben@gmail.com
 * @date 2020-05-19 14:48:18
 */
@Data
@Table(name = "pms_brand")
public class Brand implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@Id
	private Long brandId;
	/**
	 * 品牌名
	 */

	private String name;
	/**
	 * 品牌logo地址
	 */

	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */

	private Integer showStatus;
	/**
	 * 检索首字母
	 */

	private String firstLetter;
	/**
	 * 排序
	 */

	private Integer sort;

}
