package tr.com.melihcetin.dal;

import tr.com.melihcetin.core.ObjectHelper;
import tr.com.melihcetin.interfaces.DALInterfaces;
import tr.com.melihcetin.types.CategoryEntity;

import java.util.List;

public class CategoryDAL<CategoryEntity> extends ObjectHelper implements DALInterfaces<CategoryEntity> {


    @Override
    public void Insert(CategoryEntity entity) {

    }

    @Override
    public List<CategoryEntity> GetAll() {
        return null;
    }

    @Override
    public CategoryEntity Delete(CategoryEntity entity) {
        return null;
    }

    @Override
    public void Update(CategoryEntity entity) {

    }

    @Override
    public List<CategoryEntity> GetById(int id) {
        return null;
    }
}
