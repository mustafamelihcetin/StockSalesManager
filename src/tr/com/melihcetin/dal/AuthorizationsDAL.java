package tr.com.melihcetin.dal;

import tr.com.melihcetin.core.ObjectHelper;
import tr.com.melihcetin.interfaces.DALInterfaces;

import java.util.List;

public class AuthorizationsDAL<AuthorizationsEntity> extends ObjectHelper implements DALInterfaces<AuthorizationsEntity> {
    @Override
    public void Insert(AuthorizationsEntity entity) {

    }

    @Override
    public List<AuthorizationsEntity> GetAll() {
        return null;
    }

    @Override
    public AuthorizationsEntity Delete(AuthorizationsEntity entity) {
        return null;
    }

    @Override
    public void Update(AuthorizationsEntity entity) {

    }

    @Override
    public List<AuthorizationsEntity> GetById(int id) {
        return null;
    }
}
