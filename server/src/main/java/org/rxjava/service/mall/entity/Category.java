package org.rxjava.service.mall.entity;

import lombok.Data;
import org.rxjava.service.mall.status.CategoryStatus;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

import static org.springframework.data.mongodb.core.index.IndexDirection.DESCENDING;

/**
 * @author happy 2019-03-17 23:22
 */
@Data
@Document
public class Category {
    /**
     * ID
     */
    @Id
    private String id;
    /**
     * 名称
     */
    @TextIndexed
    private String name;
    /**
     * 描述
     */
    private String desc;
    /**
     * 分类状态
     */
    @Indexed
    private String status = CategoryStatus.NORMAL.name();
    /**
     * 缩略图
     */
    private Image thumb;
    /**
     * 创建日期
     */
    @CreatedDate
    @Indexed(direction = DESCENDING)
    private LocalDateTime createDate;
    /**
     * 更新日期
     */
    @LastModifiedDate
    private LocalDateTime updateDate;
}
