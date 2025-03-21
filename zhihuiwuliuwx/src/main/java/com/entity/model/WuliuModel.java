package com.entity.model;

import com.entity.WuliuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 物流信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WuliuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 物流公司
     */
    private String wuliuCourierName;


    /**
     * 物流单号
     */
    private String wuliuCourierNumber;


    /**
     * 物流路线
     */
    private String wuliuText;


    /**
     * 物流详情
     */
    private String wuliuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
