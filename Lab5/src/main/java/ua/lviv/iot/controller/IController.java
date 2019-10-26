package ua.lviv.iot.controller;

import ua.lviv.iot.model.*;

import java.math.BigDecimal;
import java.sql.Date;

public interface IController {

    void findAllOrders() throws Exception;

    void findOrderById(Integer id) throws Exception;

    void createOrder(OrderEntity entity) throws Exception;

    void updateOrder(OrderEntity entity) throws Exception;

    void deleteOrder(Integer id) throws Exception;

    void findAllClients() throws Exception;

    void findClientById(Integer id) throws Exception;

    void createClient(ClientEntity entity) throws Exception;

    void updateClient(ClientEntity entity) throws Exception;

    void deleteClient(Integer id) throws Exception;

    void findAllAccounts() throws Exception;

    void findAccountById(Integer id) throws Exception;

    void createAccount(AccountEntity entity) throws Exception;

    void updateAccount(AccountEntity entity) throws Exception;

    void deleteAccount(Integer id) throws Exception;

    void findAllCities() throws Exception;

    void findCityById(String id) throws Exception;

    void createCity(CityEntity entity) throws Exception;

    void updateCity(CityEntity entity) throws Exception;

    void deleteCity(String id) throws Exception;

    void findAllCouriers() throws Exception;

    void findCourierById(Integer id) throws Exception;

    void createCourier(CourierEntity entity) throws Exception;

    void updateCourier(CourierEntity entity) throws Exception;

    void deleteCourier(Integer id) throws Exception;

    void findAllOperators() throws Exception;

    void findOperatorById(Integer id) throws Exception;

    void createOperator(OperatorEntity entity) throws Exception;

    void updateOperator(OperatorEntity entity) throws Exception;

    void deleteOperator(Integer id) throws Exception;

    void findAllDepartments() throws Exception;

    void findDepartmentById(Integer id) throws Exception;

    void createDepartment(DepartmentEntity entity)
            throws Exception;

    void updateDepartment(DepartmentEntity entity)
            throws Exception;

    void deleteDepartment(Integer id) throws Exception;

    void findAllDepartmentTypes() throws Exception;

    void findDepartmentTypeById(String id) throws Exception;

    void createDepartmentType(DepartmentTypeEntity entity) throws Exception;

    void updateDepartmentType(DepartmentTypeEntity entity) throws Exception;

    void deleteDepartmentType(String id) throws Exception;
}
