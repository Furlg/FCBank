package com.trade.D001.T0001.Entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 沙建斌
 * @description 安全列实体
 */
@Data
public class UserEntityWithBLOBs extends UserEntity implements Serializable {
    private byte[] sslCipher;

    private byte[] x509Issuer;

    private byte[] x509Subject;

    private static final long serialVersionUID = 1L;
}