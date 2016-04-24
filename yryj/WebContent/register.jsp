<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>注册</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="css/bootstrap.css"/>
		<link rel="stylesheet" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" href="css/bootstrapValidator.min.css"/>
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<script src="js/bootstrapValidator.min.js"></script>
		<script src="js/bootstrapValidator_zh_CN.js"></script>
</head>
	<body style="background-color:#EDEDED ">
	    <div class="container">
	        <div class="row">
				
					<p style="text-align:center; margin:auto"><img src="pics\logopic.png"  /></p>
				
	            <section>
	                <div class="col-lg-6 col-lg-offset-3" style="margin-top:-50px">
	                    <form id="defaultForm" method="post" action="register.action">
	                            
								<div class="form-group row" >
									<div class="col-lg-8 col-lg-offset-2"> <input type="text" id="name" name="username" class="form-control col-lg-5" placeholder="用户名"/></div>
								</div>
								
								<div class="form-group row" >
									<div class="col-lg-8 col-lg-offset-2"> <input type="text" id="email" name="email" class="form-control col-lg-5" placeholder="邮箱"/></div>
								</div>
								
	                            <div class="form-group row">
	                                <div class="col-lg-8 col-lg-offset-2"> <input type="password" id="password" name="password" class="form-control" placeholder="密码"/></div>
	                            </div>
								
								<div class="form-group row">
	                                <div class="col-lg-8 col-lg-offset-2"> <input type="password" id="repassword" name="repassword" class="form-control" placeholder="确认密码"/></div>
	                            </div>
								
	                        <div class="form-group row">
									<button type="submit" class="btn btn-primary col-lg-offset-5">注册</button>	
									<a href="login.jsp" class="col-lg-offset-1">已经有账号</a>
	                        </div>
							
	                    </form>
	                </div>
	            </section>
	        </div>
	    </div>
	    
	    
		<script type="text/javascript">
		$(document).ready(function() {
		    $('#defaultForm').bootstrapValidator({
		        message: 'This value is not valid',
		        feedbackIcons: {
		            valid: 'glyphicon glyphicon-ok',
		            invalid: 'glyphicon glyphicon-remove',
		            validating: 'glyphicon glyphicon-refresh'
		        },
				fields: {
		            username: {
		                message: 'The username is not valid',
		                validators: {
		                    notEmpty: {
		                        message: '用户名不能为空'
		                    },
							stringLength: {
		                        min: 6,
		                        max: 18,
		                        message: '用户名不能短于6位长于18位'
		                    },
							regexp: {
		                        regexp: /^[a-zA-Z0-9_\.]+$/,
		                        message: '用户名只能包含数字，字母，下划线，英文句号'
		                    }
		                }
		            },
					email: {
		                validators: {
		                    notEmpty: {
		                        message: '邮箱不能为空'
		                    },
		                    emailAddress: {
		                        message: '输入的不是合法邮箱'
		                    }
		                }
		            },
		            password: {
		                validators: {
		                    notEmpty: {
		                        message: '密码不能为空'
		                    }
		                }
		            },
		            repassword: {
		                validators: {
		                    notEmpty: {
		                        message: '不能为空'
		                    },
		                    identical: {
		                        field: 'password',
		                        message: '两次密码不一致'
		                    }
		                }
		            },
		        }
		    });
		});
		</script>
	</body>
</html>

