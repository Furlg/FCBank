package hoop.Trade.T001.Service;

import hoop.Trade.T001.Entity.ManagerEntity;

public interface ManagerService {

    /**
     * 根据管理员编号查询管理员信息
     * @param managerId
     * @return
     */
    ManagerEntity selectByPrimaryKey(String managerId,String password);
}
