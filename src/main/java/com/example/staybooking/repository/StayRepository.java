package com.example.staybooking.repository;

import com.example.staybooking.model.Stay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StayRepository extends JpaRepository<Stay, Long> {


    List<Stay> findByHost_Username(String username);


    Stay findByIdAndHost_Username(Long id, String username);


    List<Stay> findByIdInAndGuestNumberGreaterThanEqual(List<Long> ids, int guestNumber);


}

