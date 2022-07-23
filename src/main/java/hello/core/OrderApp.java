package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.order.Order;
import hello.core.order.OrderSerive;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appCongig = new AppConfig();
        MemberService memberService = appCongig.memberService();
        OrderSerive orderSerive = appCongig.orderSerive();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        
        Order order = orderSerive.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order = " + order.calculatePrice());
    }
}
