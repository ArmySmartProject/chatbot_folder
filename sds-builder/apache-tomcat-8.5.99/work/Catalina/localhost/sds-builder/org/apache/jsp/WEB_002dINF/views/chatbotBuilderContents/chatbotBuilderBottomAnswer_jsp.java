/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-03-06 04:56:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.chatbotBuilderContents;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chatbotBuilderBottomAnswer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/home/minds/maum/sds-builder/apache-tomcat-8.5.99/webapps/sds-builder/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153385082000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1617291808000L));
    _jspx_dependants.put("jar:file:/home/minds/maum/sds-builder/apache-tomcat-8.5.99/webapps/sds-builder/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153385082000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\">\n");
      out.write("\n");
      out.write("    <!-- cache 지우는 meta 태그 -->\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-cache\" /> <!-- 캐시가 되지 않도록 정의 -->\n");
      out.write("    <meta http-equiv=\"Pragma\" content=\"no-cache\" /> <!-- 캐시가 되지 않도록 정의 -->\n");
      out.write("    <meta http-equiv=\"Expires\" content=\"-1\"> <!-- 즉시 캐시만료 -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-ui-1.12.0/jquery-ui.min.css\"/>\n");
      out.write("\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-ui-1.12.0/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery.fileDownload.js\"></script>\n");
      out.write("    <title>chatbot builder Answer</title>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/builderContents/chatbotBuilderAnswer.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/rcrop.min.js\"></script>\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/rcrop.min.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- 모달 챗봇 삭제 -->\n");
      out.write("<div id=\"chat_list_delete\" class=\"lyrBox\">\n");
      out.write("    <div class=\"lyr_top\">\n");
      out.write("        <h3>챗봇 삭제</h3>\n");
      out.write("        <button class=\"btn_lyr_close\"><span class=\"text_hide\">닫기</span></button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_mid\">\n");
      out.write("        <p class=\"infoTxt\"><em>선택한 챗봇</em>을(를) 삭제합니다.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_btm\">\n");
      out.write("        <div class=\"btnBox sz_small\">\n");
      out.write("            <button type=\"button\" class=\"btn_primary btn_submit btn_lyr_close\">확인</button>\n");
      out.write("            <button type=\"button\" class=\"btn_primary btn_submit btn_lyr_close\">취소</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- //모달 챗봇 삭제 -->\n");
      out.write("\n");
      out.write("<!-- 모달 답변 파일 업로드 -->\n");
      out.write("<div id=\"chat_answer_upload\" class=\"lyrBox\">\n");
      out.write("    <div class=\"lyr_top\">\n");
      out.write("        <h3>엑셀 파일 업로드</h3>\n");
      out.write("        <button class=\"btn_lyr_close\"><span class=\"text_hide\">닫기</span></button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_mid\">\n");
      out.write("        <dl class=\"dl_inline\">\n");
      out.write("            <dt>\n");
      out.write("                <div class=\"iptBox\">\n");
      out.write("                    <!-- [D] input[file] value = input[text] value -->\n");
      out.write("                    <input type=\"text\" name=\"excel_file_name\" value=\"선택된 파일 없음\" class=\"ipt_txt ipt_file\" disabled>\n");
      out.write("                </div>\n");
      out.write("            </dt>\n");
      out.write("            <dd>\n");
      out.write("                <label for=\"excelFile\" class=\"label_file\">찾아보기..</label>\n");
      out.write("                <form id=\"chatUpload\" name=\"chatUpload\" method=\"post\" enctype=\"multipart/form-data\"\n");
      out.write("                      action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/upload/insertChatExcel\">\n");
      out.write("                <input type=\"file\" name=\"excelFile\" id=\"excelFile\" accept=\".xls, .xlsx\" style=\"display: none;\">\n");
      out.write("                <input type=\"text\" name=\"host\" style=\"display: none;\">\n");
      out.write("                </form>\n");
      out.write("            </dd>\n");
      out.write("        </dl>\n");
      out.write("        <p class=\"info_text\">* 파일 업로드 시 태스크 및 답변이 덮어쓰기 됩니다.</p>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"progress\" style=\"display: none;\"><div class=\"progress_bar\" style=\"transform: translate(30%)\"></div></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_btm\">\n");
      out.write("        <div class=\"btnBox sz_small\">\n");
      out.write("            <button type=\"button\" id=\"btn_upload\" class=\"btn_primary btn_submit\" onclick=\"uploadExcel()\">저장</button>\n");
      out.write("            <button type=\"button\" class=\"btn_primary btn_lyr_close\">취소</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- //모달 답변 파일 업로드 -->\n");
      out.write("\n");
      out.write("<!-- 모달 답변 삭제 -->\n");
      out.write("<div id=\"chat_row_delete\" class=\"lyrBox\">\n");
      out.write("    <div class=\"lyr_top\">\n");
      out.write("        <h3>챗봇 답변 삭제</h3>\n");
      out.write("        <button class=\"btn_lyr_close\"><span class=\"text_hide\">닫기</span></button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_mid\">\n");
      out.write("        <p class=\"infoTxt\"><em>선택한 태스크</em>을(를) 삭제합니다.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_btm\">\n");
      out.write("        <div class=\"btnBox sz_small\">\n");
      out.write("            <button type=\"button\" class=\"btn_primary btn_submit btn_lyr_close\">확인</button>\n");
      out.write("            <button type=\"button\" class=\"btn_primary btn_submit btn_lyr_close\">취소</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- //모달 답변 삭제 -->\n");
      out.write("\n");
      out.write("<!-- 모달 개별 추가 및 설정 -->\n");
      out.write("<div id=\"chat_answer_setting\" class=\"lyrBox\">\n");
      out.write("    <div class=\"lyr_top\">\n");
      out.write("        <h3>챗봇 답변</h3>\n");
      out.write("        <div class=\"lang_list\" id=\"ans_detail_lang_list\">\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"korea none\" onclick=\"langDetailOnclick(1)\">한국어</li>\n");
      out.write("                <li class=\"us none\"    onclick=\"langDetailOnclick(2)\">영어</li>\n");
      out.write("                <li class=\"japan none\" onclick=\"langDetailOnclick(3)\">일본어</li>\n");
      out.write("                <li class=\"china none\" onclick=\"langDetailOnclick(4)\">중국어</li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"btn_lyr_close\"><span class=\"text_hide\">닫기</span></button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_mid\">\n");
      out.write("        <div class=\"skeleton\"><img src=\"../images/skeleton_answer.png\" alt=\"백그라운드\"></div>\n");
      out.write("        <div class=\"chat_setting answer_preview\">\n");
      out.write("            <div class=\"ipt_container\" id=\"ori_ipt\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ipt_container\" id=\"sec_ipt\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <ul class=\"chat_preview scroll\" id=\"chat_intent_answer_preview\">\n");
      out.write("            <li class=\"bot botMsg_swiper swiper-container\" id=\"chat_preview_carousel\">\n");
      out.write("                <div class=\"swiper-wrapper\">\n");
      out.write("                    <div class=\"swiper-slide\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-pagination\"></div>\n");
      out.write("                <div class=\"swiper-button-prev\"></div>\n");
      out.write("                <div class=\"swiper-button-next\"></div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"bot\" id=\"chat_preview_answer\">\n");
      out.write("                <div id=\"answerPreview\" class=\"txt\">답변</div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"bot\" id=\"chat_preview_button\">\n");
      out.write("                <div class=\"bot_msg\">\n");
      out.write("                    <div class=\"btnItem\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a class=\"intent btnStart\" href=\"#\" data-display=\"처음으로\" data-intent=\"처음으로\">처음으로</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_btm\">\n");
      out.write("        <div class=\"btnBox sz_small\">\n");
      out.write("            <button type=\"button\" class=\"btn_primary btn_submit btn_lyr_close_submit\">확인</button>\n");
      out.write("            <button type=\"button\" class=\"btn_primary btn_submit btn_lyr_close\">취소</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- //모달 개별 추가 및 설정 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 서브모달 이미지 카드 이미지 등록 -->\n");
      out.write("<div id=\"carousel_image_setting\" class=\"lyrBox sub_lyr\">\n");
      out.write("    <div class=\"lyr_top\">\n");
      out.write("        <h3>이미지 등록</h3>\n");
      out.write("        <button class=\"btn_lyr_close\" id=\"btn_setting_lyr_close_id\" onclick=\"exitCropPage()\"><span class=\"text_hide\">닫기</span></button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_mid\">\n");
      out.write("        <dl class=\"dl_inline\">\n");
      out.write("            <dt>\n");
      out.write("                <div class=\"iptBox\">\n");
      out.write("                    <input type=\"text\" name=\"carousel_image_file\" value=\"선택된 파일 없음\" class=\"ipt_txt ipt_file\" disabled=\"\">\n");
      out.write("                </div>\n");
      out.write("            </dt>\n");
      out.write("            <dd>\n");
      out.write("                <label for=\"carousel_image_file\" class=\"label_file\">찾아보기..</label>\n");
      out.write("                <input type=\"file\" name=\"\" id=\"carousel_image_file\" accept=\"image/*\" onchange=\"setFileName()\" style=\"display: none;\">\n");
      out.write("            </dd>\n");
      out.write("        </dl>\n");
      out.write("        <p class=\"info_text\" style=\"display: inline-block\">* 이미지는 360x300(6:5)이 최적 사이즈입니다.</p>\n");
      out.write("        <p class=\"size_info_text\" id=\"size_info\"> 360x300(6:5) </p>\n");
      out.write("        <div class=\"image_setting\">\n");
      out.write("            <p class=\"choose_img\">이미지를 선택해주세요.</p>\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/sample/sample_image_crop.png\" alt=\"샘플이미지\" style=\"width: 100%;  height: 100%;\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lyr_btm\">\n");
      out.write("        <div class=\"btnBox sz_small\">\n");
      out.write("            <button type=\"button\" class=\"btn_primary btn_lyr_close_submit_img_set\" onclick=\"cropImageSubmit()\">확인</button>\n");
      out.write("            <button type=\"button\" class=\"btn_primary btn_lyr_close_end_img_set\" onclick=\"exitCropPage()\">취소</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div title=\"Data Download\" id=\"preparing-file-modal\" style=\"display: none;\">\n");
      out.write("    <div id=\"progressbar\" style=\"width: 100%; height: 22px; margin-top: 20px;\"></div>\n");
      out.write("</div>\n");
      out.write("<div title=\"Error\" id=\"error-modal\" style=\"display: none;\">\n");
      out.write("    <p>생성실패.</p>\n");
      out.write("</div>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    .txt_btn {display:block; padding:10px 0 0 0; text-align:center;}\n");
      out.write("    .txt_btn a {display:inline-block; height:30px; padding:0 15px; font-size:13px; text-align:center; text-decoration:none !important; line-height:28px; border:1px solid #ebeaef; border-radius:50px; box-shadow:rgba(53,60,79,0) 0 0 0 2px inset; background:#fff; color:rgba(53,60,79,1.0) !important; transition:all 0.3s ease-out;}\n");
      out.write("    .txt_btn a:hover {border:1px solid rgba(53,60,79,0) !important; box-shadow:rgba(53,60,79,1.0) 0 80px 0 2px inset; color:#fff !important; transition:all 0.3s ease-out;}\n");
      out.write("    .txt_btns {display:block; padding:5px 0 0 0; text-align:center;}\n");
      out.write("    .txt_btns a {display:inline-block; height:30px; margin:5px 10px 0 0; padding:0 15px; font-size:13px; text-align:center; text-decoration:none !important; line-height:28px; border:1px solid #ebeaef; border-radius:50px; box-shadow:rgba(53,60,79,0) 0 0 0 2px inset; background:#fff; color:rgba(53,60,79,1.0) !important; transition:all 0.3s ease-out;}\n");
      out.write("    .txt_btns a:last-child {margin-right:0;}\n");
      out.write("    .txt_btns a:hover {border:1px solid rgba(53,60,79,0) !important; box-shadow:rgba(53,60,79,1.0) 0 80px 0 2px inset; color:#fff !important; transition:all 0.3s ease-out;}\n");
      out.write("    .searchTextInTable{display: inline-block; color: #fa5151}\n");
      out.write("    .spliter_line{position: relative; width:100%; height: 16px;}\n");
      out.write("    .spliter_color{background-color: #f5f6f8; position: absolute; z-index: 99999; top:4px; left:-16px; width:240px; height: 8px;}\n");
      out.write("</style>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
