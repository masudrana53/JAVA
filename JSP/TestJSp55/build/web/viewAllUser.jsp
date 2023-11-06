<%@include file="header.jsp" %>

<%@taglib prefix="hasan" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@page import="dao.UserDao"%>


<%  
    List<User> userList = UserDao.getAllUser();
    request.setAttribute("userList", userList);
    
    int counter = 1; // Initialize a counter variable

    // Iterate over the list of students
    for (User user : userList) {
        user.setSequence(counter++);
    }
    
%>  


<div class="container my-3 py-2">
    <div class="bg-success text-center">
        <h1 class="jumborton">All User</h1>
    </div>

    <table class="table table-striped mb-3">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Full Name</th>
                <th scope="col">User Name</th>
                <th scope="col">Password</th>
                <th scope="col">Email</th>
                <th scope="col">Action</th>
            </tr>
        </thead>

        <tbody>
            <hasan:forEach items="${userList}" var="u">

                <tr>
                    <td>${u.getSequence()}</td>
                    <td>${u.getFullName()}</td>
                    <td>${u.getUserName()}</td>
                    <td>${u.getPassword()}</td>
                    <td>${u.getEmail()}</td>
                    <td>
<!--                        <a  class="btn btn-primary" href="editForm.jsp?hasan=${s.getId()}" >Edit</a>
                        <a  class="btn btn-warning" href="delete.jsp?id=${s.getId()}">Delete</a>-->
                    </td>

                </tr>               
            </hasan:forEach>            
        </tbody>

    </table>

</div>

<div class="mb-3">

</div>


<%@include file="footer.jsp" %>