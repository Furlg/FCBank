package hoop.Trade.T001.Service;

import hoop.Mappers.ManagerMapper;
import hoop.Trade.T001.Entity.ManagerEntity;
import hoop.message.ErrorCodeAndMessage;
import hoop.message.GlobalException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class ManagerServiceImp implements ManagerService {

    @Resource
    ManagerMapper managerMapper;

    /**
     * 根据管理员编号查询管理员信息
     *
     * @param managerId
     * @return
     */
    @Override
    public ManagerEntity selectByPrimaryKey(String managerId,String password) {

        ManagerEntity managerEntity = managerMapper.selectByPrimaryKey(managerId);
        log.error("查询回来的实体类:"+managerEntity);
        if (managerEntity == null){
            throw new GlobalException(ErrorCodeAndMessage.ERROR_UNKNOWN);
        }
        /**判断密码是否正确**/
        if (!password.equals(managerEntity.getPassword())){
            throw  new GlobalException(ErrorCodeAndMessage.MANAGER_ERROR);
        }
        return managerEntity;
    }
}
