유저		UserController
----------------------------------------------------------------------------
로그인 화면	http://localhost/restful/user/ 							(GET)
로그인 처리	http://localhost/restful/user/ 							(POST)

게시판 		BoardController
----------------------------------------------------------------------------
리스트		http://localhost/restful/board/		
생성화면	http://localhost/restful/board/insert					(GET)	
생성처리	http://localhost/restful/board/insert					(POST)	

게시물		ArticleController
----------------------------------------------------------------------------
리스트		http://localhost/restful/board/{boa_no}/{pg}/
입력화면	http://localhost/restful/board/{boa_no}/{pg}/insert 	(GET)
입력처리	http://localhost/restful/board/{boa_no}/{pg}/insert		(POST)

게시물상세	ArticleDetailController
----------------------------------------------------------------------------
보기		http://localhost/restful/board/{boa_no}/{pg}/{art_no}/
수정		http://localhost/restful/board/{boa_no}/{pg}/{art_no}/update (GET)
수정처리	http://localhost/restful/board/{boa_no}/{pg}/{art_no}/update (POST)
삭제		http://localhost/restful/board/{boa_no}/{pg}/{art_no}/delete

게시물댓글	CommentController
----------------------------------------------------------------------------
리스트		http://localhost/restful/board/{boa_no}/{pg}/{art_no}/{cpg}/ 		(GET)
입력		http://localhost/restful/board/{boa_no}/{pg}/{art_no}/{cpg}/ 		(POST)
수정		http://localhost/restful/board/{boa_no}/{pg}/{art_no}/{cpg}/{com_no}(PUT)
삭제		http://localhost/restful/board/{boa_no}/{pg}/{art_no}/{cpg}/{com_no}(DELETE)






