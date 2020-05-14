package com.lzh.mvc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author luozehua
 * @since 2019-03-14
 */
@TableName("sys_admin")
@Data
public class SysAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * PK
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 头像
     */
    @TableField("head_img")
    private String headImg;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;


    @Override
    public String toString() {
        return "SysAdmin{" +
        ", id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", status=" + status +
        ", headImg=" + headImg +
        ", createTime=" + createTime +
        "}";
    }
}
