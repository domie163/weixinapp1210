package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 司机
 *
 * @author 
 * @email
 */
@TableName("siji")
public class SijiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SijiEntity() {

	}

	public SijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 司机名称
     */
    @ColumnInfo(comment="司机名称",type="varchar(200)")
    @TableField(value = "siji_name")

    private String sijiName;


    /**
     * 联系方式
     */
    @ColumnInfo(comment="联系方式",type="varchar(200)")
    @TableField(value = "siji_phone")

    private String sijiPhone;


    /**
     * 邮箱
     */
    @ColumnInfo(comment="邮箱",type="varchar(200)")
    @TableField(value = "siji_email")

    private String sijiEmail;


    /**
     * 司机头像
     */
    @ColumnInfo(comment="司机头像",type="varchar(200)")
    @TableField(value = "siji_photo")

    private String sijiPhoto;


    /**
     * 司机类型
     */
    @ColumnInfo(comment="司机类型",type="int(11)")
    @TableField(value = "siji_types")

    private Integer sijiTypes;


    /**
     * 司机介绍
     */
    @ColumnInfo(comment="司机介绍",type="longtext")
    @TableField(value = "siji_content")

    private String sijiContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "data_delete")

    private Integer dataDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：司机名称
	 */
    public String getSijiName() {
        return sijiName;
    }
    /**
	 * 设置：司机名称
	 */

    public void setSijiName(String sijiName) {
        this.sijiName = sijiName;
    }
    /**
	 * 获取：联系方式
	 */
    public String getSijiPhone() {
        return sijiPhone;
    }
    /**
	 * 设置：联系方式
	 */

    public void setSijiPhone(String sijiPhone) {
        this.sijiPhone = sijiPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getSijiEmail() {
        return sijiEmail;
    }
    /**
	 * 设置：邮箱
	 */

    public void setSijiEmail(String sijiEmail) {
        this.sijiEmail = sijiEmail;
    }
    /**
	 * 获取：司机头像
	 */
    public String getSijiPhoto() {
        return sijiPhoto;
    }
    /**
	 * 设置：司机头像
	 */

    public void setSijiPhoto(String sijiPhoto) {
        this.sijiPhoto = sijiPhoto;
    }
    /**
	 * 获取：司机类型
	 */
    public Integer getSijiTypes() {
        return sijiTypes;
    }
    /**
	 * 设置：司机类型
	 */

    public void setSijiTypes(Integer sijiTypes) {
        this.sijiTypes = sijiTypes;
    }
    /**
	 * 获取：司机介绍
	 */
    public String getSijiContent() {
        return sijiContent;
    }
    /**
	 * 设置：司机介绍
	 */

    public void setSijiContent(String sijiContent) {
        this.sijiContent = sijiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getDataDelete() {
        return dataDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setDataDelete(Integer dataDelete) {
        this.dataDelete = dataDelete;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Siji{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", sijiName=" + sijiName +
            ", sijiPhone=" + sijiPhone +
            ", sijiEmail=" + sijiEmail +
            ", sijiPhoto=" + sijiPhoto +
            ", sijiTypes=" + sijiTypes +
            ", sijiContent=" + sijiContent +
            ", dataDelete=" + dataDelete +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
