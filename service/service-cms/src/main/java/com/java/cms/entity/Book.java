package com.java.cms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "cms_book")
@EntityListeners(AuditingEntityListener.class)
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "generator_uuid")
    @GenericGenerator(name = "generator_uuid", strategy = "uuid")
    @ApiModelProperty(value = "书籍主键,采用hibernate的uuid生成32位字符串")
    private String id;
    //
    @Column(name = "title")
    @ApiModelProperty(value = "书名")
    private String title;

    @Column(name = "author")
    @ApiModelProperty(value = "作者")
    private String author;

    @Column(name = "first_sort")
    @ApiModelProperty(value = "一级分类")
    private String firstSort;

    @Column(name = "second_sort")
    @ApiModelProperty(value = "二级分类")
    private String secondSort;

    @Column(name = "is_serial")
    @ApiModelProperty(value = "连载")
    private int isSerial;

    @Column(name = "word_number")
    @ApiModelProperty(value = "字数")
    private int wordNumber;
    //
    @Column(name = "is_state")
    @ApiModelProperty(value = "状态")
    private int isState;

    @Column(name = "is_fullcost")
    @ApiModelProperty(value = "是否收费")
    private int isFullcost;


    @Column(name = "start_time")
    @ApiModelProperty(value = "授权开始时间")
    private Date startTime;
    @Column(name = "end_time")
    @ApiModelProperty(value = "授权结束时间")
    private Date endTime;

    @Column(name = "is_original")
    @ApiModelProperty(value = "是否原创")
    private int isOriginal;

    @Column(name = "copyright_id")
    @ApiModelProperty(value = "外键")
    private int copyrightId;
    @Column(name = "info")
    @ApiModelProperty(value = "简介")
    private String info;
    @Column(name = "image_url")
    @ApiModelProperty(value = "书封地址")
    private String imageUrl;

    @Column(name = "gmt_create",nullable = false,updatable = false)
    @ApiModelProperty(value = "创建时间",example = "2020-09-01 20:00:00")

    private Date gmtCreate;
    @Column(name="gmt_modified",insertable = false,nullable = false)
    @ApiModelProperty(value = "修改时间",example = "2020-09-01 20:00:00")

    private Date gmtModified;
}
