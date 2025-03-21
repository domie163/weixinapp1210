package com.entity.model;

import com.entity.SijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 司机
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SijiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 司机名称
     */
    private String sijiName;


    /**
     * 联系方式
     */
    private String sijiPhone;


    /**
     * 邮箱
     */
    private String sijiEmail;


    /**
     * 司机头像
     */
    private String sijiPhoto;


    /**
     * 司机类型
     */
    private Integer sijiTypes;


    /**
     * 司机介绍
     */
    private String sijiContent;


    /**
     * 逻辑删除
     */
    private Integer dataDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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

    }
