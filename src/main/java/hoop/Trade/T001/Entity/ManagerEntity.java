package hoop.Trade.T001.Entity;

import java.io.Serializable;
import lombok.Data;

/**
 * te_om_manager
 * @author 
 */
@Data
public class ManagerEntity implements Serializable {
    /**
     * 管理员编号
     */
    private String managerId;

    /**
     * 管理员姓名
     */
    private String managerName;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 管理员角色 0-超级管理员,1-区域管理员,3-普通管理员
     */
    private Object managerRole;

    /**
     * 是否有效 0-有效,1-无效
     */
    private Object active;

    /**
     * 用户密码
     */
    private String password;

    private static final long serialVersionUID = 1L;
}