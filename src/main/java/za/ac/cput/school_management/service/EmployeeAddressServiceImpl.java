/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Service : Employee Address Service Impl
 */
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.EmployeeAddress;

import za.ac.cput.school_management.repository.EmployeeAddressRepository;


import java.util.List;
import java.util.Optional;

public class EmployeeAddressServiceImpl implements EmployeeAddressService {
    private final EmployeeAddressRepository repository;
    private static EmployeeAddressService EMPLOYEE_ADDRESS_SERVICE;

    private EmployeeAddressServiceImpl () { this.repository = EmployeeAddressRepository.getRepository();}

    public static EmployeeAddressService getService() {
        if (EMPLOYEE_ADDRESS_SERVICE == null)
            EMPLOYEE_ADDRESS_SERVICE = (EmployeeAddressService) new EmployeeAddressServiceImpl();
        return EMPLOYEE_ADDRESS_SERVICE;

    }
    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        return this.repository.save(employeeAddress);
    }

    @Override
    public Optional<EmployeeAddress> read(String staffId) {
        return this.repository.read(staffId);
    }

    @Override
    public EmployeeAddress reading(EmployeeAddress studentAddress) {
        return null;
    }


    @Override
    public void delete(EmployeeAddress employeeAddress) {
        this.repository.delete(employeeAddress);

    }

    @Override
    public List<EmployeeAddressService> findAllStaffId(String staffId) {
        return null;
    }

}
