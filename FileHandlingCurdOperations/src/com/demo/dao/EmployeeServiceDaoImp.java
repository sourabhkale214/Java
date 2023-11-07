package com.demo.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeServiceDaoImp implements EmployeeServiceDao {
	static List<Employee> elist;
	static {
		elist=new ArrayList<>();
	}
	

		


			
			@Override
			public void ReadFromFile() {
				try(BufferedReader bis=new BufferedReader(new FileReader("emp.txt"));){
				String str=bis.readLine();		
				while(str!=null) {
					String[] strarr=str.split(",");
					Employee e=new Employee(Integer.parseInt(strarr[0]),strarr[1],strarr[2]);
					elist.add(e);
					str=bis.readLine();
				}
					
					
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("size :" +elist.size());

			
		}






			@Override
			public void save(Employee e1) {
				elist.add(e1);
				
			}






			@Override
			public List<Employee> FindAll() {
				return elist;
			}






			@Override
			public boolean deleteById(int id) {
				return elist.remove(new Employee(id,null,null));
			}






			@Override
			public void writetofile() {
				
				try(BufferedWriter bos=new BufferedWriter(new FileWriter("emp.txt"));) {
					
					
					for(Employee e:elist) {
						System.out.println(e);
						bos.write(e.getId()+","+e.getName()+","+e.getMobnum()+"\n");
					   
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
			}

		
		
	}


