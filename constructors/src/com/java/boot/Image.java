package com.java.boot;

public class Image {
      public String name;
      public int noofImage;
      public int type;
      public float pixel;
      public String through;
      public boolean clear;
      public double capturedDate;
      public long capturedYear;
      public String fileName;
      public int noofFiles;
      
      public Image(String arg1) {
    	  name=arg1;
      }
      public Image(int arg1) {
    	  noofImage =arg1;
      }
      public Image(float arg3) {
    	  pixel=arg3;
      }
      public Image(double arg3) {
    	  capturedDate =arg3;
      }
      public Image(String arg1,int arg5) {
    	  name=arg1;
    	  type=arg5;
      }
      public Image(boolean arg5) {
    	  clear=arg5;
      }
      public Image(String arg1, boolean arg5) {
    	  name=arg1;
    	  clear=arg5;
      }
      public Image(String arg1,String arg6) {
    	  name=arg1;
    	  fileName=arg6;
      }
      public Image(float arg4,boolean arg7) {
    	  pixel=arg4;
    	  clear=arg7;
      }
      public Image(int arg1,float arg6) {
    	  noofImage=arg1;
    	  pixel=arg6;
      }
      
      
      public void show() {
    	  System.out.println("image name:"+name);
    	  System.out.println("image noofImage :"+noofImage);
    	  System.out.println("image type:"+type);
    	  System.out.println("image pixel:"+pixel);
    	  System.out.println("image through:"+through);
    	  System.out.println("image clear:"+clear);
    	  System.out.println("image capturedDate:"+capturedDate);
    	  System.out.println("image capturedYear:"+capturedYear);
    	  System.out.println("image fileName:"+fileName);
    	  System.out.println("image noofFiles:"+noofFiles);
      }
      
      
}
