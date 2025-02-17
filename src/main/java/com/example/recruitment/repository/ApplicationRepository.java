package com.example.recruitment.repository;

import com.example.recruitment.entity.Application;
import com.example.recruitment.entity.Recruitment;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

  List<Application> findAllByRecruitment_Id(Long id);

  Optional<Application> findByRecruitmentAndResume_Member_LoginId(Recruitment recruitment,
      String memberLoginId);
}
