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
 * 物流信息
 *
 * @author 
 * @email
 */
@TableName("wuliu")
public class WuliuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WuliuEntity() {

	}

	public WuliuEntity(T t) {
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
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 物流公司
     */
    @ColumnInfo(comment="物流公司",type="varchar(200)")
    @TableField(value = "wuliu_courier_name")

    private String wuliuCourierName;


    /**
     * 物流单号
     */
    @ColumnInfo(comment="物流单号",type="varchar(200)")
    @TableField(value = "wuliu_courier_number")

    private String wuliuCourierNumber;


    /**
     * 物流路线
     */
    @ColumnInfo(comment="物流路线",type="longtext")
    @TableField(value = "wuliu_text")

    private String wuliuText;


    /**
     * 物流详情
     */
    @ColumnInfo(comment="物流详情",type="longtext")
    @TableField(value = "wuliu_content")

    private String wuliuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：物流公司
	 */
    public String getWuliuCourierName() {
        return wuliuCourierName;
    }
    /**
	 * 设置：物流公司
	 */

    public void setWuliuCourierName(String wuliuCourierName) {
        this.wuliuCourierName = wuliuCourierName;
    }
    /**
	 * 获取：物流单号
	 */
    public String getWuliuCourierNumber() {
        return wuliuCourierNumber;
    }
    /**
	 * 设置：物流单号
	 */

    public void setWuliuCourierNumber(String wuliuCourierNumber) {
        this.wuliuCourierNumber = wuliuCourierNumber;
    }
    /**
	 * 获取：物流路线
	 */
    public String getWuliuText() {
        return wuliuText;
    }
    /**
	 * 设置：物流路线
	 */

    public void setWuliuText(String wuliuText) {
        this.wuliuText = wuliuText;
    }
    /**
	 * 获取：物流详情
	 */
    public String getWuliuContent() {
        return wuliuContent;
    }
    /**
	 * 设置：物流详情
	 */

    public void setWuliuContent(String wuliuContent) {
        this.wuliuContent = wuliuContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Wuliu{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", wuliuCourierName=" + wuliuCourierName +
            ", wuliuCourierNumber=" + wuliuCourierNumber +
            ", wuliuText=" + wuliuText +
            ", wuliuContent=" + wuliuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
