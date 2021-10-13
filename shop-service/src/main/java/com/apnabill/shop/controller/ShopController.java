package com.apnabill.shop.controller;

import com.apnabill.shop.entity.Shop;
import com.apnabill.shop.service.ShopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shops")
@Slf4j
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping("/")
    public Shop saveDepartment(@RequestBody Shop shop) {
        log.info("Inside saveDepartment method of DepartmentController");
        return  shopService.saveDepartment(shop);
    }

    @GetMapping("/{id}")
    public Shop findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentController");
        return shopService.findDepartmentById(departmentId);
    }

}
