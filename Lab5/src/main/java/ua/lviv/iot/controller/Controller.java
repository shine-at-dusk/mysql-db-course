package ua.lviv.iot.controller;

import ua.lviv.iot.model.*;
import ua.lviv.iot.service.*;

public class Controller implements IController {
    private static OrderService orderService;
    private static ClientService clientService;
    private static AccountService accountService;
    private static CityService cityService;
    private static CourierService courierService;
    private static OperatorService operatorService;
    private static DepartmentService departmentService;
    private static DepartmentTypeService departmentTypeService;

    public Controller() {
        orderService = new OrderService();
        clientService = new ClientService();
        accountService = new AccountService();
        cityService = new CityService();
        courierService = new CourierService();
        operatorService = new OperatorService();
        departmentService = new DepartmentService();
        departmentTypeService = new DepartmentTypeService();
    }

    @Override
    public void findAllOrders() throws Exception {
        orderService.findAll();
    }

    @Override
    public void findOrderById(Integer id) throws Exception {
        orderService.findById(id);
    }

    @Override
    public void createOrder(OrderEntity entity) throws Exception {
        orderService.create(entity);
    }

    @Override
    public void updateOrder(OrderEntity entity) throws Exception {
        orderService.update(entity);
    }

    @Override
    public void deleteOrder(Integer id) throws Exception {
        orderService.delete(id);
    }

    @Override
    public void findAllClients() throws Exception {
        clientService.findAll();
    }

    @Override
    public void findClientById(Integer id) throws Exception {
        clientService.findById(id);
    }

    @Override
    public void createClient(ClientEntity entity) throws Exception {
        clientService.create(entity);
    }

    @Override
    public void updateClient(ClientEntity entity) throws Exception {
        clientService.update(entity);
    }

    @Override
    public void deleteClient(Integer id) throws Exception {
        clientService.delete(id);
    }

    @Override
    public void findAllAccounts() throws Exception {
        accountService.findAll();
    }

    @Override
    public void findAccountById(Integer id) throws Exception {
        accountService.findById(id);
    }

    @Override
    public void createAccount(AccountEntity entity) throws Exception {
        accountService.create(entity);
    }

    @Override
    public void updateAccount(AccountEntity entity) throws Exception {
        accountService.update(entity);
    }

    @Override
    public void deleteAccount(Integer id) throws Exception {
        accountService.delete(id);
    }

    @Override
    public void findAllCities() throws Exception {
        cityService.findAll();
    }

    @Override
    public void findCityById(String id) throws Exception {
        cityService.findById(id);
    }

    @Override
    public void createCity(CityEntity entity) throws Exception {
        cityService.create(entity);
    }

    @Override
    public void updateCity(CityEntity entity) throws Exception {
        cityService.update(entity);
    }

    @Override
    public void deleteCity(String id) throws Exception {
        cityService.delete(id);
    }

    @Override
    public void findAllCouriers() throws Exception {
        courierService.findAll();
    }

    @Override
    public void findCourierById(Integer id) throws Exception {
        courierService.findById(id);
    }

    @Override
    public void createCourier(CourierEntity entity) throws Exception {
        courierService.create(entity);
    }

    @Override
    public void updateCourier(CourierEntity entity) throws Exception {
        courierService.update(entity);
    }

    @Override
    public void deleteCourier(Integer id) throws Exception {
        courierService.delete(id);
    }

    @Override
    public void findAllOperators() throws Exception {
        operatorService.findAll();
    }

    @Override
    public void findOperatorById(Integer id) throws Exception {
        operatorService.findById(id);
    }

    @Override
    public void createOperator(OperatorEntity entity) throws Exception {
        operatorService.create(entity);
    }

    @Override
    public void updateOperator(OperatorEntity entity) throws Exception {
        operatorService.update(entity);
    }

    @Override
    public void deleteOperator(Integer id) throws Exception {
        operatorService.delete(id);
    }

    @Override
    public void findAllDepartments() throws Exception {
        departmentService.findAll();
    }

    @Override
    public void findDepartmentById(Integer id) throws Exception {
        departmentService.findById(id);
    }

    @Override
    public void createDepartment(DepartmentEntity entity) throws Exception {
        departmentService.create(entity);
    }

    @Override
    public void updateDepartment(DepartmentEntity entity) throws Exception {
        departmentService.update(entity);
    }

    @Override
    public void deleteDepartment(Integer id) throws Exception {
        departmentService.delete(id);
    }

    @Override
    public void findAllDepartmentTypes() throws Exception {
        departmentTypeService.findAll();
    }

    @Override
    public void findDepartmentTypeById(String id) throws Exception {
        departmentTypeService.findById(id);
    }

    @Override
    public void createDepartmentType(DepartmentTypeEntity entity) throws Exception {
        departmentTypeService.create(entity);
    }

    @Override
    public void updateDepartmentType(DepartmentTypeEntity entity) throws Exception {
        departmentTypeService.update(entity);
    }

    @Override
    public void deleteDepartmentType(String id) throws Exception {
        departmentTypeService.delete(id);
    }
}
