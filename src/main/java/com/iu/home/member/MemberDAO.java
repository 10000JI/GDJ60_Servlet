package com.iu.home.member;

import com.iu.home.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDAO {
	public int setData(MemberDTO memberDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "INSERT INTO BANKMEMBERS (ID,PW,NAME,PHONE,EMAIL)"
				+ " VALUES (?,?,?,?,?)";
		PreparedStatement st = connection.prepareStatement(sql);
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		st.setString(3, memberDTO.getName());
		st.setString(4, memberDTO.getPhone());
		st.setString(5, memberDTO.getEmail());
		int result = st.executeUpdate();
		DBConnection.disConnection(st, connection);
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = new MemberDAO();
		memberDTO.setId("id1");
		memberDTO.setPw("pw1");
		memberDTO.setName("name1");
		memberDTO.setPhone("phone1");
		memberDTO.setEmail("Email1");
		int a =memberDAO.setData(memberDTO);
		System.out.println(a == 1);
	}
}
