package com.sneha.demo.database;

import java.util.HashMap;
import java.util.Map;

import com.sneha.demo.model.Customer;

public class DatabaseClass {

		private static Map<Long,Customer> employees = new HashMap<>();

		public static Map<Long, Customer> getData() {
			return employees;
		}
		
		
		
	}


