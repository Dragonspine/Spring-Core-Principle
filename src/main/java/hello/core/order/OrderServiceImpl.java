package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderSerive{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long membId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(membId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(membId, itemName, itemPrice, discountPrice);
    }
}
