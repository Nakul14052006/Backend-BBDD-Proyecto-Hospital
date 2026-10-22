package com.Hospital.Hospital.Repository;

import com.Hospital.Hospital.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface nurse_repo extends JpaRepository<Nurse,Integer> {

    // search by name
    @Query
            ("""

                    SELECT n FROM Nurse n WHERE n.username = :username """)


Nurse findByUsername(@Param("username") String username);
    }
