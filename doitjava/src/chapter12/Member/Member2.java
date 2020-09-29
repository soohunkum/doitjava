package chapter12.Member;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{
		private int memberId;
		private String memberName;
		
		public Member2(int memberId, String memberName) {
			this.memberId = memberId;
			this.memberName = memberName;
		}
		
		public int getMemberId() {
			return memberId;
		}
		
		public void setMemberId(int memberId) {
			this.memberId = memberId;
		}
		
		public String getMemberName() {
			return memberName;
		}
		
		public void SetMemberName(String memberName) {
			this.memberName = memberName;
		}
		@Override
		public String toString() {
			return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�";
		}
		
		@Override
		public int compare(Member2 mem1, Member2 mem2) {
			return mem1.getMemberId() - mem2.getMemberId();
		}
		}