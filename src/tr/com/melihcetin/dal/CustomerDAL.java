package tr.com.melihcetin.dal;

import tr.com.melihcetin.core.ObjectHelper;
import tr.com.melihcetin.interfaces.DALInterfaces;
import tr.com.melihcetin.types.CustomerEntity;

import java.util.List;

public class CustomerDAL<CustomerEntity> extends ObjectHelper implements DALInterfaces<CustomerEntity> {
    @Override
    public void Insert(CustomerEntity entity) {

    }

    @Override
    public List<CustomerEntity> GetAll() {
        return null;
    }

    @Override
    public CustomerEntity Delete(CustomerEntity entity) {
        return null;
    }

    @Override
    public void Update(CustomerEntity entity) {

    }

    @Override
    public List<CustomerEntity> GetById(int id) {
        return null;
    }
}
