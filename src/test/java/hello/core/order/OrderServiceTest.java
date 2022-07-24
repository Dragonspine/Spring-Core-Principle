package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderSerive orderSerive;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderSerive = appConfig.orderSerive();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;

        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderSerive.createOrder(memberId, "itemA", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
