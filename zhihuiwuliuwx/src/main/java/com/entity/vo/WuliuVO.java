package com.entity.vo;

import com.entity.WuliuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 物流信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wuliu")
public class WuliuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 物流公司
     */

    @TableField(value = "wuliu_courier_name")
    private String wuliuCourierName;


    /**
     * 物流单号
     */

    @TableField(value = "wuliu_courier_number")
    private String wuliuCourierNumber;


    /**
     * 物流路线
     */

    @TableField(value = "wuliu_text")
    private String wuliuText;


    /**
     * 物流详情
     */

    @TableField(value = "wuliu_content")
    private String wuliuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：物流公司
	 */
    public String getWuliuCourierName() {
        return wuliuCourierName;
    }


    /**
	 * 获取：物流公司
	 */

    public void setWuliuCourierName(String wuliuCourierName) {
        this.wuliuCourierName = wuliuCourierName;
    }
    /**
	 * 设置：物流单号
	 */
    public String getWuliuCourierNumber() {
        return wuliuCourierNumber;
    }


    /**
	 * 获取：物流单号
	 */

    public void setWuliuCourierNumber(String wuliuCourierNumber) {
        this.wuliuCourierNumber = wuliuCourierNumber;
    }
    /**
	 * 设置：物流路线
	 */
    public String getWuliuText() {
        return wuliuText;
    }


    /**
	 * 获取：物流路线
	 */

    public void setWuliuText(String wuliuText) {
        this.wuliuText = wuliuText;
    }
    /**
	 * 设置：物流详情
	 */
    public String getWuliuContent() {
        return wuliuContent;
    }


    /**
	 * 获取：物流详情
	 */

    public void setWuliuContent(String wuliuContent) {
        this.wuliuContent = wuliuContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
