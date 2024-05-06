package tr.com.melihcetin.dal;

import tr.com.melihcetin.core.ObjectHelper;
import tr.com.melihcetin.interfaces.DALInterfaces;

import java.util.List;

public class ProductsDAL<ProductsEntity> extends ObjectHelper implements DALInterfaces<ProductsEntity> {
    @Override
    public void Insert(ProductsEntity entity) {

    }

    @Override
    public List<ProductsEntity> GetAll() {
        return null;
    }

    @Override
    public ProductsEntity Delete(ProductsEntity entity) {
        return null;
    }

    @Override
    public void Update(ProductsEntity entity) {

    }

    @Override
    public List<ProductsEntity> GetById(int id) {
        return null;
    }
}
