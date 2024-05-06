package tr.com.melihcetin.dal;

import tr.com.melihcetin.core.ObjectHelper;
import tr.com.melihcetin.interfaces.DALInterfaces;
import tr.com.melihcetin.types.StockEntity;

import java.util.List;

public class StockDAL<StockEntity> extends ObjectHelper implements DALInterfaces<StockEntity> {
    @Override
    public void Insert(StockEntity entity) {

    }

    @Override
    public List<StockEntity> GetAll() {
        return null;
    }

    @Override
    public StockEntity Delete(StockEntity entity) {
        return null;
    }

    @Override
    public void Update(StockEntity entity) {

    }

    @Override
    public List<StockEntity> GetById(int id) {
        return null;
    }
}
