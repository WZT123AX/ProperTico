package com.prprv.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * who visited estate
 * @author Christine
 * @version 1.0
 * @since 2023/5/8
 */

@Data
@AllArgsConstructor
@TableName("visitors")
public class Visitors {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String estates;
}
