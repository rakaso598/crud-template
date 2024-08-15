package com.example.crudtemplate.repository;

import com.example.crudtemplate.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByMemberName(String memberName);

    Optional<Member> findByEmail(String email);
}
