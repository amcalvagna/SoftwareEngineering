package ex1;

import java.util.Date;

public class News {
   private String content;
   private Date currentDate;
   public News(String content, Date currentDate) {
	  this.content = content;
	  this.currentDate = currentDate;
   }
   public String getContent() {
	  return content;
   }
   public Date getCurrentDate() {
	  return currentDate;
   }  
}
