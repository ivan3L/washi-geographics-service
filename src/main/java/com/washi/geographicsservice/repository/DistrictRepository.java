package com.washi.geographicsservice.repository;

import com.washi.geographicsservice.entity.Department;
import com.washi.geographicsservice.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,Long> {
    public District findByDistrictId(Long id);
    public List<District> findByName(String name);
    public List<District> findByDepartment(Department department);
}
