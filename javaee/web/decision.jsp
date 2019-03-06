<%!
int day = 3;
%>
    
        <title>IF....ELSEExample</title>
    
        <%if (day == 1 | day == 7) { %>        
        <p>Today is weekend</p>
        <% } else { %>
        <p>Today is not weekend</p>
        <% } %>
