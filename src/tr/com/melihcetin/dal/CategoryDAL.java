package tr.com.melihcetin.dal;

import tr.com.melihcetin.core.ObjectHelper;
import tr.com.melihcetin.interfaces.DALInterfaces;
import tr.com.melihcetin.types.CategoryEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAL extends ObjectHelper implements DALInterfaces<CategoryEntity> {


    @Override
    public void Insert(CategoryEntity entity) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Category(name, parentId) VALUES ('" + entity.getName() + "','" + entity.getParentId() + "')");
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<CategoryEntity> GetAll() {
        List<CategoryEntity> dataEntity = new ArrayList<CategoryEntity>();
        Connection connection = getConnection();
        CategoryEntity entity;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Category");
            while (resultSet.next()){
                entity = new CategoryEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setName(resultSet.getString("name"));
                entity.setParentId((resultSet.getInt("parentId")));

                dataEntity.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return dataEntity;
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
