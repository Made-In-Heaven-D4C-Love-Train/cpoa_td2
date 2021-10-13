package cpoa_td3;


import cpoa_td1.Client;


public class Normalisation {
    Client client = new Client( 1, 0, "54800", null, null, null, "Paris", "France");
    Client client2 = new Client( 1, 0, "57000", null, null, null, "letzebuerg", "letzebuerg");
    String Pays = client2.getPays() ;
    String codepost = client.getCode_postal() ;
    String ville = client.getVille();
      
    public static String upperCaseFirst(String val) {
          char[] arr = val.toCharArray();
          arr[0] = Character.toUpperCase(arr[0]);
          return new String(arr);
       }
    
   


    public static String Normpays(String Pays) {
        Pays =  Pays.toLowerCase();
        Pays =  Pays.trim() ;
        if( Pays.equals("letzebuerg"))
        {
            return "Luxembourg" ;
            
        } else if ( Pays.equals("belgium"))
        {
            return "Belgique" ;
        } else if((Pays.equals("switzerland")) || (Pays.equals("schweiz")))
        {
            return "Suisse" ;
        }
        else {
            Pays = upperCaseFirst(Pays);
            return Pays ;
        }
        
}
    public static String Normcodepost(String codepost) {
        codepost.trim() ;
        String res = "" ;
        for (int i = 0; i <= codepost.length()-1; i++) {
            switch (codepost.substring(i,i+1)) {

            case "0" :
                res = res + "0" ;
                break;

            case "1" :
                res = res + "1" ;
                break;
                
            case "2" :
                res = res + "2" ;
                break;

            case "3" :
                res = res + "3" ;
                break;
                
            case "4" :
                res = res + "4" ;
                break;

            case "5" :
                res = res + "5" ;
                break;
                
            case "6" :
                res = res + "6" ;
                break;

            case "7" :
                res = res + "7" ;
                break;
                
            case "8" :
                res = res + "8" ;
                break;

            case "9" :
                res = res + "9" ;
                break;

            }  ;
            }
        while (res.length()<5) 
        {res = "0" + res ;}
       return res ;
    }
    
    public static String Normville(String ville) {
        ville =  ville.trim();
        ville = ville.replace(" ", "-");
        ville = ville.toLowerCase();
        
        
        
       if(ville.contains("ste-") || ville.contains("st-") || ville.contains("le-") || ville.contains("-le-") || ville.contains("-les-") ||  
    		   ville.contains("-lès-")  || ville.contains("-sous-")
    	 || ville.contains("-sur-") || ville.contains("-a-") || 
    	 ville.contains("-à-")|| ville.contains("-aux-") || 
    	 ville.contains("-la-") || ville.contains("-en-") || ville.contains("-et-") 
    	 || ville.contains("-notre-")) {
    	  
    	   String[] splitArray = null;
    	   ville = ville.toLowerCase();
    	  splitArray = ville.split("-");
    	 
    	   for(int i = 0; i< splitArray.length;i++){
    		  
    		   if(i!=splitArray.length-1) {
    			splitArray[i] = splitArray[i].concat("-");
    		  }
    		   if(splitArray[i].equals("st-")) {
    			   splitArray[i] = "Saint-";
    			   ville = ville.concat(splitArray[i]);
    		   }
    		   
    		   else if(splitArray[i].equals("ste-")) {
    			   splitArray[i] = "Sainte-";
    			   ville = ville.concat(splitArray[i]);
    		   }
    		   else if(splitArray[i].equals("les-")) {
    			   splitArray[i] = "lès-";
    			   ville  = ville.concat(splitArray[i]);
    		   }
    		   else if(splitArray[i].equals("a-")) {
    			   splitArray[i] = "à-";
    			   ville  = ville.concat(splitArray[i]);
    		   }
    		   
    		   else if(!splitArray[i].equals("le-") && !splitArray[i].equals("lès-") && !splitArray[i].equals("sous-") 
    		 && !splitArray[i].equals("sur-") && !splitArray[i].equals("aux-") && !splitArray[i].equals("à-") && 
    		 !splitArray[i].equals("la-") && !splitArray[i].equals("en-") && !splitArray[i].equals("et-")) {
    			 
    			  
    			   String a = splitArray[i];
    			   a = upperCaseFirst(a);
    			   ville = ville.concat(a);
    			   
    			   
    		   }else {
    			 ville  = ville.concat(splitArray[i]); 
    			 
    		   }
    		  }
    	   int longueur = ville.length();
    	   if(longueur%2 !=0) {
    		   longueur = Math.floorDiv(longueur, 2)-1;
        	   ville = ville.substring(longueur);
        	   ville = upperCaseFirst(ville);
        	   return ville;
    	   }else{
    	   longueur = Math.floorDiv(longueur, 2);
    	   ville = ville.substring(longueur);
    	   ville = upperCaseFirst(ville);
    	   return ville;
    	   }
    	   }
       ville = upperCaseFirst(ville);
	return ville;
       
        
        
    }
    
