package com.java.boot;

public class Message {
        public int type;
        public int texts;
        public String from;
        public String to;
        public boolean sent;
        
        public Message(String arg4){
        	from=arg4;
        }
        public Message(String arg4,int arg5){
        	from=arg4;
        	texts=arg5;
        }
        public Message(String arg4,boolean arg6){
        	from=arg4;
        	sent=arg6;
        }
        public Message(int arg4){
        	texts=arg4;
        }
        public Message(boolean arg6){
        	sent=arg6;
        }
        
        public void show() {
        	System.out.println("message type:"+type);
        	System.out.println("message texts:"+texts);
        	System.out.println("message from:"+from);
        	System.out.println("message to:"+to);
        	System.out.println("message sent:"+sent);
        }
}
