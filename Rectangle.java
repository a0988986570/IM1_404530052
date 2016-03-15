  package main;
    class RectangleTester {
    	double height,
    	       width,
    	       area,
    	       perimeter,
    	       x,
		       y;
		
    	RectangleTester(){
    		}       
    	
		
    	RectangleTester(double height,double width,double x,double y)
    	{
    		this.height = height;
            this.width = width;
            this.x = x;
            this.y = y;    	
    	}
    	
		
		double getheight(){
    		return this.height;
    	}
    	double getwidth(){
    		return this.width;
    	}
    	double getx(){
    		return this.x;
    	}
    	double gety(){
    		return this.y;
    	}
    	
    	public String toString(){
    		return "java.Rectangle[X=" +this.x+ "," +"Y=" +this.y+ "," +"Width=" +this.width+ "," +"Height" +this.height+"]" ;                
    	}
    }
    	public  class Rectangle {
    		public static void  main(String[] args) {
    	
    				 RectangleTester Rectangle1 = new RectangleTester(18,57,15,25);
    	             RectangleTester Rectangle2 = new RectangleTester(47,60,12,0);
    	
    	             
    	             System.out.println(Rectangle1.toString());   	             
    	             System.out.println("area=" + Rectangle1.getwidth() * Rectangle1.getheight());
    	             System.out.println("Perimeter=" + (Rectangle1.getwidth() +Rectangle1.getheight()) * 2 );
    	             System.out.println(Rectangle2.toString());
    	             System.out.println("area=" + Rectangle2.getwidth() * Rectangle2.getheight());
    	             System.out.println("Perimeter=" + (Rectangle2.getwidth() +Rectangle2.getheight()) * 2 );
    	             
    	             
    	             System.out.println("End of Output!");
    	             
    			 }
    	
    	
    	
    	
    	}    	
    	
    	
    	
    	
    	
    	


