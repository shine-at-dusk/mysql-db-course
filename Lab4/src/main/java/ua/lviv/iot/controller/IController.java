package ua.lviv.iot.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;

public interface IController {

    void findAllOrders() throws SQLException;

    void findOrderById(Integer id) throws SQLException;

    void createOrder(Integer from_department_id, Integer to_department_id, Integer from_operator_id,
                     Integer to_operator_id, Integer from_courier_id, Integer to_courier_id,
                     Integer from_client_id, Integer to_client_id, BigDecimal delivery_price,
                     BigDecimal product_price, Integer weight, Date sending_date,
                     Date approximate_arrival_date, Date fixed_arrival_date) throws SQLException;

    void updateOrder(Integer id, Integer from_department_id, Integer to_department_id, Integer from_operator_id,
                     Integer to_operator_id, Integer from_courier_id, Integer to_courier_id,
                     Integer from_client_id, Integer to_client_id, BigDecimal delivery_price,
                     BigDecimal product_price, Integer weight, Date sending_date,
                     Date approximate_arrival_date, Date fixed_arrival_date) throws SQLException;

    void deleteOrder(Integer id) throws SQLException;

    void findAllClients() throws SQLException;

    void findClientById(Integer id) throws SQLException;

    void createClient(String name, String surname, BigDecimal phone, String address) throws SQLException;

    void updateClient(Integer id, String name, String surname, BigDecimal phone, String address) throws SQLException;

    void deleteClient(Integer id) throws SQLException;

    void findAllAccounts() throws SQLException;

    void findAccountById(Integer id) throws SQLException;

    void createAccount(Integer id, String username, String password, String email) throws SQLException;

    void updateAccount(Integer id, String username, String password, String email) throws SQLException;

    void deleteAccount(Integer id) throws SQLException;

    void findAllCities() throws SQLException;

    void findCityById(String name) throws SQLException;

    void createCity(String name) throws SQLException;

    void updateCity(String name, String newName) throws SQLException;

    void deleteCity(String name) throws SQLException;

    void findAllCouriers() throws SQLException;

    void findCourierById(Integer id) throws SQLException;

    void createCourier(Integer department_id, String name, String surname, String address,
                       BigDecimal phone, Date birthday) throws SQLException;

    void updateCourier(Integer id, Integer department_id, String name, String surname, String address,
                       BigDecimal phone, Date birthday) throws SQLException;

    void deleteCourier(Integer id) throws SQLException;

    void findAllOperators() throws SQLException;

    void findOperatorById(Integer id) throws SQLException;

    void createOperator(Integer department_id, String name, String surname, String address,
                       BigDecimal phone, Date birthday) throws SQLException;

    void updateOperator(Integer id, Integer department_id, String name, String surname, String address,
                       BigDecimal phone, Date birthday) throws SQLException;

    void deleteOperator(Integer id) throws SQLException;

    void findAllDepartments() throws SQLException;

    void findDepartmentById(Integer id) throws SQLException;

    void createDepartment(String department_type_size, String city_name, Integer number, String address)
            throws SQLException;

    void updateDepartment(Integer id, String department_type_size, String city_name, Integer number, String address)
            throws SQLException;

    void deleteDepartment(Integer id) throws SQLException;

    void findAllDepartmentTypes() throws SQLException;

    void findDepartmentTypeById(String size) throws SQLException;

    void createDepartmentType(String size, Integer max_weight) throws SQLException;

    void updateDepartmentType(String size, Integer max_weight, String newSize) throws SQLException;

    void deleteDepartmentType(String size) throws SQLException;
}
