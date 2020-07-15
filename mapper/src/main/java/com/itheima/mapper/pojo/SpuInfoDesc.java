package com.itheima.mapper.pojo;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * spu信息介绍
 * 
 * @author luoben
 * @email luoben@gmail.com
 * @date 2020-05-19 14:48:18
 */
@Data
@Table(name = "pms_spu_info_desc")
public class SpuInfoDesc implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@Id
	private Long spuId;
	/**
	 * 商品介绍
	 */
	private String decript;

}
