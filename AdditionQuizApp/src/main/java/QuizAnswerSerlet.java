package com.quizapp;

// import classes for the servlet.
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// defines the servlet class QuizAnswerServlet 
public class QuizAnswerServlet extends HttpServlet {
    
    // override the doGet method when a GET request is made to servlet.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        // set the content type of the response to text/html
        res.setContentType("text/html");
        
        // creates a an object to write output to the client (browser).
        PrintWriter out = res.getWriter();
        
        // initialize a count to zero
        int count = 0;

        // retrieves values entered by the user from the JSP form using the request object
        int first = Integer.parseInt(req.getParameter("one").trim());
        int second = Integer.parseInt(req.getParameter("two").trim());
        int third = Integer.parseInt(req.getParameter("three").trim());
        int fourth = Integer.parseInt(req.getParameter("four").trim());
        int fifth = Integer.parseInt(req.getParameter("five").trim());
        int sixth = Integer.parseInt(req.getParameter("six").trim());
        int seventh = Integer.parseInt(req.getParameter("seven").trim());
        int eighth = Integer.parseInt(req.getParameter("eight").trim());

        // compares each parsed value to the correct answer. if the answer is correct, increases the count
        if(27 - 9 == first) count++;
        if(24 - 8 == second) count++;
        if(28 - 5 == third) count++;
        if(20 - 12 == fourth) count++;
        if(26 - 6 == fifth) count++;
        if(20 - 6 == sixth) count++;
        if(29 - 7 == seventh) count++;
        if(29 - 8 == eighth) count++;

        // starts constructing the html response that will be sent back to the browser.
        out.println("<html><body>");
        
        // for each question, print the user's answer and check whether it's correct or wrong.
        out.println("27 - 9 = " + first + (27 - 9 == first ? " Correct" : " Wrong") + "<br>");
        out.println("24 - 8 = " + second + (24 - 8 == second ? " Correct" : " Wrong") + "<br>");
        out.println("28 - 5 = " + third + (28 - 5 == third ? " Correct" : " Wrong") + "<br>");
        out.println("20 - 12 = " + fourth + (20 - 12 == fourth ? " Correct" : " Wrong") + "<br>");
        out.println("26 - 6 = " + fifth + (26 - 6 == fifth ? " Correct" : " Wrong") + "<br>");
        out.println("20 - 6 = " + sixth + (20 - 6 == sixth ? " Correct" : " Wrong") + "<br>");
        out.println("29 - 7 = " + seventh + (29 - 7 == seventh ? " Correct" : " Wrong") + "<br>");
        out.println("29 - 8 = " + eighth + (29 - 8 == eighth ? " Correct" : " Wrong") + "<br>");
        
        // prints the total count of correct answers.
        out.println("Total correct answers: " + count);
        
        // closes the html
        out.println("</body></html>");

        // closes the printwriter which will send the constructed HTML to the browser.
        out.close();
    }
}

