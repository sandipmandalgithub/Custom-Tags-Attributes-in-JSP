package com.customtag;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		
		
		try {
			
			JspWriter out=pageContext.getOut();
			out.println("<h2>Creating my First Custom Tag</h2>");
			out.println(new Date().toString());
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		return SKIP_BODY;
		
		
		
		
	}
	

}

/**TLD File Code in JSP | Tag Library Descriptor File Schema
 ===========================================================================================================================================================================================================================
  If you are create custom tag in jsp then you have to create tld file where you have to provide information of tags. 
  if you are creating tld file then you have to add starting code schema with taglib tag.

TLD File code – Tag library Descriptor
=============================================================================================================================================================================================================================
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE taglib PUBLIC "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.2//EN" "http://java.sun.com/dtd/web-jsptaglibrary_1_2.dtd">
<taglib>

	<tlib-version>1.0</tlib-version>
	<jsp-version>2.0</jsp-version>
	<short-name>testing</short-name>
	<uri>http://www.tomcat-demo.com/testing</uri>
	<description>This is a demonstration tag library</description>

	<tag>
		<name>greet</name>
		<tag-class>tag.Welcome</tag-class>
	</tag>

	<tag>
		<name>demo</name>
		<tag-class>tag.Demo</tag-class>
	</tag>

</taglib>
 */























