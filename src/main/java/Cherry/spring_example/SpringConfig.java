package Cherry.spring_example;

import Cherry.spring_example.repository.MemberRepository;
import Cherry.spring_example.repository.MemoryMemberRepository;
import Cherry.spring_example.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
