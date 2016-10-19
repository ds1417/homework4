import java.util.*;
 import java.io.*;
   class A02{
              void input(){
	                                  Scanner s = new Scanner(System.in);
					                              System.out.print("kor:");
								                                  int kor = s.nextInt();
												                              System.out.print("eng:");
															                                  int eng = s.nextInt();
																			                              System.out.print("math:");
																						                                  int math = s.nextInt();
																										                              int total = kor+eng+math;
																													                                 double avg = (double)total/3.0;
																																	                            print("total : " + "   " + total );
																																				                                print("avg : " + "   " + avg );
																																								                               }
																																											          void print(String str){
																																												               System.out.println(str);
																																													                      }
																																															            public static void main(String [] args) throws IOException{
																																																                  new A02().input();
																																																		                                         }
																																																							                            }
