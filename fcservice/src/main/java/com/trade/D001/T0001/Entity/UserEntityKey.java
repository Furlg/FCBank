package com.trade.D001.T0001.Entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 沙建斌
 * @description  主键实体
 */
@Data
public class UserEntityKey implements Serializable {
    private String host;

    private String user;

    private static final long serialVersionUID = 1L;
}