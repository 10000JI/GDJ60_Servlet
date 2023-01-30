package com.iu.home.member;

import java.util.Scanner;

public class MemberInput {
	private Scanner sc;
	public MemberInput() {
		this.sc = new Scanner(System.in);
	}
	
	public MemberDTO setData() {
		MemberDTO memberDTO = new MemberDTO();
		System.out.print("회원아이디를 입력하세요:");
		memberDTO.setId(sc.next());
		System.out.println("비밀번호를 입력하세요: ");
		memberDTO.setPw(sc.next());
		System.out.print("이름을 입력하세요: ");
		memberDTO.setId(sc.next());
		System.out.print("전화번호를 입력하세요: ");
		memberDTO.setPhone(sc.next());
		System.out.print("이메일을 입력하세요: ");
		memberDTO.setEmail(sc.next());
		return memberDTO;
	}
}
