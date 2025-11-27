package IPLTeam;

import java.util.ArrayList;
import java.util.List;

public class TOPFOURIPLTEAMSOF2025 {
	
     public static void main(String [] args) {
			
			List<IPL2025 > TMI = new ArrayList<>();
			 System.out.println("#Playing 11 of Team Mumbai Indians->");
			
			    TMI.add(new IPL2025("Mumbai Indians", 45,  "Rohit Sharma",      500, 0));
		        TMI.add(new IPL2025("Mumbai Indians",  7 ,  "Jonny Bairstow",     400, 0));
		        TMI.add(new IPL2025("Mumbai Indians", 63,  "Suryakumar Yadav",   600, 0));
		        TMI.add(new IPL2025("Mumbai Indians", 42,  "Tilak Varma",        450, 0));
		        TMI.add(new IPL2025("Mumbai Indians",  33 ,  "Hardik Pandya",      350, 5));
		        TMI.add(new IPL2025("Mumbai Indians", 40 ,  "Naman Dhir",         300, 0));
		        TMI.add(new IPL2025("Mumbai Indians", 92,  "Mitchell Santner",   200, 8));
		        TMI.add(new IPL2025("Mumbai Indians", 18,  "Raj Bawa",           150, 2));
		        TMI.add(new IPL2025("Mumbai Indians", 99,  "Trent Boult",        50, 15));
		        TMI.add(new IPL2025("Mumbai Indians", 93,  "Jasprit Bumrah",     20, 20));
		        TMI.add(new IPL2025("Mumbai Indians", 20,  "Reece Topley",       10, 12));
	         
	         
	         
	         for(IPL2025 P :TMI) {
	        	 System.out.println(P);
	         }
	        	 
	        System.out.println();
	        System.out.println("#Main Batter In MI ->");
	        
	           for(IPL2025 P :TMI) {
	        	 if(P.getRuns() >400)
	        	 System.out.println(P);
	           }
	           
	           System.out.println();
	           System.out.println("#Bowlers With More Wickets Than 10 ->");
	           
	           for(IPL2025 P : TMI){
	        	   if(P.getWikets()>10)
	        		   System.out.println(P);
	           }
	           
	           System.out.println();
	           System.out.println("#All Rounders->");
	           
	           
	           for(IPL2025 P : TMI) {
	        	   if(P.getRuns() > 200 && P.getWikets() > 10) {
	        		   System.out.println("All-rounder: " + P);
	        	   }
	           }
	           
	          

	        	    System.out.println();
	        	    System.out.println("#Plyaers Whose Name Starts With T");
	          
	           
	           for(IPL2025 P : TMI) {
	              if(P.getName().startsWith("T")) 
					   System.out.println(P);
	           }
	           
	           System.out.println();
	           System.out.println("#Plyaers Whose Name Ends With a");
	           
	           for(IPL2025 P : TMI) {
	        	   
	         	  if(P.getName().endsWith("a")) 
	 				   System.out.println(P);
	            }
	           
	           System.out.println();
	           System.out.println("#Plyaers Whose Name Contains s character");
	           
	           for(IPL2025 P : TMI) {
	        	   
	          	  if(P.getName().contains("s"))
	  				   System.out.println(P);
	             }
	           
	           System.out.println();
	           System.out.println("#Main Bowler In MI ->");
	           
	           for(IPL2025 P : TMI) {
	        	   if(P.getWikets()>15)
	        		   System.out.println(P);
	           }
	           System.out.println();
	           
//	           Runner-Up of 2025
	           
	           List<IPL2025 > TPK = new ArrayList<>();
	           System.out.println("#Playing 11 of Team Punjab Kings->");
	            TPK.add(new IPL2025("Punjab Kings", 18, "Priyansh Arya", 500, 0));
	            TPK.add(new IPL2025("Punjab Kings", 27, "Josh Inglis", 450, 0));
	            TPK.add(new IPL2025("Punjab Kings", 17, "Shreyas Iyer", 600, 0));
	            TPK.add(new IPL2025("Punjab Kings", 12, "Nehal Wadhera", 400, 0));
	            TPK.add(new IPL2025("Punjab Kings", 5, "Shashank Singh", 350, 5));
	            TPK.add(new IPL2025("Punjab Kings", 55, "Marcus Stoinis", 300, 10));
	            TPK.add(new IPL2025("Punjab Kings", 44, "Azmatullah Omarzai", 280, 8));
	            TPK.add(new IPL2025("Punjab Kings", 90, "Kyle Jamieson", 200, 12));
	            TPK.add(new IPL2025("Punjab Kings", 32, "Vijaykumar Vyshak", 100, 15));
	            TPK.add(new IPL2025("Punjab Kings", 93, "Arshdeep Singh", 50, 20));
	            
	           for(IPL2025 P2 :TPK) {
		        	 System.out.println(P2);
		         }
	           
	           
	           System.out.println();
		        System.out.println("#Main Batter In PK ->");
		        
		           for(IPL2025 P2 :TPK) {
		        	 if(P2.getRuns() >400)
		        	 System.out.println(P2);
		           }
		           
		           System.out.println();
		           System.out.println("#Bowlers With More Wickets Than 10 ->");
		           
		           for(IPL2025 P2 : TPK){
		        	   if(P2.getWikets()>10)
		        		   System.out.println(P2);
		           }
		           
		           System.out.println();
		           System.out.println("#All Rounders->");
		           
		           for(IPL2025 P2 : TPK) {
		        	   if(P2.getRuns() > 200 && P2.getWikets() > 10) {
		        		   System.out.println("All-rounder: " + P2);
		        	   }
		           }
		           System.out.println();
	        	    System.out.println("#Plyaers Whose Name Starts With S");
	          
	           
	           for(IPL2025 P2 : TPK) {
	              if(P2.getName().startsWith("S")) 
					   System.out.println(P2);
	           }
	           
	           System.out.println();
	           System.out.println("#Plyaers Whose Name Ends With a");
	           
	           for(IPL2025 P2 : TPK) {
	        	   
	         	  if(P2.getName().endsWith("a")) 
	 				   System.out.println(P2);
	            }
	           
	           System.out.println();
	           System.out.println("#Plyaers Whose Name Contains s character");
	           
	           for(IPL2025 P2 : TPK) {
	        	   
	          	  if(P2.getName().contains("i"))
	  				   System.out.println(P2);
	             }
	           
	           System.out.println();
	           System.out.println("#Main Bowler In PK ->");
	           
	           for(IPL2025 P2 : TMI) {
	        	   if(P2.getWikets()>20)
	        		   System.out.println(P2);
	           }
	           System.out.println();
	           
	           
	           
	           List<IPL2025 > TRCB = new ArrayList<>();
	           System.out.println("#Playing 11 of Team Punjab Kings->");
	            TRCB.add(new IPL2025("RCB", 18, "Virat Kohli", 600, 0));
	            TRCB.add(new IPL2025("RCB", 28, "Phil Salt", 450, 0));
	            TRCB.add(new IPL2025("RCB", 97, "Rajat Patidar", 500, 0));
	            TRCB.add(new IPL2025("RCB", 23, "Liam Livingstone", 300, 5));
	            TRCB.add(new IPL2025("RCB", 55, "Jitesh Sharma", 200, 0));
	            TRCB.add(new IPL2025("RCB", 48, "Romario Shepherd", 150, 8));
	            TRCB.add(new IPL2025("RCB", 25, "Krunal Pandya", 250, 10));
	            TRCB.add(new IPL2025("RCB", 15, "Bhuvneshwar Kumar", 30, 20));
	            TRCB.add(new IPL2025("RCB", 103, "Yash Dayal", 20, 15));
	            TRCB.add(new IPL2025("RCB", 38, "Josh Hazlewood", 10, 18));
	            TRCB.add(new IPL2025("RCB", 12, "Suyash Sharma", 50, 12));
	            
	            
	            for(IPL2025 P3 :TRCB) {
		        	 System.out.println(P3);
		         }
	           
	           
	           System.out.println();
		        System.out.println("#Main Batter In TRCB ->");
		        
		           for(IPL2025 T3 :TRCB) {
		        	 if(T3.getRuns() >400)
		        	 System.out.println(T3);
		           }
		           
		           System.out.println();
		           System.out.println("#Bowlers With More Wickets Than 10 ->");
		           
		           for(IPL2025 T3 : TRCB){
		        	   if(T3.getWikets()>10)
		        		   System.out.println(T3);
		           }
		           
		           System.out.println();
		           System.out.println("#All Rounders->");
		           
		           for(IPL2025 T3 : TRCB) {
		        	   if(T3.getRuns() > 200 && T3.getWikets() > 10) {
		        		   System.out.println("All-rounder: " + T3);
		        	   }
		           }
		           System.out.println();
	        	    System.out.println("#Plyaers Whose Name Starts With S");
	          
	           
	           for(IPL2025 T3 :TRCB) {
	              if(T3.getName().startsWith("S")) 
					   System.out.println(T3);
	           }
	           
	           System.out.println();
	           System.out.println("#Plyaers Whose Name Ends With a");
	           
	           for(IPL2025 T3 : TRCB) {
	        	   
	         	  if(T3.getName().endsWith("a")) 
	 				   System.out.println(T3);
	            }
	           
	           System.out.println();
	           System.out.println("#Plyaers Whose Name Contains V character");
	           
	           for(IPL2025 T3 : TRCB) {
	        	   
	          	  if(T3.getName().contains("V"))
	  				   System.out.println(T3);
	             }
	           
	           System.out.println();
	           System.out.println("#Main Bowler In RCB ->");
	           
	           for(IPL2025 T3 : TRCB) {
	        	   if(T3.getWikets()>15)
	        		   System.out.println(T3);
	           }
	           System.out.println();
	           
	           
	           List<IPL2025 > TGT = new ArrayList<>();
	           System.out.println("#Playing 11 of Team Gujarat Titans->");
	           
	           TGT.add(new IPL2025("Gujarat Titans",  7,  "Shubman Gill",      600, 0));
	           TGT.add(new IPL2025("Gujarat Titans", 63,  "Jos Buttler",       550, 0));
	           TGT.add(new IPL2025("Gujarat Titans",  5,  "Sai Sudharsan",     700, 0));
	           TGT.add(new IPL2025("Gujarat Titans", 27,  "Rahul Tewatia",     300, 10));
	           TGT.add(new IPL2025("Gujarat Titans", 18,  "Shahrukh Khan",     400, 5));
	           TGT.add(new IPL2025("Gujarat Titans",  9,  "Glenn Phillips",    350, 8));
	           TGT.add(new IPL2025("Gujarat Titans",  4,  "Washington Sundar", 250, 12));
	           TGT.add(new IPL2025("Gujarat Titans", 24,  "Rashid Khan",       200, 20));
	           TGT.add(new IPL2025("Gujarat Titans", 25,  "Kagiso Rabada",     50, 15));
	           TGT.add(new IPL2025("Gujarat Titans", 11,  "Mohammed Siraj",    30, 18));
	           TGT.add(new IPL2025("Gujarat Titans", 29,  "Prasidh Krishna",   20, 25));
	           
	           
	           for(IPL2025 T4:TGT) {
		        	 System.out.println(T4);
		         }
	           
	           
	           System.out.println();
		        System.out.println("#Main Batter In TGT ->");
		        
		           for(IPL2025 T4 :TGT) {
		        	 if(T4.getRuns() >400)
		        	 System.out.println(T4);
		           }
		           
		           System.out.println();
		           System.out.println("#Bowlers With More Wickets Than 10 ->");
		           
		           for(IPL2025 T4 : TGT){
		        	   if(T4.getWikets()>10)
		        		   System.out.println(T4);
		           }
		           
		           System.out.println();
		           System.out.println("#All Rounders->");
		           
		           for(IPL2025 T4 : TGT) {
		        	   if(T4.getRuns() > 200 && T4.getWikets() > 10) {
		        		   System.out.println("All-rounder: " + T4);
		        	   }
		           }
		           System.out.println();
	        	    System.out.println("#Plyaers Whose Name Starts With S");
	          
	           
	           for(IPL2025 T4 :TGT) {
	              if(T4.getName().startsWith("S")) 
					   System.out.println(T4);
	           }
	           
	           System.out.println();
	           System.out.println("#Plyaers Whose Name Ends With a");
	           
	           for(IPL2025 T4 : TGT) {
	        	   
	         	  if(T4.getName().endsWith("a")) 
	 				   System.out.println(T4);
	            }
	           
	           System.out.println();
	           System.out.println("#Plyaers Whose Name Contains V character");
	           
	           for(IPL2025 T4 : TGT) {
	        	   
	          	  if(T4.getName().contains("V"))
	  				   System.out.println(T4);
	             }
	           
	           System.out.println();
	           System.out.println("#Main Bowler In GT ->");
	           
	           for(IPL2025 T4 : TGT) {
	        	   if(T4.getWikets()>15)
	        		   System.out.println(T4);
	           }
	           
     }
     
}

	           

	           
	           
	           
	           
	           
	         
		           
		           
	           

	           
	           
	           
	  
	 
	        	
	        	 
	         


		

	



