public String oneTwo(String str) { String t=""; if(str.length()<3) return "";  for(int i=0;i<str.length()-2;i=i+3)  {  t+=str.substring(i+1,i+3)+str.charAt(i);  } return t; }