package pack1;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
//import javax.servlet.annotation.WebListener;
//@WebListener
public class RequestListener implements ServletRequestListener,ServletRequestAttributeListener 
{
	public void requestInitialized(ServletRequestEvent sre)
	{
		System.out.println("request object initialized");
		
	}
	public void ContextDestroyed(ServletRequestEvent sre)
	{
		System.out.println("requset object destroyed");
	}
	public void attributeAdded(ServletRequestAttributeEvent srae)
	{
		System.out.println("Attribute Added to the ServletRequset object");
		String name=srae.getName();
		System.out.println("Attribute name:"+name);
	}
	public void attributeRemoved(ServletRequestAttributeEvent srae)
	{
		System.out.println("Attribute Removed from ServletRequset object");
	}

	}


