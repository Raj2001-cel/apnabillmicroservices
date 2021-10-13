package com.apnabill.shop.repository;

import com.apnabill.shop.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

    Shop findByDepartmentId(Long departmentId);
}
