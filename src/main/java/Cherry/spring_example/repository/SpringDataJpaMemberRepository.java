package Cherry.spring_example.repository;

import Cherry.spring_example.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //KPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
