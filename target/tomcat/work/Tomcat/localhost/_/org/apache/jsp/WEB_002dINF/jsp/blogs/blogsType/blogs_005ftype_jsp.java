/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-21 13:35:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.blogs.blogsType;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blogs_005ftype_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/themes/icon.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/demo.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/easyui/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t    $(function(){\r\n");
      out.write("\t    \t$('#dg').datagrid({\r\n");
      out.write("\t\t        //url:'datagrid-data.json',\r\n");
      out.write("\t\t        url:'/blogs/blogsType/query',\r\n");
      out.write("\t\t        fit:true,\r\n");
      out.write("\t\t        striped:true,\r\n");
      out.write("\t\t        pagination:true,\r\n");
      out.write("\t\t        rownumbers:true,\r\n");
      out.write("\t\t        singleSelect:true,\r\n");
      out.write("\t\t        toolbar: '#tb',\r\n");
      out.write("\t\t    \trowStyler: function(index,row){\r\n");
      out.write("\t\t    \t\tif (row.unitcost>80){\r\n");
      out.write("\t\t    \t\t\treturn 'background-color:#6293BB;color:#fff;'; // return inline style\r\n");
      out.write("\t\t    \t\t\t// the function can return predefined css class and inline style\r\n");
      out.write("\t\t    \t\t\t// return {class:'r1', style:{'color:#fff'}};\t\r\n");
      out.write("\t\t    \t\t}\r\n");
      out.write("\t\t    \t},\r\n");
      out.write("\t\t        columns:[[\r\n");
      out.write("\t\t            {checkbox:true,field:''},\r\n");
      out.write("\t\t    \t\t{field:'typeId',title:'类型编号',width:100},\r\n");
      out.write("\t\t    \t\t{field:'blogsTypeName',title:'平台名称',width:100,editor:'textbox'},\r\n");
      out.write("\t\t    \t\t{field:'createTime',title:'创建时间',width:200\t\r\n");
      out.write("\t\t    \t\t\t,formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\t\tif (row.createTime!= null){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar d = new Date(row.createTime);\r\n");
      out.write("\t\t\t\t\t\t\t\treturn d.toLocaleString();\r\n");
      out.write("\t\t\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\t}}\r\n");
      out.write("\t\t        ]]\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    \t$('#dg').datagrid({\r\n");
      out.write("\t    \t\tonDblClickRow:function(rowIndex, rowData){\r\n");
      out.write("\t    \t\t\t//alert(rowIndex+\" \"+rowData.username)\r\n");
      out.write("\t    \t\t\t// $(\"#dg\").datagrid(\"beginEdit\",rowIndex);\r\n");
      out.write("\t    \t\t}\r\n");
      out.write("\t    \t});\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    \t// 页面加载完成后关闭窗口\r\n");
      out.write("\t    \t$(\"#win\").window(\"close\");\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    });\r\n");
      out.write("\t    var index = -1;\r\n");
      out.write("\t    // 进入编辑状态\r\n");
      out.write("\t    function goUpdate(){\r\n");
      out.write("\t    \t// 获取选中的行 getSelected\r\n");
      out.write("\t    \tvar row = $(\"#dg\").datagrid(\"getSelected\");\r\n");
      out.write("\t    \tif(row != null){\r\n");
      out.write("\t    \t\t// 将index对应的行关闭编辑状态\r\n");
      out.write("\t    \t\t$(\"#dg\").datagrid(\"endEdit\",index);\r\n");
      out.write("\t    \t\t// 获取row对应的index\r\n");
      out.write("\t\t    \tindex = $(\"#dg\").datagrid(\"getRowIndex\",row);\r\n");
      out.write("\t\t    \t// 进入编辑状态\r\n");
      out.write("\t\t    \t$(\"#dg\").datagrid(\"beginEdit\",index);\r\n");
      out.write("\t    \t}else{\r\n");
      out.write("\t    \t\t$.messager.alert('操作错误','请勾选要修改的行记录');\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    }\r\n");
      out.write("\t    // 保存修改的数据\r\n");
      out.write("\t    function saveUpdate(){\r\n");
      out.write("\t    \t// 获取选中的行 getSelected\r\n");
      out.write("\t    \tvar row = $(\"#dg\").datagrid(\"getSelected\");\r\n");
      out.write("\t    \tif(row != null){\r\n");
      out.write("\t    \t\t// 获取row对应的index\r\n");
      out.write("\t\t    \tindex = $(\"#dg\").datagrid(\"getRowIndex\",row);\r\n");
      out.write("\t\t    \t// 结束编辑状态\r\n");
      out.write("\t\t    \t$(\"#dg\").datagrid(\"endEdit\",index);\r\n");
      out.write("\t\t    \t// 将修改的数据提交到服务器修改数据库中的数据\r\n");
      out.write("\t\t    \tconsole.log(row);\r\n");
      out.write("\t\t    \t$.get(\"userServlet?task=update\"\r\n");
      out.write("\t\t    \t\t\t\t,{\"id\":row.id\r\n");
      out.write("\t\t    \t\t\t\t\t,\"username\":row.username\r\n");
      out.write("\t\t    \t\t\t\t\t,\"password\":row.password\r\n");
      out.write("\t\t    \t\t\t\t\t,\"age\":row.age\r\n");
      out.write("\t\t    \t\t\t\t\t,\"address\":row.address}\r\n");
      out.write("\t\t\t\t    \t\t,function(msg){\r\n");
      out.write("\t\t\t\t    \t\t\t//alert(msg);\r\n");
      out.write("\t\t\t\t    \t\t\t// 刷新页面\r\n");
      out.write("\t\t\t\t    \t\t\t$(\"#dg\").datagrid(\"reload\");\r\n");
      out.write("\t\t\t\t    \t\t}\r\n");
      out.write("\t\t\t\t    \t);\r\n");
      out.write("\t    \t}else{\r\n");
      out.write("\t    \t\t$.messager.alert('操作错误','请勾选要修改的行记录');\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t    function deleteUser(){\r\n");
      out.write("\t    \t// 获取选中的行 getSelected\r\n");
      out.write("\t    \tvar row = $(\"#dg\").datagrid(\"getSelected\");\r\n");
      out.write("\t    \tif(row != null){\r\n");
      out.write("\t    \t\t$.messager.confirm('确认框','你要确定删除这条记录?',function(r){\r\n");
      out.write("\t    \t\t    if (r){\r\n");
      out.write("\t    \t\t    \t$.get(\"userServlet?task=delete\",{\"id\":row.id},function(msg){\r\n");
      out.write("\t    \t    \t\t\t// 刷新页面\r\n");
      out.write("\t    \t    \t\t\t$(\"#dg\").datagrid(\"reload\");\r\n");
      out.write("\t    \t    \t\t});\r\n");
      out.write("\t    \t\t    }\r\n");
      out.write("\t    \t\t});\r\n");
      out.write("\t    \t\t\r\n");
      out.write("\t    \t}else{\r\n");
      out.write("\t    \t\t$.messager.alert('操作错误','请勾选要删除的行记录');\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t    function openWindow(){\r\n");
      out.write("\t    \t$(\"#win\").window(\"open\");\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t    function submitForm(){\r\n");
      out.write("\t\t\t$('#ff').form('submit', {\r\n");
      out.write("\t\t\t    url:\"userServlet?task=add\",\r\n");
      out.write("\t\t\t    success:function(data){\r\n");
      out.write("\t\t\t    \t// 清空表单\r\n");
      out.write("\t\t\t    \t$('#ff').form('clear');\r\n");
      out.write("\t\t\t    \t// 关闭窗口\r\n");
      out.write("\t\t\t    \t$(\"#win\").window(\"close\");\r\n");
      out.write("\t\t\t    \t// 刷新页面\r\n");
      out.write("\t    \t\t\t$(\"#dg\").datagrid(\"reload\");\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction clearForm(){\r\n");
      out.write("\t\t\t$('#ff').form('clear');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t    function qq(value,name){\r\n");
      out.write("\t        alert(value+\":\"+name)\r\n");
      out.write("\t    }\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"border: 0px;\">\r\n");
      out.write("\t<div id=\"tb\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"openWindow()\"\r\n");
      out.write("\t\t\tdata-options=\"iconCls:'icon-add',plain:true\">添加</a>\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"goUpdate()\"\r\n");
      out.write("\t\t\tdata-options=\"iconCls:'icon-edit',plain:true\">修改</a>\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"saveUpdate()\"\r\n");
      out.write("\t\t\tdata-options=\"iconCls:'icon-save',plain:true\">保存</a>\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"deleteUser()\"\r\n");
      out.write("\t\t\tdata-options=\"iconCls:'icon-remove',plain:true\">删除</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<input id=\"ss\" class=\"easyui-searchbox\" style=\"width:300px;height: 26px;\"\r\n");
      out.write("    \t\tdata-options=\"searcher:qq,prompt:'Please Input Value'\"></input>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table id=\"dg\"></table>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"win\" class=\"easyui-window\" title=\"添加用户\" \r\n");
      out.write("\t\tstyle=\"width:450px;height:360px;text-align: center;\"\r\n");
      out.write("        data-options=\"iconCls:'icon-save',modal:true,minimizable:false,maximizable:false\">\r\n");
      out.write("        <div style=\"width:400px; padding-top: 30px;padding-left: 30px;\">\r\n");
      out.write("\t\t\t<form id=\"ff\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div style=\"margin-bottom:20px\">\r\n");
      out.write("\t\t\t\t\t<input class=\"easyui-textbox\" name=\"username\" \r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:100%\" data-options=\"label:'账号:',required:true\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"margin-bottom:20px\">\r\n");
      out.write("\t\t\t\t\t<input class=\"easyui-textbox\" name=\"password\" \r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:100%\" data-options=\"label:'密码:',required:true\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"margin-bottom:20px\">\r\n");
      out.write("\t\t\t\t\t<input class=\"easyui-textbox\" name=\"age\" \r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:100%\" data-options=\"label:'年龄:'\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"margin-bottom:20px\">\r\n");
      out.write("\t\t\t\t\t<input class=\"easyui-textbox\" name=\"address\" \r\n");
      out.write("\t\t\t\t\t\tstyle=\"width:100%\" data-options=\"label:'地址:'\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<div style=\"text-align:center;padding:5px 0\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"submitForm()\" style=\"width:80px\">添加用户</a>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"clearForm()\" style=\"width:80px\">清空</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
