package com.taxi_system.dao.impl;

import com.taxi_system.dao.CarDriverDAO;
import com.taxi_system.db_entities.CarDriver;
import javafx.util.Pair;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Victoria on 25.12.2017.
 */
public class CarDriverDAOImpl extends AbstractCRUD<CarDriver> implements CarDriverDAO {

    @Override
    protected String getCreateQuery(CarDriver object) {
        StringBuilder stringBuilder = new StringBuilder("INSERT INTO car_driver(name, phone_number) VALUES('");
        stringBuilder.append(object.getName()).append("', '");
        stringBuilder.append(object.getPhoneNumber()).append("')");
        return stringBuilder.toString();
    }

    @Override
    protected String getReadQuery(String conditions) {
        return "SELECT * FROM car_driver WHERE 1 = 1" + conditions;
    }

    @Override
    protected String getUpdateQuery(CarDriver object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE car_driver SET name = '").append(object.getName());
        stringBuilder.append("', phone_number = '").append(object.getPhoneNumber());
        stringBuilder.append("' WHERE id = ").append(object.getId());
        return stringBuilder.toString();
    }

    @Override
    protected String getDeleteQuery(CarDriver object) {
        return "DELETE FROM car_driver WHERE id = " + object.getId();
    }

    @Override
    protected CarDriver convertRs(ResultSet rs) {
        CarDriver carDriver = null;
        try {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String phoneNumber = rs.getString("phone_number");
            carDriver = new CarDriver(id, name, phoneNumber);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carDriver;
    }

}
