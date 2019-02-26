//package com.example.watchme.configuration;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//@Component
//@Order(1)
//public class CustomFilter implements Filter {
//	 @Autowired
//	 SessionScope session;
//	public CustomFilter() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		System.out.println("filter enter");
//		
//		// TODO Auto-generated method stub
//		 HttpServletRequest req = (HttpServletRequest) request;
//	     HttpServletResponse res = (HttpServletResponse) response;
//	     String token = req.getHeader("token");
//	   
//	        ///////////
//	        
//	  
//
//	        
//	        
//	        //////////
//	        
//	        
//	        String url = req.getRequestURI().toString();
//           
//		       
////	        if(url.equals("/authenticate")!=true)
////	        {
////	       try { 
////	    	   
////	    	   String token = req.getHeader("token");
////	    	   System.out.println("token from header " +token);
////	    	   System.out.println("token from session "+ session.getToken().toString());
////
////	       
//////       
//////      
////        	if (token_valid(session.getToken().toString(),token)) {
////        		System.out.println("token valid");
//////        		
////        	}
////        	else {
////        		System.out.println("token not valid");
////        		((HttpServletResponse) response).sendRedirect("https://www.google.com/");
////        	}
////        }
//////        
//////			
////		 catch (Exception e) {
////			System.out.println("erruer");
////    		((HttpServletResponse) response).sendRedirect("http://localhost:4200/#/auth/login");
////
////		}
////	}
//	        if(url.equals("/authenticate")!=true)
//	        {
//	      
//	    	   
//	    	   System.out.println("token from header " +token);
//	    	   System.out.println("token from session "+ session.getToken().toString());
//
//	       
////       
////      
//        	if (token_valid(session.getToken().toString(),token)) {
//        		System.out.println("token valid");
////        		
//        	}
//        	else {
//        		System.out.println("token not valid");
//        		((HttpServletResponse) response).sendRedirect("https://www.google.com/");
//        	}
//        }
////        
////			
//		
//	
//	        
//	    
//	        
//	
//	        
////	        
//	        System.out.println(req.getHeader("token"));
//	        
//	        	
//	        chain.doFilter(request, response);
//	        
//	}
//	public boolean token_valid(String token,String sessionToken) {
//		if(token.equals(sessionToken))
//				return true;
//		return false;
//		
//	}
//
//}
