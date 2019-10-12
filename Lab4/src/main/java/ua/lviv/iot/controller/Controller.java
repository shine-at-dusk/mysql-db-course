package ua.lviv.iot.controller;

import ua.lviv.iot.model.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;

public class Controller implements IController {
    private static Order order;
    private static Client client;
    private static Account account;
    private static City city;
    private static Courier courier;
    private static Operator operator;
    private static Department department;
    private static DepartmentType departmentType;

    public Controller() {
        order = new Order();
        client = new Client();
        account = new Account();
        city = new City();
        courier = new Courier();
        operator = new Operator();
        department = new Department();
        departmentType = new DepartmentType();
    }

    @Override
    public void findAllOrders() throws SQLException {
        order.findAll();
    }

    @Override
    public void findOrderById(Integer id) throws SQLException {
        order.findById(id);
    }

    @Override
    public void createOrder(Integer from_department_id, Integer to_department_id, Integer from_operator_id,
                            Integer to_operator_id, Integer from_courier_id, Integer to_courier_id,
                            Integer from_client_id, Integer to_client_id, BigDecimal delivery_price,
                            BigDecimal product_price, Integer weight, Date sending_date,
                            Date approximate_arrival_date, Date fixed_arrival_date) throws SQLException {
        order.create(from_department_id, to_department_id, from_operator_id, to_operator_id, from_courier_id,
                to_courier_id, from_client_id, to_client_id, delivery_price, product_price, weight, sending_date,
                approximate_arrival_date, fixed_arrival_date);
    }

    @Override
    public void updateOrder(Integer id, Integer from_department_id, Integer to_department_id,
                            Integer from_operator_id, Integer to_operator_id, Integer from_courier_id,
                            Integer to_courier_id, Integer from_client_id, Integer to_client_id,
                            BigDecimal delivery_price, BigDecimal product_price, Integer weight,
                            Date sending_date, Date approximate_arrival_date, Date fixed_arrival_date)
            throws SQLException {
        order.update(id, from_department_id, to_department_id, from_operator_id, to_operator_id, from_courier_id,
                to_courier_id, from_client_id, to_client_id, delivery_price, product_price, weight, sending_date,
                approximate_arrival_date, fixed_arrival_date);
    }

    @Override
    public void deleteOrder(Integer id) throws SQLException {
        order.delete(id);
    }

    @Override
    public void findAllClients() throws SQLException {
        client.findAll();
    }

    @Override
    public void findClientById(Integer id) throws SQLException {
        client.findById(id);
    }

    @Override
    public void createClient(String name, String surname, BigDecimal phone, String address) throws SQLException {
        client.create(name, surname, phone, address);
    }

    @Override
    public void updateClient(Integer id, String name, String surname, BigDecimal phone, String address)
            throws SQLException {
        client.update(id, name, surname, phone, address);
    }

    @Override
    public void deleteClient(Integer id) throws SQLException {
        client.delete(id);
    }

    @Override
    public void findAllAccounts() throws SQLException {
        account.findAll();
    }

    @Override
    public void findAccountById(Integer id) throws SQLException {
        account.findById(id);
    }

    @Override
    public void createAccount(Integer id, String username, String password, String email) throws SQLException {
        account.create(id, username, password, email);
    }

    @Override
    public void updateAccount(Integer id, String username, String password, String email) throws SQLException {
        account.update(id, username, password, email);
    }

    @Override
    public void deleteAccount(Integer id) throws SQLException {
        account.delete(id);
    }

    @Override
    public void findAllCities() throws SQLException {
        city.findAll();
    }

    @Override
    public void findCityById(String name) throws SQLException {
        city.findById(name);
    }

    @Override
    public void createCity(String name) throws SQLException {
        city.create(name);
    }

    @Override
    public void updateCity(String name, String newName) throws SQLException {
        city.update(name, newName);
    }

    @Override
    public void deleteCity(String name) throws SQLException {
        city.delete(name);
    }

    @Override
    public void findAllCouriers() throws SQLException {
        courier.findAll();
    }

    @Override
    public void findCourierById(Integer id) throws SQLException {
        courier.findById(id);
    }

    @Override
    public void createCourier(Integer department_id, String name, String surname, String address,
                              BigDecimal phone, Date birthday) throws SQLException {
        courier.create(department_id, name, surname, address, phone, birthday);
    }

    @Override
    public void updateCourier(Integer id, Integer department_id, String name, String surname,
                              String address, BigDecimal phone, Date birthday) throws SQLException {
        courier.update(id, department_id, name, surname, address, phone, birthday);
    }

    @Override
    public void deleteCourier(Integer id) throws SQLException {
        courier.delete(id);
    }

    public void findAllOperators() throws SQLException {
        operator.findAll();
    }

    @Override
    public void findOperatorById(Integer id) throws SQLException {
        operator.findById(id);
    }

    @Override
    public void createOperator(Integer department_id, String name, String surname, String address,
                              BigDecimal phone, Date birthday) throws SQLException {
        operator.create(department_id, name, surname, address, phone, birthday);
    }

    @Override
    public void updateOperator(Integer id, Integer department_id, String name, String surname,
                              String address, BigDecimal phone, Date birthday) throws SQLException {
        operator.update(id, department_id, name, surname, address, phone, birthday);
    }

    @Override
    public void deleteOperator(Integer id) throws SQLException {
        operator.delete(id);
    }

    @Override
    public void findAllDepartments() throws SQLException {
        department.findAll();
    }

    @Override
    public void findDepartmentById(Integer id) throws SQLException {
        department.findById(id);
    }

    @Override
    public void createDepartment(String department_type_size, String city_name, Integer number, String address)
            throws SQLException {
        department.create(department_type_size, city_name, number, address);
    }

    @Override
    public void updateDepartment(Integer id, String department_type_size, String city_name, Integer number,
                                 String address) throws SQLException {
        department.update(id, department_type_size, city_name, number, address);
    }

    @Override
    public void deleteDepartment(Integer id) throws SQLException {
        department.delete(id);
    }

    @Override
    public void findAllDepartmentTypes() throws SQLException {
        departmentType.findAll();
    }

    @Override
    public void findDepartmentTypeById(String size) throws SQLException {
        departmentType.findById(size);
    }

    @Override
    public void createDepartmentType(String size, Integer max_weight) throws SQLException {
        departmentType.create(size, max_weight);
    }

    @Override
    public void updateDepartmentType(String size, Integer max_weight, String newSize) throws SQLException {
        departmentType.update(size, max_weight, newSize);
    }

    @Override
    public void deleteDepartmentType(String size) throws SQLException {
        departmentType.delete(size);
    }
}
