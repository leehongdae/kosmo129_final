/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-08-02 07:50:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.contract;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contractInsertForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 

  	 String gcname = (String)request.getAttribute("gcname");
	 String genum = (String)request.getAttribute("genum");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>기안서(계약) page</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<link href=\"https://cdn.quilljs.com/1.3.6/quill.snow.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.quilljs.com/1.3.6/quill.js\"></script>\r\n");
      out.write("<script src=\"resources/js/common.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
      out.write("	//좀따 주석처리\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		\r\n");
      out.write("		var gcname = \"");
      out.print(gcname);
      out.write("\";\r\n");
      out.write("		var genum = \"");
      out.print(genum);
      out.write("\";\r\n");
      out.write("		\r\n");
      out.write("		$(\"#writer1\").text(gcname);\r\n");
      out.write("		$(\"#genum\").val(genum);\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		// 기능\r\n");
      out.write("		totalprice(); //합계 기능\r\n");
      out.write("		writerday(); //작성일자\r\n");
      out.write("		\r\n");
      out.write("		// 현재날짜 불러오기\r\n");
      out.write("		function writerday(){\r\n");
      out.write("			\r\n");
      out.write("			let md = new Date(); // md 월/일\r\n");
      out.write("			console.log(md);\r\n");
      out.write("			let year = md.getFullYear();\r\n");
      out.write("			let month = md.getMonth() + 1;\r\n");
      out.write("			let date = md.getDate();\r\n");
      out.write("			\r\n");
      out.write("			let day = year + \"-\" + numpad(month.toString()) + \"-\" + numpad(date.toString());\r\n");
      out.write("			\r\n");
      out.write("			$(\"#writeday\").text(day);\r\n");
      out.write("		};\r\n");
      out.write("		\r\n");
      out.write("			// 대표이사 동의사안 체크박스 택1 코드\r\n");
      out.write("            $(document).on(\"click\", \"#gcsign\", function(){\r\n");
      out.write("               \r\n");
      out.write("               if($(this).prop('checked')){          \r\n");
      out.write("                  //$('input[type=\"checkbox\"][name=\"mnum\"]').prop('checked',false);\r\n");
      out.write("                  $('.gcsign').prop('checked',false);\r\n");
      out.write("                  $(this).prop('checked',true);	\r\n");
      out.write("               }\r\n");
      out.write("            });\r\n");
      out.write("		\r\n");
      out.write("            // 계약형태 체크박스 택1 코드\r\n");
      out.write("            $(document).on(\"click\", \"#gcconform\", function(){\r\n");
      out.write("               \r\n");
      out.write("               if($(this).prop('checked')){          \r\n");
      out.write("                  $('.gcconform').prop('checked',false);\r\n");
      out.write("                  $(this).prop('checked',true);\r\n");
      out.write("               }\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			$(document).on(\"click\", \"#line12\", function() {\r\n");
      out.write("				$(\"#approval\").css({\r\n");
      out.write("					\"visibility\" : \"visible\"\r\n");
      out.write("				});\r\n");
      out.write("				$(\"#hide_div\").hide();\r\n");
      out.write("			});	\r\n");
      out.write("      	  $.ajax({\r\n");
      out.write("    		  url : \"getGtContractChabun.gos\",\r\n");
      out.write("    		  type : \"GET\",\r\n");
      out.write("    		  async : false,\r\n");
      out.write("      		  success:function(res){\r\n");
      out.write("    			  $(\"#gcnum1\").text(res);\r\n");
      out.write("    			  $(\"#gcnum\").val(res);\r\n");
      out.write("    			  \r\n");
      out.write("    		  },\r\n");
      out.write("    		  error:function(e){\r\n");
      out.write("    			  console.log(e.responseText)\r\n");
      out.write("    		  }\r\n");
      out.write("    		  \r\n");
      out.write("    	  });\r\n");
      out.write("      	  \r\n");
      out.write("\r\n");
      out.write("			// 결재선 상신 --------------\r\n");
      out.write("			$(document).on(\"click\", \"#cbtn\", function(){\r\n");
      out.write("				var pum = $(\".pum\");\r\n");
      out.write("	      		var pum2 = $(\".pum2\");\r\n");
      out.write("				var count = $(\".count\");\r\n");
      out.write("				var cost = $(\".cost\");\r\n");
      out.write("	      		var cost2 = $(\".cost2\");\r\n");
      out.write("				var pum1 = \"\";\r\n");
      out.write("	      		var count1 = \"\";\r\n");
      out.write("	      		var cost1 = \"\";\r\n");
      out.write("	      		var pum3 = \"\";\r\n");
      out.write("	      		var cost3 = \"\";\r\n");
      out.write("	      			\r\n");
      out.write("	      		  for(var i=0; i<pum.length; i++) {\r\n");
      out.write("	      			pum1 += pum[i].value + \",\";\r\n");
      out.write("	      			count1 += count[i].value + \",\";\r\n");
      out.write("	      			cost1 += cost[i].value + \",\";\r\n");
      out.write("	      			pum3 += pum2[i].value + \",\";\r\n");
      out.write("	      			cost3 += cost2[i].value + \",\";\r\n");
      out.write("\r\n");
      out.write("	      		  }\r\n");
      out.write("	      		  \r\n");
      out.write("	      		$(\"#gcsalitem\").val(pum1);\r\n");
      out.write("	      		$(\"#gcsalquantity\").val(count1);\r\n");
      out.write("	      		$(\"#gcsalamount\").val(cost1);\r\n");
      out.write("	      		$(\"#gcpuritem\").val(pum3);\r\n");
      out.write("	      		$(\"#gcpuramount\").val(cost3);\r\n");
      out.write("	      		\r\n");
      out.write("				var app = \"\";\r\n");
      out.write("				var appr = $(\".approver\");\r\n");
      out.write("				for (let i = 0; i < $(\".approver\").length; i++) {\r\n");
      out.write("					app += appr[i].innerHTML + \"/\";\r\n");
      out.write("				}\r\n");
      out.write("	\r\n");
      out.write("				var dept = \"\";\r\n");
      out.write("				var dept1 = $(\".dept\");\r\n");
      out.write("				for (let i = 0; i < $(\".dept\").length; i++) {\r\n");
      out.write("					dept += dept1[i].innerHTML + \"/\";\r\n");
      out.write("				}\r\n");
      out.write("// 				$(\"#writer\").val(gsname);\r\n");
      out.write("				$(\"#writer\").val($(\"#writer1\").text());\r\n");
      out.write("				$(\"#reference\").val($(\"#cham\").text());\r\n");
      out.write("				$(\"#approver\").val(app);\r\n");
      out.write("				$(\"#dept\").val(dept);\r\n");
      out.write("				\r\n");
      out.write("	       	let dataParam = $(\"#gcform\").serialize();\r\n");
      out.write("	       	   \r\n");
      out.write("	       	   $.ajax({\r\n");
      out.write("	 				url : \"contractInsert.gos\",\r\n");
      out.write("	  				data : dataParam,\r\n");
      out.write("	  				success : function(res){\r\n");
      out.write("							if(res == \"OK\"){\r\n");
      out.write("	  	        		  $(\"#fileform\").attr({\r\n");
      out.write("	  	        			  \"action\" : \"gtContractFileupload.gos\",\r\n");
      out.write("	  	        			  \"method\" : \"POST\",\r\n");
      out.write("	  	        			  \"enctype\": \"multipart/form-data\"\r\n");
      out.write("	  	        		  }).submit();\r\n");
      out.write(" 							}else{\r\n");
      out.write("								alert(\"입력 실패\");\r\n");
      out.write("							}\r\n");
      out.write("	  				},\r\n");
      out.write("	  				error : function(e){\r\n");
      out.write("	  					console.log(e.responseText);\r\n");
      out.write("	  				}\r\n");
      out.write("	  			});\r\n");
      out.write("	          \r\n");
      out.write("	       });\r\n");
      out.write("       		\r\n");
      out.write("		// 합계\r\n");
      out.write("		$(document).on('input','#price1_',function(){\r\n");
      out.write("			totalprice();\r\n");
      out.write("		});\r\n");
      out.write("		$(document).on('input','#price2_',function(){\r\n");
      out.write("			totalprice();\r\n");
      out.write("		});\r\n");
      out.write("		$(document).on('input','#price3_',function(){\r\n");
      out.write("			totalprice();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$(document).on('input','#num1_',function(){\r\n");
      out.write("			totalprice();\r\n");
      out.write("		});\r\n");
      out.write("		$(document).on('input','#num2_',function(){\r\n");
      out.write("			totalprice();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$(document).on('input','#num3_',function(){\r\n");
      out.write("			totalprice();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$(document).on('input','#price4_',function(){\r\n");
      out.write("			totalprice();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$(document).on('input','#price5_',function(){\r\n");
      out.write("			totalprice();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$(document).on('input','#price6_',function(){\r\n");
      out.write("			totalprice();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		function totalprice(){\r\n");
      out.write("			\r\n");
      out.write("			var price1 = $(\"#price1_\").val();//매출\r\n");
      out.write("			var price2 = $(\"#price2_\").val();\r\n");
      out.write("			var price3 = $(\"#price3_\").val();\r\n");
      out.write("			var price4 = $(\"#price4_\").val();//매입\r\n");
      out.write("			var price5 = $(\"#price5_\").val();\r\n");
      out.write("			var price6 = $(\"#price6_\").val();\r\n");
      out.write("			var num1 = $(\"#num1_\").val();\r\n");
      out.write("			var num2 = $(\"#num2_\").val();\r\n");
      out.write("			var num3 = $(\"#num3_\").val();\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("				if(price1 == \"\"){ //금액\r\n");
      out.write(" 						price1 = \"0\" ;\r\n");
      out.write(" 					}\r\n");
      out.write("				if(price2 == \"\"){\r\n");
      out.write("						price2 = \"0\" ;\r\n");
      out.write("					}\r\n");
      out.write("				if(price3 == \"\"){\r\n");
      out.write("						price3 = \"0\" ;\r\n");
      out.write("					}\r\n");
      out.write("				\r\n");
      out.write("				if(price4 == \"\"){\r\n");
      out.write("						price4 = \"0\" ;\r\n");
      out.write("					}\r\n");
      out.write("				if(price5 == \"\"){\r\n");
      out.write("						price5 = \"0\" ;\r\n");
      out.write("					}\r\n");
      out.write("				if(price6 == \"\"){\r\n");
      out.write("						price6 = \"0\" ;\r\n");
      out.write("					}\r\n");
      out.write("				\r\n");
      out.write("				if(num1 == \"\"){ //수량\r\n");
      out.write("						num1 = \"0\" ;\r\n");
      out.write(" 					}\r\n");
      out.write("				\r\n");
      out.write("				if(num2 == \"\"){\r\n");
      out.write("						num2 = \"0\" ;\r\n");
      out.write("					}\r\n");
      out.write("				\r\n");
      out.write("				if(num3 == \"\"){\r\n");
      out.write("						num3 = \"0\" ;\r\n");
      out.write("					}\r\n");
      out.write("\r\n");
      out.write("					// 소계\r\n");
      out.write("					var totalprice = (parseInt(price1)*parseInt(num1)) + (parseInt(price2)*parseInt(num2)) + (parseInt(price3)*parseInt(num3));\r\n");
      out.write("		        	var aa = (Math.floor(totalprice/10)*10);\r\n");
      out.write("		        	\r\n");
      out.write("		        	$(\"#totalprice_1\").text(comma(aa) + \"원\");//매출\r\n");
      out.write("		        	\r\n");
      out.write("		        	$(\"#totalprice\").val(totalprice);\r\n");
      out.write("		        	\r\n");
      out.write("		        	// 부가세\r\n");
      out.write("		        	var a = $(\"#totalprice_1\").text(); //소계값을 가져오는 것\r\n");
      out.write("		        	var b = a.replace(\"원\",\"\"); //원 제거\r\n");
      out.write("		        	var c = comma_replace(b); //콤마 제거\r\n");
      out.write("		        	var d = (Math.floor((totalprice/10)/10)*10);\r\n");
      out.write("		        	var e = comma(d.toString()); //계산 후에 콤마 붙이기\r\n");
      out.write("		        	\r\n");
      out.write("		        	$(\"#totalprice_2\").text(e + \"원\"); //부가세 나타내기 \r\n");
      out.write("		        	\r\n");
      out.write("		        	// 매출합계 \r\n");
      out.write("		        	var f = aa + d;\r\n");
      out.write("		        	\r\n");
      out.write("		        	$(\"#totalprice_3\").text(comma(f) + \"원\");\r\n");
      out.write("		        	\r\n");
      out.write("		        	// 매입합계\r\n");
      out.write("		        	var totalprice_4 = parseInt(price4) + parseInt(price5) + parseInt(price6);\r\n");
      out.write("		        	$(\"#totalprice_4\").text(comma(totalprice_4) + \"원\");\r\n");
      out.write("		        	\r\n");
      out.write("		        	// 매출이익\r\n");
      out.write("		        	$(\"#totalprice_5\").text(comma(f) + \"원\"); //매출값\r\n");
      out.write("		        	$(\"#totalprice_6\").text(comma(totalprice_4) + \"원\"); //매입값\r\n");
      out.write("		        	\r\n");
      out.write("		        	var ftotal = f - totalprice_4; //이익값\r\n");
      out.write("		        	$(\"#totalprice_7\").text(comma(ftotal)+ \"원\");\r\n");
      out.write("		        	\r\n");
      out.write("		    \r\n");
      out.write("		        }\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".button-container {\r\n");
      out.write("	text-align: right;\r\n");
      out.write("	width:1000px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".initial-size {\r\n");
      out.write("	min-height: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("	background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("	border-collapse: collapse;\r\n");
      out.write("	width: 1000px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("	border: 1px solid black;\r\n");
      out.write("	padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#approval {\r\n");
      out.write("	visibility: hidden;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"approval\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../approvalline/select.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"hide_div\">\r\n");
      out.write("	<form id=\"gcform\">\r\n");
      out.write("	<input type=\"hidden\" id=\"gcnum\" name=\"gcnum\">\r\n");
      out.write("		<div>\r\n");
      out.write("			<input type=\"hidden\" id=\"approver\" name=\"approver\" value=\"\">\r\n");
      out.write("			<input type=\"hidden\" id=\"dept\" name=\"dept\" value=\"\">\r\n");
      out.write("			<input type=\"hidden\" id=\"gcsalitem\" name=\"gcsalitem\" value=\"\">\r\n");
      out.write("			<input type=\"hidden\" id=\"gcsalquantity\" name=\"gcsalquantity\" value=\"\">\r\n");
      out.write("			<input type=\"hidden\" id=\"gcsalamount\" name=\"gcsalamount\" value=\"\">\r\n");
      out.write("			<input type=\"hidden\" id=\"gcpuritem\" name=\"gcpuritem\" value=\"\">\r\n");
      out.write("			<input type=\"hidden\" id=\"gcpuramount\" name=\"gcpuramount\" value=\"\">\r\n");
      out.write("			<input type=\"hidden\" id=\"writer\" name=\"writer\" value=\"\">\r\n");
      out.write("			<input type=\"hidden\" id=\"reference\" name=\"reference\" value=\"\">\r\n");
      out.write("			<input type=\"hidden\" id=\"genum\" name=\"genum\" value=\"\">\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("      <div class=\"button-container\">\r\n");
      out.write("         <button type=\"button\" id=\"line12\" onclick=testFn();>결재선지정</button>\r\n");
      out.write("         <button type=\"button\" id=\"cbtn\">상신</button>\r\n");
      out.write("         <button type=\"button\" id=\"cbtn1\">취소</button>\r\n");
      out.write("      </div>\r\n");
      out.write("	\r\n");
      out.write("		<h2 align=\"center\">기안서(계약건)</h2>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"120px\">문서번호</th>\r\n");
      out.write("				<td width=\"230px\" id=\"gcnum1\"></td>\r\n");
      out.write("				<th width=\"120px\">보안구분</th>\r\n");
      out.write("				<td width=\"230px\">비공개</td>\r\n");
      out.write("				<!--  채번 -->\r\n");
      out.write("				<th width=\"120px\">보존연한</th>\r\n");
      out.write("				<td width=\"230px\">5년</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"100px\">작성자</th>\r\n");
      out.write("				<td width=\"230px\" id=\"writer1\"></td>\r\n");
      out.write("				<!-- 작성자 -->\r\n");
      out.write("				<th width=\"120px\">작성일자</th>\r\n");
      out.write("				<td width=\"230px\" id=\"writeday\" colspan=\"3\"></td>\r\n");
      out.write("				<!-- 작성일자 -->\r\n");
      out.write("				\r\n");
      out.write("							</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table style=\"text-align: center\" id=\"table1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"5%\">순서</th>\r\n");
      out.write("				<th width=\"8%\">구분</th>\r\n");
      out.write("				<th width=\"17%\">결재자</th>\r\n");
      out.write("				<th width=\"17%\">부서</th>\r\n");
      out.write("				<th width=\"8%\">상태</th>\r\n");
      out.write("				<th width=\"10%\">결재일</th>\r\n");
      out.write("				<th width=\"35%\">결재의견</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">1</td>\r\n");
      out.write("				<td id=\"snag1\"></td>\r\n");
      out.write("				<td id=\"hu1\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept1\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">2</td>\r\n");
      out.write("				<td id=\"snag2\"></td>\r\n");
      out.write("				<td id=\"hu2\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept2\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">3</td>\r\n");
      out.write("				<td id=\"snag3\"></td>\r\n");
      out.write("				<td id=\"hu3\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept3\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">4</td>\r\n");
      out.write("				<td id=\"snag4\"></td>\r\n");
      out.write("				<td id=\"hu4\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept4\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\">5</td>\r\n");
      out.write("				<td id=\"snag5\"></td>\r\n");
      out.write("				<td id=\"hu5\" class=\"approver\"></td>\r\n");
      out.write("				<td id=\"dept5\" class=\"dept\"></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table id=\"cham1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"15%\">참 조</th>\r\n");
      out.write("				<td id=\"cham\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("\r\n");
      out.write("		<!-- 제목 -->\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"15%\">제 목</th>\r\n");
      out.write("				<td>\r\n");
      out.write("					<input type=\"text\" name=\"gcsubject\" id=\"gcsubject\" size=\"120px\">\r\n");
      out.write("				</td>\r\n");
      out.write("				<!-- 제목 -->\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br> <br>\r\n");
      out.write("\r\n");
      out.write("		<!-- 검토 유도 -->\r\n");
      out.write("		<table border=\"3\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan='1'>\r\n");
      out.write("					<input type=\"text\" size=\"135px\"\r\n");
      out.write("						value=\"다음과  같이                  에  대한                 을(를)  하고자  하오니  검토  후  재가하여  주시기  바랍니다.\">\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("\r\n");
      out.write("		<div>\r\n");
      out.write("			<span\r\n");
      out.write("				style=\"display: block; text-align: center; height: 50px; font-size: 20px; font-weight: bold;\">-\r\n");
      out.write("				다 음 -</span>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br>\r\n");
      out.write("\r\n");
      out.write("		<table>\r\n");
      out.write("			<!-- 매출, 매입, 계약, 계약형태 -->\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"15%\">1. 매 출 처</th>\r\n");
      out.write("				<td><input type=\"text\" name=\"gcsalplace\" id=\"gcsalplace\"\r\n");
      out.write("					size=\"120%\" placeholder=\"XXXX 주식회사\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"15%\">2. 매 입 처</th>\r\n");
      out.write("				<td><input type=\"text\" name=\"gcpurchase\" id=\"gcpurchase\"\r\n");
      out.write("					size=\"120%\" placeholder=\"XXXX 주식회사\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"15%\">3. 계약(매출)내용</th>\r\n");
      out.write("				<td><textarea rows=\"8\" cols=\"121\" name=\"gccontent\"\r\n");
      out.write("						id=\"gccontent\" placeholder=\" 계약명  / 계약 금액  / 예정 날짜  / 발주처\"></textarea>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"133px\">계 약 형 태</th>\r\n");
      out.write("				<td style=\"text-align:left;\">\r\n");
      out.write("					<input type=\"checkbox\" class=\"gcconform\" name=\"gcconform\" id=\"gcconform\" value=\"0\">구매 \r\n");
      out.write("					<input type=\"checkbox\" class=\"gcconform\" name=\"gcconform\" id=\"gcconform\" value=\"1\">계약 \r\n");
      out.write("					<input type=\"checkbox\" class=\"gcconform\" name=\"gcconform\" id=\"gcconform\" value=\"2\">매출 \r\n");
      out.write("					<input type=\"checkbox\" class=\"gcconform\" name=\"gcconform\" id=\"gcconform\" value=\"3\">입찰\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("\r\n");
      out.write("		<!-- 매출 계산 -->\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"4\">매출</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th></th>\r\n");
      out.write("				<th>품목</th>\r\n");
      out.write("				<th>수량</th>\r\n");
      out.write("				<th>금액</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\"><input type=\"checkbox\"></td>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"80\" class=\"pum\"></td>\r\n");
      out.write("				<!-- 품목 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"20\" class=\"count\" id=\"num1_\" style=\"text-align: right\"></td>\r\n");
      out.write("				<!-- 수량 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"20\" id=\"price1_\" style=\"text-align: right\" class=\"cost\"></td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\"><input type=\"checkbox\"></td>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"80\" class=\"pum\"></td>\r\n");
      out.write("				<!-- 품목 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"20\" class=\"count\" id=\"num2_\" style=\"text-align: right\"></td>\r\n");
      out.write("				<!-- 수량 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"20\" id=\"price2_\" style=\"text-align: right\" class=\"cost\"></td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("			</tr>			\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\"><input type=\"checkbox\"></td>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"80\" class=\"pum\"></td>\r\n");
      out.write("				<!-- 품목 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"20\" class=\"count\" id=\"num3_\" style=\"text-align: right\"></td>\r\n");
      out.write("				<!-- 수량 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"20\" id=\"price3_\" style=\"text-align: right\" class=\"cost\"></td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>\r\n");
      out.write("					<!-- 소계 칸 -->\r\n");
      out.write("				<td colspan=\"1\"\r\n");
      out.write("					style='text-align: center; background-color: #f2f2f2; font-weight: bold;'\r\n");
      out.write("					width=\"200px\">소 계</td>\r\n");
      out.write("				<td colspan=\"2\" width=\"80px\" style=\"text-align: right;\"\r\n");
      out.write("					id=\"totalprice_1\"></td>\r\n");
      out.write("				</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>\r\n");
      out.write("					<!-- 부가세 칸 -->\r\n");
      out.write("				<td colspan=\"1\"\r\n");
      out.write("					style='text-align: center; background-color: #f2f2f2; font-weight: bold;'\r\n");
      out.write("					width=\"200px\">부 가 세</td>\r\n");
      out.write("				<td colspan=\"2\" width=\"80px\" style=\"text-align: right;\"\r\n");
      out.write("					id=\"totalprice_2\"></td>\r\n");
      out.write("				</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>\r\n");
      out.write("					<!-- 합계 칸 -->\r\n");
      out.write("				<td colspan=\"1\"\r\n");
      out.write("					style='text-align: center; background-color: #f2f2f2; font-weight: bold;' width=\"200px\">합 계</td>\r\n");
      out.write("				<td colspan=\"2\" width=\"80px\" style=\"text-align: right;\" id=\"totalprice_3\"></td>\r\n");
      out.write("				</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("\r\n");
      out.write("		<!-- 매입 계산 -->\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"5\">매입</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th></th>\r\n");
      out.write("				<th>매입처</th>\r\n");
      out.write("				<th>품목</th>\r\n");
      out.write("				<th>금액</th>\r\n");
      out.write("				<th>비고</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\"><input type=\"checkbox\"></td>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"25\"></td>\r\n");
      out.write("				<!-- 매입처 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"40\" class=\"pum2\"></td>\r\n");
      out.write("				<!-- 품목 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"20\" id=\"price4_\" style=\"text-align: right\" class=\"cost2\"></td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"25\"></td>\r\n");
      out.write("				<!-- 비교 -->\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\"><input type=\"checkbox\"></td>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"25\"></td>\r\n");
      out.write("				<!-- 매입처 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"40\" class=\"pum2\"></td>\r\n");
      out.write("				<!-- 품목 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"20\" id=\"price5_\" style=\"text-align: right\" class=\"cost2\"></td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"25\"></td>\r\n");
      out.write("				<!-- 비교 -->\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\"><input type=\"checkbox\"></td>\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"25\"></td>\r\n");
      out.write("				<!-- 매입처 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"40\" class=\"pum2\"></td>\r\n");
      out.write("				<!-- 품목 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"20\" id=\"price6_\" style=\"text-align: right\" class=\"cost2\"></td>\r\n");
      out.write("				<!-- 금액 -->\r\n");
      out.write("				<td align=\"center\"><input type=\"text\" size=\"25\"></td>\r\n");
      out.write("				<!-- 비교 -->\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>\r\n");
      out.write("					<!-- 합계 칸 -->\r\n");
      out.write("				<td colspan=\"2\"\r\n");
      out.write("					style='text-align: center; background-color: #f2f2f2; font-weight: bold;'\r\n");
      out.write("					width=\"200px\">합 계</td>\r\n");
      out.write("				<td colspan=\"2\" width=\"80px\" style=\"text-align: right;\"\r\n");
      out.write("					id=\"totalprice_4\"></td>\r\n");
      out.write("				</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("\r\n");
      out.write("		<!-- 매출이익 계산 -->\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"2\" style=\"width: 500px\">매출이익</th>\r\n");
      out.write("				<th colspan=\"1\" style=\"width: 500px\">비고</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"1\" width=\"20%\">매 출</th>\r\n");
      out.write("				<td style=\"text-align: right;\" id=\"totalprice_5\"></td>\r\n");
      out.write("				<td rowspan=\"3\"><textarea rows=\"7\" cols=\"70\"></textarea></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"1\" width=\"20%\">매 입</th>\r\n");
      out.write("				<td style=\"text-align: right;\" id=\"totalprice_6\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"1\" width=\"20%\">이 익</th>\r\n");
      out.write("				<td style=\"text-align: right;\" id=\"totalprice_7\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- 계약서 첨부 칸 -->\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"20%\">첨 부 서</th>\r\n");
      out.write("				<td><input type=\"text\" name=\"gcattach\" size=\"110\" placeholder=\"계약서 1부\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<th width=\"20%\">대표이사 동의 사안</th>\r\n");
      out.write("				<td>\r\n");
      out.write("					<div style=\"text-align:left;\">\r\n");
      out.write("						<input type=\"checkbox\" class=\"gcsign\" name=\"gcsign\" id=\"gcsign\" value=\"0\" checked>사용인감 날인 \r\n");
      out.write("						<input type=\"checkbox\" class=\"gcsign\" name=\"gcsign\" id=\"gcsign\" value=\"1\">법인인감 날인\r\n");
      out.write("					</div>\r\n");
      out.write("				</td>\r\n");
      out.write("			</th>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("	</form>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- 첨부파일 -->\r\n");
      out.write("	<form id=\"fileform\">\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"20%\">첨 부 파 일</th>\r\n");
      out.write("				<td class=\"left-align\" style='text-align: left;'><input type=\"file\" name=\"gcfile\" id=\"gcfile\" multiple></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
