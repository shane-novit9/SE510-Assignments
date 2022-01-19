package homework4.problem1;

import java.util.ArrayList;

public class FBBDriver {
	public static void main(String args[]) {
		   BlogSource bs = new PgSQLBlogSource("postgres.blog");
		   FancyBlogBrowser fbb = new FancyBlogBrowser();
		   fbb.setBlogSource(bs);
		   fbb.begin();
		   bs = new MySQLBlogSource("mysql.db");
		   fbb.setBlogSource(bs);
		   fbb.begin();
		   bs = new CsvBlogSource("csvDb.blog");
		   fbb.setBlogSource(bs);
		   fbb.begin();
	}
}

class PgSQLBlogSource implements BlogSource {
	private String url;
	PgSQLBlogSource(String url) {
		this.url = url;
	}
	@Override
	public String getType() {
		return "PgSQL";
	}
	  
	public ArrayList<Blog> getBlog() {
		System.out.println("Getting " + this.getType() + " blogs from " + this.url + "\n");
		ArrayList<Blog> list = new ArrayList<Blog>();
		list.add(new Blog("PG10", "Chem Dept", "John", "Best Department"));
		list.add(new Blog("PG11", "Bio Dept", "George", "Need more beakers please."));
		list.add(new Blog("PG12", "CS Dept", "Paul", "Love the new monitors!"));
		list.add(new Blog("PG13", "Engineering Dept", "Maria", "I suck a trusses."));
		list.add(new Blog("PG14", "Math Dept", "Carl", "Wish I didn't have to get my own calculator."));
		list.add(new Blog("PG15", "Business Dept", "Sam", "It's a bull's market out there."));
		return list;
	}
}

class MySQLBlogSource implements BlogSource {
   private String url;
   MySQLBlogSource(String url) {
		this.url = url;
   }
   @Override
   public String getType() {
      return "MySQL";
   }
  
   public ArrayList<Blog> getBlog() {
	  System.out.println("Getting " + this.getType() + " blogs from " + this.url + "\n");
      ArrayList<Blog> list = new ArrayList<Blog>();
      list.add(new Blog("MS10", "Chem Dept", "John", "Best Department"));
      list.add(new Blog("MS11", "Bio Dept", "George", "Need more beakers please."));
      list.add(new Blog("MS12", "CS Dept", "Paul", "Love the new monitors!"));
      list.add(new Blog("MS13", "Engineering Dept", "Maria", "I suck a trusses."));
      list.add(new Blog("MS14", "Math Dept", "Carl", "Wish I didn't have to get my own calculator."));
      list.add(new Blog("MS15", "Business Dept", "Sam", "It's a bull's market out there."));
      return list;
   }
}

class CsvBlogSource implements BlogSource {
	private String url;
	public CsvBlogSource(String url) {
		this.url = url;
	} 
	@Override
    public String getType() {
       return "CSV";
    }

   public ArrayList<Blog> getBlog() {
	  System.out.println("Getting " + this.getType() + " blogs from " + this.url + "\n");
      ArrayList<Blog> list = new ArrayList<Blog>();
      list.add(new Blog("CS10", "CMPS Dept", "John", "Best Department"));
      list.add(new Blog("CS11", "Math Dept", "George", "great Department"));
      list.add(new Blog("CS12", "CS Dept", "Paul", "Love the new monitors!"));
      list.add(new Blog("CS13", "Engineering Dept", "Maria", "I suck a trusses."));
      list.add(new Blog("CS14", "Math Dept", "Carl", "Wish I didn't have to get my own calculator."));
      list.add(new Blog("CS15", "Business Dept", "Sam", "It's a bull's market out there."));
      return list;
   }
}
