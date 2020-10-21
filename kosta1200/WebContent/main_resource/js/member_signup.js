$(function(){
	var empJ = /\s/g;//모든 공백체크 정규식
	var idJ = /^[a-z0-9]{4,12}$/;//아이디 정규식
	var pwJ = /^[A-Za-z0-9]{4,12}$/;// 비밀번호 정규식
	var nameJ = /^[가-힣]{2,6}$/;// 이름 정규식
	var mailJ = /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;
	var phoneJ = /^01([0|1|6|7|8|9]?)?([0-9]{3,4})?([0-9]{4})$/;// 휴대폰 번호 정규식
	console.log(1);
	$(".memberId_btn").click(function() {
        
        var userid =  $("#memberId").val(); 
        console.log(1);
    	console.log(userid);
        $.ajax({
            async: true,
            type : 'Post',
            data : "userid="+userid,
            url : "../../Member/MemberIdCheckList.do",
            dataType : "text",
            success : function(data) {
            	console.log(data);
                if (data > 0) {
                    alert("아이디가 존재합니다. 다른 아이디를 입력해주세요.");
                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-error")
                    $("#divInputId").removeClass("has-success")
                    $("#userid").focus();
                    
                
                } else {
                    alert("사용가능한 아이디입니다.");
                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-success")
                    $("#divInputId").removeClass("has-error")
                    $("#userpwd").focus();
                    //아이디가 중복하지 않으면  idck = 1 
                    idck = 1;
                    
                }
            },
            error : function(error) {
                
                alert("error : " + error);
            }
        });
    });
 
	
	$('#memberId').blur(function(){
		if(idJ.test($(this).val())){
			$("#id_check").text('패턴일치함');
			$("#id_check").css('color','blue');
		}else {
			$('#id_check').text('아이디를 확인해주세요');
			$('#id_check').css('color', 'red');
		}
	});
	
	$('#memberEmail').blur(function(){
		if(mailJ.test($(this).val())){
			$("#mail_check").text('패턴일치함');
			$("#mail_check").css('color','blue');
		} else {
			$('#mail_check').text('메일을 확인해주세요');
			$('#mail_check').css('color', 'red');
		}
	});

	
	$('#memberPhone').blur(function(){
		if(phoneJ.test($(this).val())){
			$("#phone_check").text('패턴일치함');
			$("#phone_check").css('color','blue');
		} else {
			$('#phone_check').text('휴대폰번호를 확인해주세요');
			$('#phone_check').css('color', 'red');
		}
	});
	
	$('#userPw').blur(function(){
		if(pwJ.test($(this).val())){
			$("#password_check").text('패턴일치');
			$("#password_check").css('color','blue');
		} else {
			$('#password_check').text('비밀번호를 확인해주세요');
			$('#password_check').css('color', 'red');
		}
	});

	
    $('#userPw').keyup(function(){
      $('#chkNotice').html('');
    });

    $('#userPwChk').keyup(function(){

        if($('#userPw').val() != $('#userPwChk').val()){
          $('#chkNotice').html('비밀번호 일치하지 않음<br><br>');
          $('#chkNotice').attr('color', '#f82a2aa3');
        } else{
          $('#chkNotice').html('비밀번호 일치함<br><br>');
          $('#chkNotice').attr('color', '#199894b3');
        }
        
    });
});
function openZipSearch() {
    new daum.Postcode({
          oncomplete: function(data) {
              $('[name=memberAddress]').val(data.address);
          }
    }).open();
} 