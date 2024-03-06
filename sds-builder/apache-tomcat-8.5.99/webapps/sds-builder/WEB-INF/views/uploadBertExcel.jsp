<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="<c:url value='/js/jquery-1.10.2.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/js/common.js?ver=9'/>"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script>
    <script src="http://malsup.github.com/jquery.form.js"></script>
    <script type="text/javascript">
      function checkFileType(filePath) {
        var fileFormat = filePath.split(".");
        if (fileFormat.indexOf("xlsx") > -1) {
          return true;
        } else {
          return false;
        }

      }

      function check1() {
        var file = $("#excelFile").val();
        var account = $("#host").val();
        if (account == "" || account == null) {
          alert("챗봇이름을 입력해주세요.")
          return false;
        }
        if (file == "" || file == null) {
          alert("파일을 선택해주세요.");
          return false;
        } else if (!checkFileType(file)) {
          alert("엑셀 파일만 업로드 가능합니다.");
          return false;
        }

        if (confirm("업로드 하시겠습니까?")) {
          var options = {
            success: function (data) {
              alert("모든 데이터가 업로드 되었습니다.");

            }, error: function (data) {
              alert("작업 중 오류가 발생하였습니다.");
            },
            type: "POST"
          };
          $("#excelUploadForm").ajaxSubmit(options);

        }
      }

    </script>
</head>
<body>
<form id="excelUploadForm" name="excelUploadForm" method="post"
      action="${pageContext.request.contextPath}/upload/insertBertExcel">
    <div class="contents">
        <dl class="vm_name">
            <dd>챗봇 Account : <input id="host" type="text" name="host"/></dd>
            <dd><input id="excelFile" type="file" name="excelFile"/></dd>
        </dl>
    </div>

    <div class="bottom">
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <button type="button" id="addExcelImpoartBtn" class="btn" onclick="check1()"><span>추가</span>
        </button>
    </div>
    <br><br><br>
</form>


</body>
</html>