package ua.lviv.iot.model;

import ua.lviv.iot.controller.connection.ConnectionManager;

import java.math.BigDecimal;
import java.sql.*;

public class Order {
    private static final String FIND_ALL = "SELECT * FROM `order`";
    private static final String FIND_BY_ID = "SELECT * FROM `order` WHERE id=?";
    private static final String CREATE = "INSERT INTO `order` (from_department_id, to_department_id" +
            ", from_operator_id, to_operator_id, from_courier_id, to_courier_id, from_client_id, to_client_id" +
            ", delivery_price, product_price, weight, sending_date, approximate_arrival_date, fixed_arrival_date)" +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE `order` SET " +
            "from_department_id=?, to_department_id=?, from_operator_id=?, to_operator_id=?, from_courier_id=?" +
            ", to_courier_id=?, from_client_id=?, to_client_id=?, delivery_price=?, product_price=?, weight=?" +
            ", sending_date=?, approximate_arrival_date=?, fixed_arrival_date=?" +
            " WHERE id=?";
    private static final String DELETE = "DELETE FROM `order` WHERE id=?";

    public void findAll() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(FIND_ALL)) {
                print(resultSet);
            }
        }
    }

    public void findById(Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet resultSet = ps.executeQuery()) {
                print(resultSet);
            }
        }
    }

    public void create(Integer from_department_id, Integer to_department_id, Integer from_operator_id,
                      Integer to_operator_id, Integer from_courier_id, Integer to_courier_id,
                      Integer from_client_id, Integer to_client_id, BigDecimal delivery_price,
                      BigDecimal product_price, Integer weight, Date sending_date,
                      Date approximate_arrival_date, Date fixed_arrival_date) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, from_department_id);
            ps.setInt(2, to_department_id);
            ps.setInt(3, from_operator_id);
            ps.setInt(4, to_operator_id);
            if (from_courier_id != null)
                ps.setInt(5, from_courier_id);
            else
                ps.setNull(5, Types.INTEGER);
            if (to_courier_id != null)
                ps.setInt(6, to_courier_id);
            else
                ps.setNull(6, Types.INTEGER);
            ps.setInt(7, from_client_id);
            ps.setInt(8, to_client_id);
            ps.setBigDecimal(9, delivery_price);
            if (product_price != null)
                ps.setBigDecimal(10, product_price);
            else
                ps.setNull(10, Types.DECIMAL);
            ps.setInt(11, weight);
            ps.setDate(12, sending_date);
            ps.setDate(13, approximate_arrival_date);
            if (fixed_arrival_date != null)
                ps.setDate(14, fixed_arrival_date);
            else
                ps.setNull(14, Types.DATE);

            ps.executeUpdate();
        }
    }

    private void print(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.print("{id: " + resultSet.getInt("id"));
            System.out.print(", from_department_id: " + resultSet.getInt("from_department_id"));
            System.out.print(", to_department_id: " + resultSet.getInt("to_department_id"));
            System.out.print(", from_operator_id: " + resultSet.getInt("from_operator_id"));
            System.out.print(", to_operator_id: " + resultSet.getInt("to_operator_id"));
            System.out.print(", from_courier_id: " +
                    (resultSet.getObject("from_courier_id") != null ? resultSet.getInt("from_courier_id") : null));
            System.out.print(", to_courier_id: " +
                    (resultSet.getObject("to_courier_id") != null ? resultSet.getInt("to_courier_id") : null));
            System.out.print(", from_client_id: " + resultSet.getInt("from_client_id"));
            System.out.print(", to_client_id: " + resultSet.getInt("to_client_id"));
            System.out.print(", delivery_price: " + resultSet.getBigDecimal("delivery_price"));
            System.out.print(", product_price: " + resultSet.getBigDecimal("product_price"));
            System.out.print(", weight: " + resultSet.getInt("weight"));
            System.out.print(", sending_date: " + resultSet.getDate("sending_date"));
            System.out.print(", approximate_arrival_date: " + resultSet.getDate("approximate_arrival_date"));
            System.out.print(", fixed_arrival_date: " + resultSet.getDate("fixed_arrival_date"));
            System.out.println("}");
        }
    }
}
