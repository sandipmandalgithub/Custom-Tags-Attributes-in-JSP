package com.customtag;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTableTag extends TagSupport {
	public int number;
	public String color;
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	@Override
	public int doStartTag() throws JspException {
		
		try {
			
			JspWriter out=pageContext.getOut();
			
			out.println("<div style='color: "+color+"'>");
			
			out.println("<h2>Table of "+number+"</h2>");
			
			for(int i=1;i<=10;i++)
			{
				out.println((i*number)+"<br>");
			}
			
			out.println("</div>");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		return SKIP_BODY;
	}

}
