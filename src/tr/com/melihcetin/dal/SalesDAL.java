package tr.com.melihcetin.dal;

import tr.com.melihcetin.core.ObjectHelper;
import tr.com.melihcetin.interfaces.DALInterfaces;

import java.util.List;

public class SalesDAL<SalesEntity> extends ObjectHelper implements DALInterfaces<SalesEntity> {
    @Override
    public void Insert(SalesEntity entity) {

    }

    @Override
    public List<SalesEntity> GetAll() {
        return null;
    }

    @Override
    public SalesEntity Delete(SalesEntity entity) {
        return null;
    }

    @Override
    public void Update(SalesEntity entity) {

    }

    @Override
    public List<SalesEntity> GetById(int id) {
        return null;
    }
}
