import java.util.*;
 import java.io.*;
   class A03{
              void input(){
	                     Scanner s = new Scanner(System.in);
			                    System.out.print("Input Gigabytes: ");
					                   int gigabytes = s.nextInt();
							                  int megabytes = gigabytes*1024;
									                 int kilobytes = megabytes*1024;
											                long bytes = (long)kilobytes*1024;
													                                                                                                      
																									                  print("megabytes : " + megabytes);
																											              print("kilobytes : " + kilobytes);
																												                  print("bytes : " + bytes);
																														                    }
																																             void print(String str){
																																	                             System.out.println(str);
																																				                                }
																																								       public static void main(String [] args) throws IOException{
																																								             
																																									                             new A03().input();
																																												                            }
																																															                 }
