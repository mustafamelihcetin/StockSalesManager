package tr.com.melihcetin.dal;

import tr.com.melihcetin.core.ObjectHelper;
import tr.com.melihcetin.interfaces.DALInterfaces;
import tr.com.melihcetin.types.EmployeeEntity;

import java.util.List;

public class EmployeeDAL<EmployeeEntity> extends ObjectHelper implements DALInterfaces<EmployeeEntity> {
    @Override
    public void Insert(EmployeeEntity entity) {

    }

    @Override
    public List<EmployeeEntity> GetAll() {
        return null;
    }

    @Override
    public EmployeeEntity Delete(EmployeeEntity entity) {
        return null;
    }

    @Override
    public void Update(EmployeeEntity entity) {

    }

    @Override
    public List<EmployeeEntity> GetById(int id) {
        return null;
    }
}
