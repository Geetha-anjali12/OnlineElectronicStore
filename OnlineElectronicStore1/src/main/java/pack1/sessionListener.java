package pack1;

//import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
//@WebListener
public class sessionListener implements HttpSessionListener,HttpSessionAttributeListener
{
public void sessionCreated(HttpSessionEvent hse)
{
	System.out.println("session object created");
}
public void sessionDestroyed(HttpSessionEvent hse)
{
	System.out.println("session object destroyed");
}
public void attibuteAdded(HttpSessionBindingEvent hsbe)
{
	System.out.println("session attribute added");
}
public void attibuteRemoved(HttpSessionBindingEvent hsbe)
{
	System.out.println("session attribute removed");
}
}
