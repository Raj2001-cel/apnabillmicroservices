package com.apnabill.shop.service;

import com.apnabill.shop.entity.Shop;
import com.apnabill.shop.repository.ShopRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public Shop saveDepartment(Shop shop) {
        log.info("Inside saveDepartment of DepartmentService");
        return shopRepository.save(shop);
    }

    public Shop findDepartmentById(Long departmentId) {
        log.info("Inside saveDepartment of DepartmentService");
        return shopRepository.findByDepartmentId(departmentId);
    }
}
