package com.entity.vo;

import com.entity.SijiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 司机
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("siji")
public class SijiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 司机名称
     */

    @TableField(value = "siji_name")
    private String sijiName;


    /**
     * 联系方式
     */

    @TableField(value = "siji_phone")
    private String sijiPhone;


    /**
     * 邮箱
     */

    @TableField(value = "siji_email")
    private String sijiEmail;


    /**
     * 司机头像
     */

    @TableField(value = "siji_photo")
    private String sijiPhoto;


    /**
     * 司机类型
     */

    @TableField(value = "siji_types")
    private Integer sijiTypes;


    /**
     * 司机介绍
     */

    @TableField(value = "siji_content")
    private String sijiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "data_delete")
    private Integer dataDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：司机名称
	 */
    public String getSijiName() {
        return sijiName;
    }


    /**
	 * 获取：司机名称
	 */

    public void setSijiName(String sijiName) {
        this.sijiName = sijiName;
    }
    /**
	 * 设置：联系方式
	 */
    public String getSijiPhone() {
        return sijiPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setSijiPhone(String sijiPhone) {
        this.sijiPhone = sijiPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getSijiEmail() {
        return sijiEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setSijiEmail(String sijiEmail) {
        this.sijiEmail = sijiEmail;
    }
    /**
	 * 设置：司机头像
	 */
    public String getSijiPhoto() {
        return sijiPhoto;
    }


    /**
	 * 获取：司机头像
	 */

    public void setSijiPhoto(String sijiPhoto) {
        this.sijiPhoto = sijiPhoto;
    }
    /**
	 * 设置：司机类型
	 */
    public Integer getSijiTypes() {
        return sijiTypes;
    }


    /**
	 * 获取：司机类型
	 */

    public void setSijiTypes(Integer sijiTypes) {
        this.sijiTypes = sijiTypes;
    }
    /**
	 * 设置：司机介绍
	 */
    public String getSijiContent() {
        return sijiContent;
    }


    /**
	 * 获取：司机介绍
	 */

    public void setSijiContent(String sijiContent) {
        this.sijiContent = sijiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getDataDelete() {
        return dataDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setDataDelete(Integer dataDelete) {
        this.dataDelete = dataDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
