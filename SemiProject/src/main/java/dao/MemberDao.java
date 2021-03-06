package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.MemberDto;
import mysql.db.DbConnect;

public class MemberDao {

   DbConnect db = new DbConnect();
   
   //이메일체크
   public boolean isemailCheck(String email)
   {
      boolean b=false;
      Connection conn=db.getConnection();
      PreparedStatement pstmt=null;
      ResultSet rs=null;
         
      String sql="select * from member where email=?";
         
      try {
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, email);
         
            rs=pstmt.executeQuery();
            
            if(rs.next())
            {
               b=true;
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }finally {
            db.dbClose(rs, pstmt, conn);
         }
         return b;
      }
         
   //member insert
   public void insertMember(MemberDto dto)
   {
      Connection conn=db.getConnection();
      PreparedStatement pstmt=null;
            
      String sql="insert into member values(null,?,?,?,now())";
            
      try {
            pstmt=conn.prepareStatement(sql);
               
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getEmail());
            pstmt.setString(3, dto.getPassword());
               
            pstmt.execute();
         }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }finally {
            db.dbClose(pstmt, conn);
         }
            
   }
      
      
   //member delete
   public void deleteMember(String mnum)
   {
      Connection conn=db.getConnection();
      PreparedStatement pstmt=null;
         
      String sql="delete from member where mnum=?";
         
      try {
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, mnum);
            
            pstmt.execute();
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }finally {
            db.dbClose(pstmt, conn);
         }
   }
	   
	 //signup delete
	 public void deletesignup(String mnum)
	 {
	    Connection conn=db.getConnection();
	    PreparedStatement pstmt=null;
	       
	    String sql="delete from signup where mnum=?";
	       
	    try {
	          pstmt=conn.prepareStatement(sql);
	          pstmt.setString(1, mnum);
	          
	          pstmt.execute();
	       } catch (SQLException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	       }finally {
	          db.dbClose(pstmt, conn);
	       }
	 }
	 //cart delete
	 public void deletecart(String mnum)
	 {
	    Connection conn=db.getConnection();
	    PreparedStatement pstmt=null;
	       
	    String sql="delete from cart where mnum=?";
	       
	    try {
	          pstmt=conn.prepareStatement(sql);
	          pstmt.setString(1, mnum);
	          
	          pstmt.execute();
	       } catch (SQLException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	       }finally {
	          db.dbClose(pstmt, conn);
	       }
	 }
	 
	 //review delete
	 public void deletereview(String mnum)
	 {
	    Connection conn=db.getConnection();
	    PreparedStatement pstmt=null;
	       
	    String sql="delete from review where mnum=?";
	       
	    try {
	          pstmt=conn.prepareStatement(sql);
	          pstmt.setString(1, mnum);
	          
	          pstmt.execute();
	       } catch (SQLException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	       }finally {
	          db.dbClose(pstmt, conn);
	       }
	 }
 
 
   
   //email에 맞는 비번인지 확인 메서드
   public boolean isEmailPass (String email, String pass) {
         
         boolean b = false;
         
         Connection conn = db.getConnection();
         PreparedStatement pstmt =null;
         ResultSet rs =null;
         
         String sql="select * from member where email=? and password=?";
         
         try {
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, email);
            pstmt.setString(2, pass);
            
            rs=pstmt.executeQuery();
            
            if (rs.next()) {
               //비번이 맞는 데이터 잇음 true로 변경
               b = true;
            }
            
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }finally {
            db.dbClose(rs, pstmt, conn);
         }
         
         return b;
      }
	
	 //email에 따른 name변환
	 //이메일을 통해 이름 값 얻는 메서드 (로그인->마이페이지에 ㅇㅇㅇ님 환영합니다 출력)
 	public String getName(String email) {
 			
 			String name="";
 			
 			Connection conn = db.getConnection();
 			PreparedStatement pstmt = null;
 			ResultSet rs = null;	
 			
 			String sql="select * from member where email=?";
 			
 			try {
 				pstmt=conn.prepareStatement(sql);
 				pstmt.setString(1, email);
 				rs=pstmt.executeQuery();
 				
 				if (rs.next())
 					name=rs.getString("name");
 				
 			} catch (SQLException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}finally {
 				db.dbClose(rs, pstmt, conn);
 			}
 			return name;
 		}
 	
 	// [신지환]해당 클래스 후기 게시판에서 각 mnum에 따른 name반환
 	public String getName_mnum(String mnum)
 	{
 		String name = "";
 		
 		Connection conn = db.getConnection();
 		PreparedStatement pstmt = null;
 		ResultSet rs = null;
 		
 		String sql = "select * from member where mnum=?";
 		
 		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mnum);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
 		
 		return name;
 	}
 	
 	//email에 따른 mnum값 반환
 	public String getMnum(String email) {
			
			String mnum="";
			
			Connection conn = db.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;	
			
			String sql="select * from member where email=?";
			
			try {
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, email);
				rs=pstmt.executeQuery();
				
				if (rs.next())
					mnum=rs.getString("mnum");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(rs, pstmt, conn);
			}
			return mnum;
		}

 	//마이페이지 > 탈퇴하기 (이메일,이름,비번 맞으면 탈퇴)
 	 	public boolean ismemNameEmailPass(String name, String email, String password)
 	 		   {
 	 		      boolean flag=false;
 	 		      
 	 		      Connection conn=db.getConnection();
 	 		      PreparedStatement pstmt=null;
 	 		      ResultSet rs=null;
 	 		      
 	 		      String sql="select * from member where name=? and email=? and password=?";
 	 		      
 	 		      try {
 	 		         pstmt=conn.prepareStatement(sql);
 	 		         
 	 		         pstmt.setString(1, name);
 	 		         pstmt.setString(2, email);
 	 		         pstmt.setString(3, password);
 	 		         
 	 		         rs=pstmt.executeQuery();
 	 		         
 	 		         if(rs.next())
 	 		        	 flag=true;
 	 		         
 	 		      } catch (SQLException e) {
 	 		         e.printStackTrace();
 	 		      } finally {
 	 		         db.dbClose(rs, pstmt, conn);
 	 		      }
 	 		      return flag;
 	 		   }

 	 	
 	 	//비밀번호 찾기 위한 이름,이메일 일치 메서드
 	 	public boolean ismemNameEmail(String name, String email)
		   {
		      boolean flag=false;
		      
		      Connection conn=db.getConnection();
		      PreparedStatement pstmt=null;
		      ResultSet rs=null;
		      
		      String sql="select * from member where name=? and email=?";
		      
		      try {
		         pstmt=conn.prepareStatement(sql);
		         
		         pstmt.setString(1, name);
		         pstmt.setString(2, email);
		         
		         rs=pstmt.executeQuery();
		         
		         if(rs.next())
		        	 flag=true;
		         
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } finally {
		         db.dbClose(rs, pstmt, conn);
		      }
		      return flag;
		   }
 	 	
 	 	//email에 따른 password값 반환 (비밀번호 찾기시 보여줄)
 	 	public String getPass(String email) {
 				
 				String password="";
 				
 				Connection conn = db.getConnection();
 				PreparedStatement pstmt = null;
 				ResultSet rs = null;	
 				
 				String sql="select * from member where email=?";
 				
 				try {
 					pstmt=conn.prepareStatement(sql);
 					pstmt.setString(1, email);
 					rs=pstmt.executeQuery();
 					
 					if (rs.next())
 						password=rs.getString("password");
 					
 				} catch (SQLException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}finally {
 					db.dbClose(rs, pstmt, conn);
 				}
 				return password;
 			}

   
}