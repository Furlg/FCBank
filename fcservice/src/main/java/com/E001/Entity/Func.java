package com.E001.Entity;

import java.io.Serializable;
import lombok.Data;

/**
 * func
 * @author 
 */
@Data
public class Func implements Serializable {
    private String name;

    private Boolean ret;

    private String dl;

    private Object type;

    private static final long serialVersionUID = 1L;
}