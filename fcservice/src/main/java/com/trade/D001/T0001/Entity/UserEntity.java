package com.trade.D001.T0001.Entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user
 * @author 沙建斌
 * @date 2021-11-08 21:27
 * @version  1.0
 * @description  表mysql.user实体类,mysql.user是个全部权限管理。描述了用户在全局范围内对数据库和数据表进行的操作。
 */
@Data
public class UserEntity extends UserEntityKey implements Serializable {

    /**
     * select权限
     */
    private Object selectPriv;

    /**
     * insert权限
     */

    private Object insertPriv;

    /**
     * update权限
     */
    private Object updatePriv;

    /**
     * delete权限
     */
    private Object deletePriv;

    /**
     * creat权限  creat database creat table etc.
     */
    private Object createPriv;

    /**
     * drop权限  drop database drop table etc.
     */
    private Object dropPriv;

    /**
     * 执行刷新和重新加载mysql各种内部缓存.包括日志,权限,主机,查询和重新加载表或重新加载权限表
     */
    private Object reloadPriv;

    /**
     * 用户是否可以关闭Mysql服务器.此项慎用
     */
    private Object shutdownPriv;

    /**
     * 用户是否可以通过 SHOW PROCESSLIST 命令查看其他用户的进程.
     */
    private Object processPriv;

    /**
     * 用户是否可以执行 SELECT INTO OUTFILE 和 LOAD DATA INFILE命令.
     */
    private Object filePriv;

    /**
     * grant权限
     */
    private Object grantPriv;

    private Object referencesPriv;

    private Object indexPriv;

    private Object alterPriv;

    private Object showDbPriv;

    private Object superPriv;

    /**
     * 创建零时表权限
     */
    private Object createTmpTablePriv;

    private Object lockTablesPriv;

    private Object executePriv;

    private Object replSlavePriv;

    private Object replClientPriv;

    private Object createViewPriv;

    private Object showViewPriv;

    private Object createRoutinePriv;

    private Object alterRoutinePriv;

    private Object createUserPriv;

    private Object eventPriv;

    private Object triggerPriv;

    private Object createTablespacePriv;

    private Object sslType;

    private Integer maxQuestions;

    private Integer maxUpdates;

    private Integer maxConnections;

    private Integer maxUserConnections;

    private String plugin;

    private String authenticationString;

    private Object passwordExpired;

    private Date passwordLastChanged;

    private Short passwordLifetime;

    private Object accountLocked;

    private static final long serialVersionUID = 1L;
}