    public static String Normvoie(String voie) {
    	voie = voie.trim();
    	voie = voie.toLowerCase();
    	String[] splitArray2 = null;
    	splitArray2 = voie.split(" ");
    	
    	for(int i = 0; i< splitArray2.length;i++){
    		
    		if(testInt(splitArray2[i])) {
    			String str2 = "";
    			 str2 = str2.concat(" ");
    			 splitArray2[i] = str2.concat(splitArray2[i]);
    			splitArray2[i] = splitArray2[i].concat(",");
    		}
    		if(i!=splitArray2.length-1) {
    			splitArray2[i] = splitArray2[i].concat(" ");
    		  }
    		 
    		
    		
    	}
    	
    	
    
    	
    	if(voie.contains(" boul ") || voie.contains(" boul. ") || voie.contains(" bd ") || voie.contains(" faub. ") || voie.contains(" fg ")
    			|| voie.contains(" av. ") || voie.contains(" pl. ")  ) {
    	   	String[] splitArray = null;
        	splitArray = voie.split(" ");
        	for(int i = 0; i< splitArray.length;i++){
        		
        		if(i!=splitArray.length-1) {
        			splitArray[i] = splitArray[i].concat(" ");
        		  }
        		
        		if(splitArray[i].equals("boul ")) {
  
     			   voie = voie.replace("boul", "boulevard");
     		   }
        		else if(splitArray[i].equals("boul. ")) {
        			voie = voie.replace("boul.", "boulevard");
        		}
        		else if(splitArray[i].equals("bd ")) {
        			voie = voie.replace("bd", "boulevard");
        		}
        		else if(splitArray[i].equals("faub. ")) {
      			  voie = voie.replace("faub.", "faubourg");
      		   }
        		else if(splitArray[i].equals("fg ")) {
        			voie = voie.replace("fg", "faubourg");
        		}
        		else if(splitArray[i].equals("av. ")) {
       			   voie = voie.replace("av.", "avenue");
       		   }
        		else if(splitArray[i].equals("pl. ")) {
        			  voie = voie.replace("pl.", "place");
        		   }
        		else {
        			
        		}
        	}
   
        	
           
     	   }
          
            
            
            String[] splitArray5 = null;
        	splitArray5 = voie.split(" ");
        
        	voie = "";
        	for(int i = 0; i< splitArray5.length;i++){
        	
        		
        		
        		
        		if(testInt(splitArray5[i])) {
        		
        			voie = splitArray5[i].trim();
        			voie = splitArray5[i].concat(",");
        			i++;
     			
        			}
        		voie = voie.concat(" ");
        		voie = voie.concat(splitArray5[i]);
        			
        		}
        	
        	voie = voie.trim();
        	
         
       	   return voie; 
        	
    	
    	
    
	  
    }
    public static boolean testInt(String str) {
		
    	try {
    		int test = Integer.parseInt(str);
    		return true;
    	}catch(Exception e) {
    		return false;
    	}
    	
    }
    
}