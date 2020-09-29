package chapter12.Member;

public class Member implements Comparable<Member>{
		private int memberId;
		private String memberName;
		
		public Member(int memberId, String memberName) {
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
		public int compareTo(Member member) {
			return(this.memberId - member.memberId);
		}
		}
