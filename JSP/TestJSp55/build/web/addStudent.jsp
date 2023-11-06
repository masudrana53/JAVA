<jsp:useBean class="model.Student"  id="s" />
<jsp:setProperty  name="s" property="*" />
<%@page  import="dao.StudentDao" %>

<% 
int result=StudentDao.saveStudent(s);

if(result>0){
    response.sendRedirect("showAllStudent.jsp");
    
    }
    else{
    
    response.sendRedirect("error.jsp");
    
    }


%>