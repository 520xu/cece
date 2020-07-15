package com.itheima.mapper.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品评价回复关系
 * 
 * @author luoben
 * @email luoben@gmail.com
 * @date 2020-05-19 14:48:18
 */
@Data
@Table(name = "pms_comment_replay")
public class CommentReplay implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@Id
	private Long id;
	/**
	 * 评论id
	 */
	private Long commentId;
	/**
	 * 回复id
	 */
	private Long replyId;

}
