<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BORAM3 비밀번호 찾기</title>
<link rel="stylesheet" href="../css/common.css">
<link rel="stylesheet" href="../css/find_password.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<!-- 메인 헤더 -->
<div class="header">
	<div class="headercontent">
            <a href="#" class="logo">
               <img src="../image/logo.png" alt="">
            </a>

            <div class="searchbar">
               	<form action="#" method="#">
    			 	<div class="searchinput">
    			 		<div>
    			 			<img alt="검색아이콘" src="data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMjQiIGhlaWdodD0iMjQiIHZpZXdCb3g9IjAgMCAyNCAyNCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KICAgIDxnIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+CiAgICAgICAgPHBhdGggZD0iTTAgMGgyNHYyNEgweiIvPgogICAgICAgIDxnIHRyYW5zZm9ybT0idHJhbnNsYXRlKDQgNCkiIHN0cm9rZT0iI0I1QjVCNSIgc3Ryb2tlLXdpZHRoPSIxLjYiPgogICAgICAgICAgICA8Y2lyY2xlIHN0cm9rZS1saW5lam9pbj0icm91bmQiIGN4PSI2LjUiIGN5PSI2LjUiIHI9IjYuNSIvPgogICAgICAgICAgICA8cGF0aCBzdHJva2UtbGluZWNhcD0icm91bmQiIGQ9Im0xMS41IDExLjUgNSA1Ii8+CiAgICAgICAgPC9nPgogICAgPC9nPgo8L3N2Zz4K">
    			 		</div>
    			 		<input type="search" placeholder="무엇을 배우고 싶나요?" name="">
    			 	</div>
				</form>
            </div>

            <div class="headerlogin">
                <a href="">로그인</a>
                <button type="button" class="gaipbtn">회원가입</button>
            </div>
	</div>
</div>

<div class="findPwdiv">
<!-- 비밀번호 찾기 헤더 -->
<span class="findPwHead">비밀번호 찾기</span>
<div class="findPwFrame">
	<form action="#" method="post" class="findPwForm">
		<table>
			<tr>
				<th align="left">이름을 입력해주세요</th>
			</tr>
			<tr>
				<td>
					<input type="text" required="required" class="form-control inputbox" placeholder="이름을 입력해주세요">
				</td>
			</tr>
			<tr>
				<th align="left" style="padding-top: 43px;">가입한 이메일 주소를 입력해주세요</th>
			</tr>
			<tr>
				<td>
					<input type="text" required="required" class="form-control inputbox" placeholder="이메일을 입력해주세요">
				</td>
			</tr>
			<tr>
				<td class="findPwBtn">
					<!-- 클릭시 submit -->
					<span>비밀번호 찾기</span>
				</td>
			</tr>
			<tr>
				<td class="preText">
<pre>
가입하신 이름과 이메일주소를 입력하고
비밀번호 찾기 버튼을 눌러주세요
비밀번호를 알려드립니다
</pre>
				</td>
			</tr>
			<tr>
				<td>
					<input type="text" readonly="readonly" class="form-contorl inputbox">
				</td>
			</tr>
		</table>
	</form>
</div>
</div>

<!-- 메인 푸터 -->
<div class="footer">
        <div class="footercontent">   
        <div class="topfooter">
            <span>
                <p class="footer-hp">3333-3333</p>
                <p class="footer-time">
                	평일 10:00 - 18:00<br>
                	(점심시간 13:00 - 14:00 제외 주말/공휴일 제외)
                </p>
                
                <a href="#">
                    <img src="https://assets.cdn.soomgo.com/icons/icon-download-appstore.svg" alt="앱스토어" class="footerbtn">
                    APP STORE
                </a>
                <a href="#">
                    <img src="https://assets.cdn.soomgo.com/icons/icon-download-palystore.svg" alt="플레이스토어" class="footerbtn">
                    PLAY STORE
                </a>
            </span>
            <span class="topfooter-right">
                <span>
                    <p class="contop">고객센터</p>
                    <p>문의하기</p>
                </span>
                <span>
                    <p class="contop">FAQ</p>
                    <p>이용안내</p>
                    <p>안전정책</p>
                    <p>예상금액</p>
                    <p>강사찾기</p>
                </span>
                <span>
                    <p class="contop">고객센터</p>
                    <p>보람가입</p>
                    <p>보람센터</p>
                    <p>보람가이드</p>
                    <p>제품안내</p>
                </span>
                <span>
                    <p class="contop">BORAM3조</p>
                    <p>이다솔</p>
                    <p>임현정</p>
                    <p>강나리</p>
                    <p>조아라</p>
                    <p>차동현</p>
                    <p>신지환</p>
                </span>

            </span>
            
        </div>
      
    </div>
    <div class="footer-bottom">
        <p>이용약관&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;개인정보처리방침&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;사업자 정보확인</p>
        <p class="f-boram3">
            (주)BORAM3 은 SEMI PROJECT 입니다<br>
            쌍용교육센터 보람3조 화이팅
        </p>
        <br>
        <p class="f-address">
            상호명:(주)BORAM3조 · 개인정보책임관리자:BORAM3· 주소:서울특별시 강남구 보람타워 3층<br>
            사업자등록번호:333-33-33333· 통신판매업신고증:제 3333-서울강남-3333 호 · 직업정보제공사업 신고번호:서울청 제 3333-33호<br>
            고객센터:3333-333 · 이메일:BORAM3@naver.com<br>
            Copyright ©Brave Mobile Inc. All Rights Reserved.
        </p>
            
    </div>
</div>
</body>
</html>