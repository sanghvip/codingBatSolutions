public boolean stringE(String str) { char a[]=str.toCharArray(); int t=0; for(int i=0;i<a.length;i++)  {  if(a[i]=='e')  t++;  } return (t>=1 && t<=3);  }